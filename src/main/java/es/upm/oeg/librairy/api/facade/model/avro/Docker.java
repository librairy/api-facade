/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package es.upm.oeg.librairy.api.facade.model.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Docker extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Docker\",\"namespace\":\"es.upm.oeg.librairy.api.facade.model.avro\",\"fields\":[{\"name\":\"user\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"email\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"password\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"repository\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String user;
   private java.lang.String email;
   private java.lang.String password;
   private java.lang.String repository;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Docker() {}

  /**
   * All-args constructor.
   */
  public Docker(java.lang.String user, java.lang.String email, java.lang.String password, java.lang.String repository) {
    this.user = user;
    this.email = email;
    this.password = password;
    this.repository = repository;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return user;
    case 1: return email;
    case 2: return password;
    case 3: return repository;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: user = (java.lang.String)value$; break;
    case 1: email = (java.lang.String)value$; break;
    case 2: password = (java.lang.String)value$; break;
    case 3: repository = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'user' field.
   */
  public java.lang.String getUser() {
    return user;
  }

  /**
   * Sets the value of the 'user' field.
   * @param value the value to set.
   */
  public void setUser(java.lang.String value) {
    this.user = value;
  }

  /**
   * Gets the value of the 'email' field.
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.String value) {
    this.email = value;
  }

  /**
   * Gets the value of the 'password' field.
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * Sets the value of the 'password' field.
   * @param value the value to set.
   */
  public void setPassword(java.lang.String value) {
    this.password = value;
  }

  /**
   * Gets the value of the 'repository' field.
   */
  public java.lang.String getRepository() {
    return repository;
  }

  /**
   * Sets the value of the 'repository' field.
   * @param value the value to set.
   */
  public void setRepository(java.lang.String value) {
    this.repository = value;
  }

  /** Creates a new Docker RecordBuilder */
  public static es.upm.oeg.librairy.api.facade.model.avro.Docker.Builder newBuilder() {
    return new es.upm.oeg.librairy.api.facade.model.avro.Docker.Builder();
  }
  
  /** Creates a new Docker RecordBuilder by copying an existing Builder */
  public static es.upm.oeg.librairy.api.facade.model.avro.Docker.Builder newBuilder(es.upm.oeg.librairy.api.facade.model.avro.Docker.Builder other) {
    return new es.upm.oeg.librairy.api.facade.model.avro.Docker.Builder(other);
  }
  
  /** Creates a new Docker RecordBuilder by copying an existing Docker instance */
  public static es.upm.oeg.librairy.api.facade.model.avro.Docker.Builder newBuilder(es.upm.oeg.librairy.api.facade.model.avro.Docker other) {
    return new es.upm.oeg.librairy.api.facade.model.avro.Docker.Builder(other);
  }
  
  /**
   * RecordBuilder for Docker instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Docker>
    implements org.apache.avro.data.RecordBuilder<Docker> {

    private java.lang.String user;
    private java.lang.String email;
    private java.lang.String password;
    private java.lang.String repository;

    /** Creates a new Builder */
    private Builder() {
      super(es.upm.oeg.librairy.api.facade.model.avro.Docker.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(es.upm.oeg.librairy.api.facade.model.avro.Docker.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.user)) {
        this.user = data().deepCopy(fields()[0].schema(), other.user);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.email)) {
        this.email = data().deepCopy(fields()[1].schema(), other.email);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.password)) {
        this.password = data().deepCopy(fields()[2].schema(), other.password);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.repository)) {
        this.repository = data().deepCopy(fields()[3].schema(), other.repository);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Docker instance */
    private Builder(es.upm.oeg.librairy.api.facade.model.avro.Docker other) {
            super(es.upm.oeg.librairy.api.facade.model.avro.Docker.SCHEMA$);
      if (isValidValue(fields()[0], other.user)) {
        this.user = data().deepCopy(fields()[0].schema(), other.user);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.email)) {
        this.email = data().deepCopy(fields()[1].schema(), other.email);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.password)) {
        this.password = data().deepCopy(fields()[2].schema(), other.password);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.repository)) {
        this.repository = data().deepCopy(fields()[3].schema(), other.repository);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'user' field */
    public java.lang.String getUser() {
      return user;
    }
    
    /** Sets the value of the 'user' field */
    public es.upm.oeg.librairy.api.facade.model.avro.Docker.Builder setUser(java.lang.String value) {
      validate(fields()[0], value);
      this.user = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'user' field has been set */
    public boolean hasUser() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'user' field */
    public es.upm.oeg.librairy.api.facade.model.avro.Docker.Builder clearUser() {
      user = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'email' field */
    public java.lang.String getEmail() {
      return email;
    }
    
    /** Sets the value of the 'email' field */
    public es.upm.oeg.librairy.api.facade.model.avro.Docker.Builder setEmail(java.lang.String value) {
      validate(fields()[1], value);
      this.email = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'email' field has been set */
    public boolean hasEmail() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'email' field */
    public es.upm.oeg.librairy.api.facade.model.avro.Docker.Builder clearEmail() {
      email = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'password' field */
    public java.lang.String getPassword() {
      return password;
    }
    
    /** Sets the value of the 'password' field */
    public es.upm.oeg.librairy.api.facade.model.avro.Docker.Builder setPassword(java.lang.String value) {
      validate(fields()[2], value);
      this.password = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'password' field has been set */
    public boolean hasPassword() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'password' field */
    public es.upm.oeg.librairy.api.facade.model.avro.Docker.Builder clearPassword() {
      password = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'repository' field */
    public java.lang.String getRepository() {
      return repository;
    }
    
    /** Sets the value of the 'repository' field */
    public es.upm.oeg.librairy.api.facade.model.avro.Docker.Builder setRepository(java.lang.String value) {
      validate(fields()[3], value);
      this.repository = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'repository' field has been set */
    public boolean hasRepository() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'repository' field */
    public es.upm.oeg.librairy.api.facade.model.avro.Docker.Builder clearRepository() {
      repository = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Docker build() {
      try {
        Docker record = new Docker();
        record.user = fieldSetFlags()[0] ? this.user : (java.lang.String) defaultValue(fields()[0]);
        record.email = fieldSetFlags()[1] ? this.email : (java.lang.String) defaultValue(fields()[1]);
        record.password = fieldSetFlags()[2] ? this.password : (java.lang.String) defaultValue(fields()[2]);
        record.repository = fieldSetFlags()[3] ? this.repository : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}