/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.truyenfull.lib;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-11-17")
public class PageInfo implements org.apache.thrift.TBase<PageInfo, PageInfo._Fields>, java.io.Serializable, Cloneable, Comparable<PageInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PageInfo");

  private static final org.apache.thrift.protocol.TField PAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("page", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MAX_PAGE_ITEMS_FIELD_DESC = new org.apache.thrift.protocol.TField("maxPageItems", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PageInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PageInfoTupleSchemeFactory();

  public int page; // required
  public int maxPageItems; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PAGE((short)1, "page"),
    MAX_PAGE_ITEMS((short)2, "maxPageItems");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PAGE
          return PAGE;
        case 2: // MAX_PAGE_ITEMS
          return MAX_PAGE_ITEMS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PAGE_ISSET_ID = 0;
  private static final int __MAXPAGEITEMS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PAGE, new org.apache.thrift.meta_data.FieldMetaData("page", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MAX_PAGE_ITEMS, new org.apache.thrift.meta_data.FieldMetaData("maxPageItems", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PageInfo.class, metaDataMap);
  }

  public PageInfo() {
  }

  public PageInfo(
    int page,
    int maxPageItems)
  {
    this();
    this.page = page;
    setPageIsSet(true);
    this.maxPageItems = maxPageItems;
    setMaxPageItemsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PageInfo(PageInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.page = other.page;
    this.maxPageItems = other.maxPageItems;
  }

  public PageInfo deepCopy() {
    return new PageInfo(this);
  }

  @Override
  public void clear() {
    setPageIsSet(false);
    this.page = 0;
    setMaxPageItemsIsSet(false);
    this.maxPageItems = 0;
  }

  public int getPage() {
    return this.page;
  }

  public PageInfo setPage(int page) {
    this.page = page;
    setPageIsSet(true);
    return this;
  }

  public void unsetPage() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PAGE_ISSET_ID);
  }

  /** Returns true if field page is set (has been assigned a value) and false otherwise */
  public boolean isSetPage() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PAGE_ISSET_ID);
  }

  public void setPageIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PAGE_ISSET_ID, value);
  }

  public int getMaxPageItems() {
    return this.maxPageItems;
  }

  public PageInfo setMaxPageItems(int maxPageItems) {
    this.maxPageItems = maxPageItems;
    setMaxPageItemsIsSet(true);
    return this;
  }

  public void unsetMaxPageItems() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MAXPAGEITEMS_ISSET_ID);
  }

  /** Returns true if field maxPageItems is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxPageItems() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MAXPAGEITEMS_ISSET_ID);
  }

  public void setMaxPageItemsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MAXPAGEITEMS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PAGE:
      if (value == null) {
        unsetPage();
      } else {
        setPage((Integer)value);
      }
      break;

    case MAX_PAGE_ITEMS:
      if (value == null) {
        unsetMaxPageItems();
      } else {
        setMaxPageItems((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PAGE:
      return getPage();

    case MAX_PAGE_ITEMS:
      return getMaxPageItems();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PAGE:
      return isSetPage();
    case MAX_PAGE_ITEMS:
      return isSetMaxPageItems();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PageInfo)
      return this.equals((PageInfo)that);
    return false;
  }

  public boolean equals(PageInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_page = true;
    boolean that_present_page = true;
    if (this_present_page || that_present_page) {
      if (!(this_present_page && that_present_page))
        return false;
      if (this.page != that.page)
        return false;
    }

    boolean this_present_maxPageItems = true;
    boolean that_present_maxPageItems = true;
    if (this_present_maxPageItems || that_present_maxPageItems) {
      if (!(this_present_maxPageItems && that_present_maxPageItems))
        return false;
      if (this.maxPageItems != that.maxPageItems)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + page;

    hashCode = hashCode * 8191 + maxPageItems;

    return hashCode;
  }

  @Override
  public int compareTo(PageInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPage()).compareTo(other.isSetPage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.page, other.page);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxPageItems()).compareTo(other.isSetMaxPageItems());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxPageItems()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxPageItems, other.maxPageItems);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PageInfo(");
    boolean first = true;

    sb.append("page:");
    sb.append(this.page);
    first = false;
    if (!first) sb.append(", ");
    sb.append("maxPageItems:");
    sb.append(this.maxPageItems);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PageInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PageInfoStandardScheme getScheme() {
      return new PageInfoStandardScheme();
    }
  }

  private static class PageInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<PageInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PageInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.page = iprot.readI32();
              struct.setPageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MAX_PAGE_ITEMS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.maxPageItems = iprot.readI32();
              struct.setMaxPageItemsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PageInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PAGE_FIELD_DESC);
      oprot.writeI32(struct.page);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MAX_PAGE_ITEMS_FIELD_DESC);
      oprot.writeI32(struct.maxPageItems);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PageInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PageInfoTupleScheme getScheme() {
      return new PageInfoTupleScheme();
    }
  }

  private static class PageInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<PageInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PageInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPage()) {
        optionals.set(0);
      }
      if (struct.isSetMaxPageItems()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetPage()) {
        oprot.writeI32(struct.page);
      }
      if (struct.isSetMaxPageItems()) {
        oprot.writeI32(struct.maxPageItems);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PageInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.page = iprot.readI32();
        struct.setPageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.maxPageItems = iprot.readI32();
        struct.setMaxPageItemsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
