package com.truyenfull.query.repository;

import com.truyenfull.query.model.Category;
import com.truyenfull.query.model.Comic;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public interface ComicRepository extends JpaRepository<Comic, Long>{

	List<Comic> findAllByCategories(Category category, Pageable pageable);

	List<Comic> findByStatus(String status, Pageable pageable);

	Comic findByUrlName(String urlName);

	@Transactional
	@Modifying
	@Query(value = "UPDATE Comic c SET c.views = ?1 WHERE c.id = ?2")
	void updateViews(Long views, Long id);

}
