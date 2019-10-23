/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package es.upm.oeg.librairy.api.facade.model.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DataFields extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataFields\",\"namespace\":\"es.upm.oeg.librairy.api.facade.model.avro\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"labels\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"text\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"extra\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String id;
   private java.lang.String name;
   private java.util.List<java.lang.String> labels;
   private java.util.List<java.lang.String> text;
   private java.util.List<java.lang.String> extra;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public DataFields() {}

  /**
   * All-args constructor.
   */
  public DataFields(java.lang.String id, java.lang.String name, java.util.List<java.lang.String> labels, java.util.List<java.lang.String> text, java.util.List<java.lang.String> extra) {
    this.id = id;
    this.name = name;
    this.labels = labels;
    this.text = text;
    this.extra = extra;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return labels;
    case 3: return text;
    case 4: return extra;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: name = (java.lang.String)value$; break;
    case 2: labels = (java.util.List<java.lang.String>)value$; break;
    case 3: text = (java.util.List<java.lang.String>)value$; break;
    case 4: extra = (java.util.List<java.lang.String>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'labels' field.
   */
  public java.util.List<java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Sets the value of the 'labels' field.
   * @param value the value to set.
   */
  public void setLabels(java.util.List<java.lang.String> value) {
    this.labels = value;
  }

  /**
   * Gets the value of the 'text' field.
   */
  public java.util.List<java.lang.String> getText() {
    return text;
  }

  /**
   * Sets the value of the 'text' field.
   * @param value the value to set.
   */
  public void setText(java.util.List<java.lang.String> value) {
    this.text = value;
  }

  /**
   * Gets the value of the 'extra' field.
   */
  public java.util.List<java.lang.String> getExtra() {
    return extra;
  }

  /**
   * Sets the value of the 'extra' field.
   * @param value the value to set.
   */
  public void setExtra(java.util.List<java.lang.String> value) {
    this.extra = value;
  }

  /** Creates a new DataFields RecordBuilder */
  public static es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder newBuilder() {
    return new es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder();
  }
  
  /** Creates a new DataFields RecordBuilder by copying an existing Builder */
  public static es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder newBuilder(es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder other) {
    return new es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder(other);
  }
  
  /** Creates a new DataFields RecordBuilder by copying an existing DataFields instance */
  public static es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder newBuilder(es.upm.oeg.librairy.api.facade.model.avro.DataFields other) {
    return new es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder(other);
  }
  
  /**
   * RecordBuilder for DataFields instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataFields>
    implements org.apache.avro.data.RecordBuilder<DataFields> {

    private java.lang.String id;
    private java.lang.String name;
    private java.util.List<java.lang.String> labels;
    private java.util.List<java.lang.String> text;
    private java.util.List<java.lang.String> extra;

    /** Creates a new Builder */
    private Builder() {
      super(es.upm.oeg.librairy.api.facade.model.avro.DataFields.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.labels)) {
        this.labels = data().deepCopy(fields()[2].schema(), other.labels);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.text)) {
        this.text = data().deepCopy(fields()[3].schema(), other.text);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.extra)) {
        this.extra = data().deepCopy(fields()[4].schema(), other.extra);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing DataFields instance */
    private Builder(es.upm.oeg.librairy.api.facade.model.avro.DataFields other) {
            super(es.upm.oeg.librairy.api.facade.model.avro.DataFields.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.labels)) {
        this.labels = data().deepCopy(fields()[2].schema(), other.labels);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.text)) {
        this.text = data().deepCopy(fields()[3].schema(), other.text);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.extra)) {
        this.extra = data().deepCopy(fields()[4].schema(), other.extra);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder setId(java.lang.String value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder setName(java.lang.String value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'labels' field */
    public java.util.List<java.lang.String> getLabels() {
      return labels;
    }
    
    /** Sets the value of the 'labels' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder setLabels(java.util.List<java.lang.String> value) {
      validate(fields()[2], value);
      this.labels = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'labels' field has been set */
    public boolean hasLabels() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'labels' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder clearLabels() {
      labels = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'text' field */
    public java.util.List<java.lang.String> getText() {
      return text;
    }
    
    /** Sets the value of the 'text' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder setText(java.util.List<java.lang.String> value) {
      validate(fields()[3], value);
      this.text = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'text' field has been set */
    public boolean hasText() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'text' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder clearText() {
      text = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'extra' field */
    public java.util.List<java.lang.String> getExtra() {
      return extra;
    }
    
    /** Sets the value of the 'extra' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder setExtra(java.util.List<java.lang.String> value) {
      validate(fields()[4], value);
      this.extra = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'extra' field has been set */
    public boolean hasExtra() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'extra' field */
    public es.upm.oeg.librairy.api.facade.model.avro.DataFields.Builder clearExtra() {
      extra = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public DataFields build() {
      try {
        DataFields record = new DataFields();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.String) defaultValue(fields()[1]);
        record.labels = fieldSetFlags()[2] ? this.labels : (java.util.List<java.lang.String>) defaultValue(fields()[2]);
        record.text = fieldSetFlags()[3] ? this.text : (java.util.List<java.lang.String>) defaultValue(fields()[3]);
        record.extra = fieldSetFlags()[4] ? this.extra : (java.util.List<java.lang.String>) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}