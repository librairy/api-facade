/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package es.upm.oeg.librairy.api.facade.model.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DocumentsRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DocumentsRequest\",\"namespace\":\"es.upm.oeg.librairy.api.facade.model.avro\",\"fields\":[{\"name\":\"contactEmail\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"dataSource\",\"type\":{\"type\":\"record\",\"name\":\"DataSource\",\"fields\":[{\"name\":\"url\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"format\",\"type\":{\"type\":\"enum\",\"name\":\"ReaderFormat\",\"symbols\":[\"SOLR_CORE\",\"CSV\",\"CSV_TAR_GZ\",\"JSONL\",\"JSONL_TAR_GZ\",\"PDF\",\"DOC\",\"TXT\"]}},{\"name\":\"filter\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"size\",\"type\":\"long\",\"default\":-1},{\"name\":\"offset\",\"type\":\"long\",\"default\":0},{\"name\":\"cache\",\"type\":\"boolean\",\"default\":false},{\"name\":\"credentials\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Credentials\",\"fields\":[{\"name\":\"user\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"password\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"dataFields\",\"type\":{\"type\":\"record\",\"name\":\"DataFields\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"labels\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"text\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"extra\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]}]}}]}},{\"name\":\"dataSink\",\"type\":{\"type\":\"record\",\"name\":\"DataSink\",\"fields\":[{\"name\":\"url\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"format\",\"type\":{\"type\":\"enum\",\"name\":\"WriterFormat\",\"symbols\":[\"SOLR_CORE\"]}},{\"name\":\"credentials\",\"type\":[\"null\",\"Credentials\"],\"default\":null}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String contactEmail;
   private es.upm.oeg.librairy.api.facade.model.avro.DataSource dataSource;
   private es.upm.oeg.librairy.api.facade.model.avro.DataSink dataSink;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public DocumentsRequest() {}

  /**
   * All-args constructor.
   */
  public DocumentsRequest(java.lang.String contactEmail, es.upm.oeg.librairy.api.facade.model.avro.DataSource dataSource, es.upm.oeg.librairy.api.facade.model.avro.DataSink dataSink) {
    this.contactEmail = contactEmail;
    this.dataSource = dataSource;
    this.dataSink = dataSink;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return contactEmail;
    case 1: return dataSource;
    case 2: return dataSink;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: contactEmail = (java.lang.String)value$; break;
    case 1: dataSource = (es.upm.oeg.librairy.api.facade.model.avro.DataSource)value$; break;
    case 2: dataSink = (es.upm.oeg.librairy.api.facade.model.avro.DataSink)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'contactEmail' field.
   */
  public java.lang.String getContactEmail() {
    return contactEmail;
  }

  /**
   * Sets the value of the 'contactEmail' field.
   * @param value the value to set.
   */
  public void setContactEmail(java.lang.String value) {
    this.contactEmail = value;
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

  /**
   * Gets the value of the 'dataSink' field.
   */
  public es.upm.oeg.librairy.api.facade.model.avro.DataSink getDataSink() {
    return dataSink;
  }

  /**
   * Sets the value of the 'dataSink' field.
   * @param value the value to set.
   */
  public void setDataSink(es.upm.oeg.librairy.api.facade.model.avro.DataSink value) {
    this.dataSink = value;
  }

  /** Creates a new DocumentsRequest RecordBuilder */
  public static es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest.Builder newBuilder() {
    return new es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest.Builder();
  }
  
  /** Creates a new DocumentsRequest RecordBuilder by copying an existing Builder */
  public static es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest.Builder newBuilder(es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest.Builder other) {
    return new es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest.Builder(other);
  }
  
  /** Creates a new DocumentsRequest RecordBuilder by copying an existing DocumentsRequest instance */
  public static es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest.Builder newBuilder(es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest other) {
    return new es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest.Builder(other);
  }
  
  /**
   * RecordBuilder for DocumentsRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DocumentsRequest>
    implements org.apache.avro.data.RecordBuilder<DocumentsRequest> {

    private java.lang.String contactEmail;
    private es.upm.oeg.librairy.api.facade.model.avro.DataSource dataSource;
    private es.upm.oeg.librairy.api.facade.model.avro.DataSink dataSink;

    /** Creates a new Builder */
    private Builder() {
      super(es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.contactEmail)) {
        this.contactEmail = data().deepCopy(fields()[0].schema(), other.contactEmail);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.dataSource)) {
        this.dataSource = data().deepCopy(fields()[1].schema(), other.dataSource);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.dataSink)) {
        this.dataSink = data().deepCopy(fields()[2].schema(), other.dataSink);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing DocumentsRequest instance */
    private Builder(es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest other) {
            super(es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest.SCHEMA$);
      if (isValidValue(fields()[0], other.contactEmail)) {
        this.contactEmail = data().deepCopy(fields()[0].schema(), other.contactEmail);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.dataSource)) {
        this.dataSource = data().deepCopy(fields()[1].schema(), other.dataSource);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.dataSink)) {
        this.dataSink = data().deepCopy(fields()[2].schema(), other.dataSink);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'contactEmail' field */
    public java.lang.String getContactEmail() {
      return contactEmail;
    }
    
    /** Sets the value of the 'contactEmail' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest.Builder setContactEmail(java.lang.String value) {
      validate(fields()[0], value);
      this.contactEmail = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'contactEmail' field has been set */
    public boolean hasContactEmail() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'contactEmail' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest.Builder clearContactEmail() {
      contactEmail = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'dataSource' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSource getDataSource() {
      return dataSource;
    }
    
    /** Sets the value of the 'dataSource' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest.Builder setDataSource(es.upm.oeg.librairy.api.facade.model.avro.DataSource value) {
      validate(fields()[1], value);
      this.dataSource = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'dataSource' field has been set */
    public boolean hasDataSource() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'dataSource' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest.Builder clearDataSource() {
      dataSource = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'dataSink' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataSink getDataSink() {
      return dataSink;
    }
    
    /** Sets the value of the 'dataSink' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest.Builder setDataSink(es.upm.oeg.librairy.api.facade.model.avro.DataSink value) {
      validate(fields()[2], value);
      this.dataSink = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'dataSink' field has been set */
    public boolean hasDataSink() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'dataSink' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DocumentsRequest.Builder clearDataSink() {
      dataSink = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public DocumentsRequest build() {
      try {
        DocumentsRequest record = new DocumentsRequest();
        record.contactEmail = fieldSetFlags()[0] ? this.contactEmail : (java.lang.String) defaultValue(fields()[0]);
        record.dataSource = fieldSetFlags()[1] ? this.dataSource : (es.upm.oeg.librairy.api.facade.model.avro.DataSource) defaultValue(fields()[1]);
        record.dataSink = fieldSetFlags()[2] ? this.dataSink : (es.upm.oeg.librairy.api.facade.model.avro.DataSink) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
