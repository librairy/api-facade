/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package es.upm.oeg.librairy.api.facade.model.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class SetRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SetRequest\",\"namespace\":\"es.upm.oeg.librairy.api.facade.model.avro\",\"fields\":[{\"name\":\"reference\",\"type\":{\"type\":\"record\",\"name\":\"Reference\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"text\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}},{\"name\":\"size\",\"type\":\"int\",\"default\":10},{\"name\":\"dataSource\",\"type\":{\"type\":\"record\",\"name\":\"DataSource\",\"fields\":[{\"name\":\"url\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"format\",\"type\":{\"type\":\"enum\",\"name\":\"ReaderFormat\",\"symbols\":[\"SOLR_CORE\",\"CSV\",\"CSV_TAR_GZ\",\"JSONL\",\"JSONL_TAR_GZ\"]}},{\"name\":\"filter\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"size\",\"type\":\"long\",\"default\":-1},{\"name\":\"offset\",\"type\":\"long\",\"default\":0},{\"name\":\"cache\",\"type\":\"boolean\",\"default\":false},{\"name\":\"credentials\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Credentials\",\"fields\":[{\"name\":\"user\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"password\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"apikey\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"dataFields\",\"type\":{\"type\":\"record\",\"name\":\"DataFields\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"labels\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"text\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]}]}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private es.upm.oeg.librairy.api.facade.model.avro.Reference reference;
   private int size;
   private es.upm.oeg.librairy.api.facade.model.avro.DataSource dataSource;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public SetRequest() {}

  /**
   * All-args constructor.
   */
  public SetRequest(es.upm.oeg.librairy.api.facade.model.avro.Reference reference, java.lang.Integer size, es.upm.oeg.librairy.api.facade.model.avro.DataSource dataSource) {
    this.reference = reference;
    this.size = size;
    this.dataSource = dataSource;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return reference;
    case 1: return size;
    case 2: return dataSource;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: reference = (es.upm.oeg.librairy.api.facade.model.avro.Reference)value$; break;
    case 1: size = (java.lang.Integer)value$; break;
    case 2: dataSource = (es.upm.oeg.librairy.api.facade.model.avro.DataSource)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'reference' field.
   */
  public es.upm.oeg.librairy.api.facade.model.avro.Reference getReference() {
    return reference;
  }

  /**
   * Sets the value of the 'reference' field.
   * @param value the value to set.
   */
  public void setReference(es.upm.oeg.librairy.api.facade.model.avro.Reference value) {
    this.reference = value;
  }

  /**
   * Gets the value of the 'size' field.
   */
  public java.lang.Integer getSize() {
    return size;
  }

  /**
   * Sets the value of the 'size' field.
   * @param value the value to set.
   */
  public void setSize(java.lang.Integer value) {
    this.size = value;
  }

  /**
   * Gets the value of the 'dataSource' field.
   */
  public es.upm.oeg.librairy.api.facade.model.avro.DataSource getDataSource() {
    return dataSource;
  }

  /**
   * Sets the value of the 'dataSource' field.
   * @param value the value to set.
   */
  public void setDataSource(es.upm.oeg.librairy.api.facade.model.avro.DataSource value) {
    this.dataSource = value;
  }

  /** Creates a new SetRequest RecordBuilder */
  public static es.upm.oeg.librairy.api.facade.model.avro.SetRequest.Builder newBuilder() {
    return new es.upm.oeg.librairy.api.facade.model.avro.SetRequest.Builder();
  }
  
  /** Creates a new SetRequest RecordBuilder by copying an existing Builder */
  public static es.upm.oeg.librairy.api.facade.model.avro.SetRequest.Builder newBuilder(es.upm.oeg.librairy.api.facade.model.avro.SetRequest.Builder other) {
    return new es.upm.oeg.librairy.api.facade.model.avro.SetRequest.Builder(other);
  }
  
  /** Creates a new SetRequest RecordBuilder by copying an existing SetRequest instance */
  public static es.upm.oeg.librairy.api.facade.model.avro.SetRequest.Builder newBuilder(es.upm.oeg.librairy.api.facade.model.avro.SetRequest other) {
    return new es.upm.oeg.librairy.api.facade.model.avro.SetRequest.Builder(other);
  }
  
  /**
   * RecordBuilder for SetRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SetRequest>
    implements org.apache.avro.data.RecordBuilder<SetRequest> {

    private es.upm.oeg.librairy.api.facade.model.avro.Reference reference;
    private int size;
    private es.upm.oeg.librairy.api.facade.model.avro.DataSource dataSource;

    /** Creates a new Builder */
    private Builder() {
      super(es.upm.oeg.librairy.api.facade.model.avro.SetRequest.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(es.upm.oeg.librairy.api.facade.model.avro.SetRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.reference)) {
        this.reference = data().deepCopy(fields()[0].schema(), other.reference);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.size)) {
        this.size = data().deepCopy(fields()[1].schema(), other.size);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.dataSource)) {
        this.dataSource = data().deepCopy(fields()[2].schema(), other.dataSource);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SetRequest instance */
    private Builder(es.upm.oeg.librairy.api.facade.model.avro.SetRequest other) {
            super(es.upm.oeg.librairy.api.facade.model.avro.SetRequest.SCHEMA$);
      if (isValidValue(fields()[0], other.reference)) {
        this.reference = data().deepCopy(fields()[0].schema(), other.reference);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.size)) {
        this.size = data().deepCopy(fields()[1].schema(), other.size);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.dataSource)) {
        this.dataSource = data().deepCopy(fields()[2].schema(), other.dataSource);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'reference' field */
    public es.upm.oeg.librairy.api.facade.model.avro.Reference getReference() {
      return reference;
    }
    
    /** Sets the value of the 'reference' field */
    public es.upm.oeg.librairy.api.facade.model.avro.SetRequest.Builder setReference(es.upm.oeg.librairy.api.facade.model.avro.Reference value) {
      validate(fields()[0], value);
      this.reference = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'reference' field has been set */
    public boolean hasReference() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'reference' field */
    public es.upm.oeg.librairy.api.facade.model.avro.SetRequest.Builder clearReference() {
      reference = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'size' field */
    public java.lang.Integer getSize() {
      return size;
    }
    
    /** Sets the value of the 'size' field */
    public es.upm.oeg.librairy.api.facade.model.avro.SetRequest.Builder setSize(int value) {
      validate(fields()[1], value);
      this.size = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'size' field has been set */
    public boolean hasSize() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'size' field */
    public es.upm.oeg.librairy.api.facade.model.avro.SetRequest.Builder clearSize() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'dataSource' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource getDataSource() {
      return dataSource;
    }
    
    /** Sets the value of the 'dataSource' field */
    public es.upm.oeg.librairy.api.facade.model.avro.SetRequest.Builder setDataSource(es.upm.oeg.librairy.api.facade.model.avro.DataSource value) {
      validate(fields()[2], value);
      this.dataSource = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'dataSource' field has been set */
    public boolean hasDataSource() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'dataSource' field */
    public es.upm.oeg.librairy.api.facade.model.avro.SetRequest.Builder clearDataSource() {
      dataSource = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public SetRequest build() {
      try {
        SetRequest record = new SetRequest();
        record.reference = fieldSetFlags()[0] ? this.reference : (es.upm.oeg.librairy.api.facade.model.avro.Reference) defaultValue(fields()[0]);
        record.size = fieldSetFlags()[1] ? this.size : (java.lang.Integer) defaultValue(fields()[1]);
        record.dataSource = fieldSetFlags()[2] ? this.dataSource : (es.upm.oeg.librairy.api.facade.model.avro.DataSource) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
