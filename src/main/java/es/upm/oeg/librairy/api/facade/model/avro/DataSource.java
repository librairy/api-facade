/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package es.upm.oeg.librairy.api.facade.model.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DataSource extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataSource\",\"namespace\":\"es.upm.oeg.librairy.api.facade.model.avro\",\"fields\":[{\"name\":\"url\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"format\",\"type\":{\"type\":\"enum\",\"name\":\"ReaderFormat\",\"symbols\":[\"SOLR_CORE\",\"CSV\",\"CSV_TAR_GZ\",\"JSONL\",\"JSONL_TAR_GZ\"]}},{\"name\":\"filter\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"size\",\"type\":\"long\",\"default\":-1},{\"name\":\"offset\",\"type\":\"long\",\"default\":0},{\"name\":\"cache\",\"type\":\"boolean\",\"default\":false},{\"name\":\"credentials\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Credentials\",\"fields\":[{\"name\":\"user\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"password\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"apikey\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"dataFields\",\"type\":{\"type\":\"record\",\"name\":\"DataFields\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"labels\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"text\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"extra\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String url;
   private es.upm.oeg.librairy.api.facade.model.avro.ReaderFormat format;
   private java.lang.String filter;
   private long size;
   private long offset;
   private boolean cache;
   private es.upm.oeg.librairy.api.facade.model.avro.Credentials credentials;
   private es.upm.oeg.librairy.api.facade.model.avro.DataFields dataFields;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public DataSource() {}

  /**
   * All-args constructor.
   */
  public DataSource(java.lang.String url, es.upm.oeg.librairy.api.facade.model.avro.ReaderFormat format, java.lang.String filter, java.lang.Long size, java.lang.Long offset, java.lang.Boolean cache, es.upm.oeg.librairy.api.facade.model.avro.Credentials credentials, es.upm.oeg.librairy.api.facade.model.avro.DataFields dataFields) {
    this.url = url;
    this.format = format;
    this.filter = filter;
    this.size = size;
    this.offset = offset;
    this.cache = cache;
    this.credentials = credentials;
    this.dataFields = dataFields;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return url;
    case 1: return format;
    case 2: return filter;
    case 3: return size;
    case 4: return offset;
    case 5: return cache;
    case 6: return credentials;
    case 7: return dataFields;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: url = (java.lang.String)value$; break;
    case 1: format = (es.upm.oeg.librairy.api.facade.model.avro.ReaderFormat)value$; break;
    case 2: filter = (java.lang.String)value$; break;
    case 3: size = (java.lang.Long)value$; break;
    case 4: offset = (java.lang.Long)value$; break;
    case 5: cache = (java.lang.Boolean)value$; break;
    case 6: credentials = (es.upm.oeg.librairy.api.facade.model.avro.Credentials)value$; break;
    case 7: dataFields = (es.upm.oeg.librairy.api.facade.model.avro.DataFields)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'url' field.
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * Sets the value of the 'url' field.
   * @param value the value to set.
   */
  public void setUrl(java.lang.String value) {
    this.url = value;
  }

  /**
   * Gets the value of the 'format' field.
   */
  public es.upm.oeg.librairy.api.facade.model.avro.ReaderFormat getFormat() {
    return format;
  }

  /**
   * Sets the value of the 'format' field.
   * @param value the value to set.
   */
  public void setFormat(es.upm.oeg.librairy.api.facade.model.avro.ReaderFormat value) {
    this.format = value;
  }

  /**
   * Gets the value of the 'filter' field.
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Sets the value of the 'filter' field.
   * @param value the value to set.
   */
  public void setFilter(java.lang.String value) {
    this.filter = value;
  }

  /**
   * Gets the value of the 'size' field.
   */
  public java.lang.Long getSize() {
    return size;
  }

  /**
   * Sets the value of the 'size' field.
   * @param value the value to set.
   */
  public void setSize(java.lang.Long value) {
    this.size = value;
  }

  /**
   * Gets the value of the 'offset' field.
   */
  public java.lang.Long getOffset() {
    return offset;
  }

  /**
   * Sets the value of the 'offset' field.
   * @param value the value to set.
   */
  public void setOffset(java.lang.Long value) {
    this.offset = value;
  }

  /**
   * Gets the value of the 'cache' field.
   */
  public java.lang.Boolean getCache() {
    return cache;
  }

  /**
   * Sets the value of the 'cache' field.
   * @param value the value to set.
   */
  public void setCache(java.lang.Boolean value) {
    this.cache = value;
  }

  /**
   * Gets the value of the 'credentials' field.
   */
  public es.upm.oeg.librairy.api.facade.model.avro.Credentials getCredentials() {
    return credentials;
  }

  /**
   * Sets the value of the 'credentials' field.
   * @param value the value to set.
   */
  public void setCredentials(es.upm.oeg.librairy.api.facade.model.avro.Credentials value) {
    this.credentials = value;
  }

  /**
   * Gets the value of the 'dataFields' field.
   */
  public es.upm.oeg.librairy.api.facade.model.avro.DataFields getDataFields() {
    return dataFields;
  }

  /**
   * Sets the value of the 'dataFields' field.
   * @param value the value to set.
   */
  public void setDataFields(es.upm.oeg.librairy.api.facade.model.avro.DataFields value) {
    this.dataFields = value;
  }

  /** Creates a new DataSource RecordBuilder */
  public static es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder newBuilder() {
    return new es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder();
  }
  
  /** Creates a new DataSource RecordBuilder by copying an existing Builder */
  public static es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder newBuilder(es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder other) {
    return new es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder(other);
  }
  
  /** Creates a new DataSource RecordBuilder by copying an existing DataSource instance */
  public static es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder newBuilder(es.upm.oeg.librairy.api.facade.model.avro.DataSource other) {
    return new es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder(other);
  }
  
  /**
   * RecordBuilder for DataSource instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataSource>
    implements org.apache.avro.data.RecordBuilder<DataSource> {

    private java.lang.String url;
    private es.upm.oeg.librairy.api.facade.model.avro.ReaderFormat format;
    private java.lang.String filter;
    private long size;
    private long offset;
    private boolean cache;
    private es.upm.oeg.librairy.api.facade.model.avro.Credentials credentials;
    private es.upm.oeg.librairy.api.facade.model.avro.DataFields dataFields;

    /** Creates a new Builder */
    private Builder() {
      super(es.upm.oeg.librairy.api.facade.model.avro.DataSource.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.url)) {
        this.url = data().deepCopy(fields()[0].schema(), other.url);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.format)) {
        this.format = data().deepCopy(fields()[1].schema(), other.format);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.filter)) {
        this.filter = data().deepCopy(fields()[2].schema(), other.filter);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.size)) {
        this.size = data().deepCopy(fields()[3].schema(), other.size);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.offset)) {
        this.offset = data().deepCopy(fields()[4].schema(), other.offset);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.cache)) {
        this.cache = data().deepCopy(fields()[5].schema(), other.cache);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.credentials)) {
        this.credentials = data().deepCopy(fields()[6].schema(), other.credentials);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.dataFields)) {
        this.dataFields = data().deepCopy(fields()[7].schema(), other.dataFields);
        fieldSetFlags()[7] = true;
      }
    }
    
    /** Creates a Builder by copying an existing DataSource instance */
    private Builder(es.upm.oeg.librairy.api.facade.model.avro.DataSource other) {
            super(es.upm.oeg.librairy.api.facade.model.avro.DataSource.SCHEMA$);
      if (isValidValue(fields()[0], other.url)) {
        this.url = data().deepCopy(fields()[0].schema(), other.url);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.format)) {
        this.format = data().deepCopy(fields()[1].schema(), other.format);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.filter)) {
        this.filter = data().deepCopy(fields()[2].schema(), other.filter);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.size)) {
        this.size = data().deepCopy(fields()[3].schema(), other.size);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.offset)) {
        this.offset = data().deepCopy(fields()[4].schema(), other.offset);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.cache)) {
        this.cache = data().deepCopy(fields()[5].schema(), other.cache);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.credentials)) {
        this.credentials = data().deepCopy(fields()[6].schema(), other.credentials);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.dataFields)) {
        this.dataFields = data().deepCopy(fields()[7].schema(), other.dataFields);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the 'url' field */
    public java.lang.String getUrl() {
      return url;
    }
    
    /** Sets the value of the 'url' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder setUrl(java.lang.String value) {
      validate(fields()[0], value);
      this.url = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'url' field has been set */
    public boolean hasUrl() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'url' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder clearUrl() {
      url = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'format' field */
    public es.upm.oeg.librairy.api.facade.model.avro.ReaderFormat getFormat() {
      return format;
    }
    
    /** Sets the value of the 'format' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder setFormat(es.upm.oeg.librairy.api.facade.model.avro.ReaderFormat value) {
      validate(fields()[1], value);
      this.format = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'format' field has been set */
    public boolean hasFormat() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'format' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder clearFormat() {
      format = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'filter' field */
    public java.lang.String getFilter() {
      return filter;
    }
    
    /** Sets the value of the 'filter' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder setFilter(java.lang.String value) {
      validate(fields()[2], value);
      this.filter = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'filter' field has been set */
    public boolean hasFilter() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'filter' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder clearFilter() {
      filter = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'size' field */
    public java.lang.Long getSize() {
      return size;
    }
    
    /** Sets the value of the 'size' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder setSize(long value) {
      validate(fields()[3], value);
      this.size = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'size' field has been set */
    public boolean hasSize() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'size' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder clearSize() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'offset' field */
    public java.lang.Long getOffset() {
      return offset;
    }
    
    /** Sets the value of the 'offset' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder setOffset(long value) {
      validate(fields()[4], value);
      this.offset = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'offset' field has been set */
    public boolean hasOffset() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'offset' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder clearOffset() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'cache' field */
    public java.lang.Boolean getCache() {
      return cache;
    }
    
    /** Sets the value of the 'cache' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder setCache(boolean value) {
      validate(fields()[5], value);
      this.cache = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'cache' field has been set */
    public boolean hasCache() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'cache' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder clearCache() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'credentials' field */
    public es.upm.oeg.librairy.api.facade.model.avro.Credentials getCredentials() {
      return credentials;
    }
    
    /** Sets the value of the 'credentials' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder setCredentials(es.upm.oeg.librairy.api.facade.model.avro.Credentials value) {
      validate(fields()[6], value);
      this.credentials = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'credentials' field has been set */
    public boolean hasCredentials() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'credentials' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder clearCredentials() {
      credentials = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'dataFields' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataFields getDataFields() {
      return dataFields;
    }
    
    /** Sets the value of the 'dataFields' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder setDataFields(es.upm.oeg.librairy.api.facade.model.avro.DataFields value) {
      validate(fields()[7], value);
      this.dataFields = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'dataFields' field has been set */
    public boolean hasDataFields() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'dataFields' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource.Builder clearDataFields() {
      dataFields = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public DataSource build() {
      try {
        DataSource record = new DataSource();
        record.url = fieldSetFlags()[0] ? this.url : (java.lang.String) defaultValue(fields()[0]);
        record.format = fieldSetFlags()[1] ? this.format : (es.upm.oeg.librairy.api.facade.model.avro.ReaderFormat) defaultValue(fields()[1]);
        record.filter = fieldSetFlags()[2] ? this.filter : (java.lang.String) defaultValue(fields()[2]);
        record.size = fieldSetFlags()[3] ? this.size : (java.lang.Long) defaultValue(fields()[3]);
        record.offset = fieldSetFlags()[4] ? this.offset : (java.lang.Long) defaultValue(fields()[4]);
        record.cache = fieldSetFlags()[5] ? this.cache : (java.lang.Boolean) defaultValue(fields()[5]);
        record.credentials = fieldSetFlags()[6] ? this.credentials : (es.upm.oeg.librairy.api.facade.model.avro.Credentials) defaultValue(fields()[6]);
        record.dataFields = fieldSetFlags()[7] ? this.dataFields : (es.upm.oeg.librairy.api.facade.model.avro.DataFields) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
