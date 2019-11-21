package com.truyenfull.query.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.truyenfull.query.model.Author;
import com.truyenfull.query.model.Category;
import com.truyenfull.query.model.Chapter;
import com.truyenfull.query.model.Comic;
import com.truyenfull.query.repository.ChapterRepository;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class ResponseUtil {

	private static ObjectMapper mapper = new ObjectMapper();
	
	public static ObjectNode returnCategory(Category category) {
        ObjectNode node = mapper.createObjectNode();
        node.put("id", category.getId());
        node.put("name", category.getName());
        if (category.getComics() != null) {
        	List<String> comicTitles = new ArrayList<>();
            for (Comic comic: category.getComics()) {
            	comicTitles.add(comic.getTitle());
            }
            node.put("comics", comicTitles.toString());
		}
        return node;
    }

    public static ArrayNode returnListCategory(List<Category> categories) {
        ArrayNode arrayNode = mapper.createArrayNode();
        for (Category category : categories) {
        	ObjectNode node = mapper.createObjectNode();
            node.put("name", category.getName());
	        node.put("urlName", category.getUrlName());
	        arrayNode.add(node);
        }
        return arrayNode;
    }

    public static ObjectNode returnComic(Comic comic) {
        ObjectNode node = mapper.createObjectNode();
        node.put("id", comic.getId());
        node.put("title", comic.getTitle());
        node.put("description", comic.getDescription());
        node.put("status", comic.getStatus());
        node.put("rating", comic.getRating());
        node.put("views", comic.getViews());

        setCategoriesFieldForComic(comic, node);
        setAuthorsFieldForComic(comic, node);
        setChaptersFieldForComic(comic, node);

//        node.put("createAt", TimeUtil.toString(comic.getCreateAt()));
//        node.put("updateAt", TimeUtil.toString(comic.getUpdateAt()));
        return node;
    }

    public static ArrayNode returnListComicByCategory(List<Comic> comics) {
        ArrayNode arrayNode = mapper.createArrayNode();
        for (Comic comic: comics) {
            ObjectNode node = mapper.createObjectNode();
            node.put("title", comic.getTitle());
            node.put("urlName", comic.getUrlName());
            setAuthorsFieldForComic(comic, node);
            try {
                List<Chapter> chapters = comic.getChapters();
                node.put("lastChapterTitle", chapters.get(chapters.size() - 1).getTitle());
            } catch (Exception e){
                e.printStackTrace();
            }

            arrayNode.add(node);
        }
        return arrayNode;
    }

    public static ArrayNode returnListChaptersByComic(List<Chapter> chapters) {
        ArrayNode arrayNode = mapper.createArrayNode();
        for (Chapter chapter: chapters) {
            ObjectNode node = mapper.createObjectNode();
            node.put("title", chapter.getTitle());
            node.put("urlName", chapter.getUrlName());
            arrayNode.add(node);
        }
        return arrayNode;
    }

    private static void setAuthorsFieldForComic(Comic comic, ObjectNode node) {
        if (comic.getAuthors() != null) {
            ArrayNode arrayAuthor = mapper.createArrayNode();
            for (Author author: comic.getAuthors()) {
                ObjectNode categoryNode = mapper.createObjectNode();
                categoryNode.put("full-name", author.getFullName());
                arrayAuthor.add(categoryNode);
            }
            node.set("authors", arrayAuthor);
        }
    }

    private static void setCategoriesFieldForComic(Comic comic, ObjectNode node) {
        if (comic.getCategories() != null) {
            ArrayNode arrayCategory = mapper.createArrayNode();
            for (Category category: comic.getCategories()) {
                ObjectNode categoryNode = mapper.createObjectNode();
                categoryNode.put("name", category.getName());
                arrayCategory.add(categoryNode);
            }
            node.set("categories", arrayCategory);
        }
    }

    private static void setChaptersFieldForComic(Comic comic, ObjectNode node) {
        if (comic.getChapters() != null) {
            ArrayNode arrayChapter = mapper.createArrayNode();
            for (Chapter chapter: comic.getChapters()) {
                ObjectNode chapterNode = mapper.createObjectNode();
                chapterNode.put("title", chapter.getTitle());
                arrayChapter.add(chapterNode);
            }
            node.set("chapters", arrayChapter);
        }
    }
}