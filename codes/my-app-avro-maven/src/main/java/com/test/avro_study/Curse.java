/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.test.avro_study;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Curse extends org.apache.avro.specific.SpecificExceptionBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"error\",\"name\":\"Curse\",\"namespace\":\"com.test.avro_study\",\"fields\":[{\"name\":\"msg\",\"type\":\"string\",\"doc\":\"异常消息\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** 异常消息 */
  @Deprecated public java.lang.CharSequence msg;

  public Curse() {
    super();
  }
  
  public Curse(Object value) {
    super(value);
  }

  public Curse(Throwable cause) {
    super(cause);
  }

  public Curse(Object value, Throwable cause) {
    super(value, cause);
  }
  
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return msg;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: msg = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  @Override
  public void writeExternal(ObjectOutput objectOutput) throws IOException {

  }

  @Override
  public void readExternal(ObjectInput objectInput) throws IOException {

  }

  /**
   * Gets the value of the 'msg' field.
   * 异常消息   */
  public java.lang.CharSequence getMsg() {
    return msg;
  }

  /**
   * Sets the value of the 'msg' field.
   * 异常消息   * @param value the value to set.
   */
  public void setMsg(java.lang.CharSequence value) {
    this.msg = value;
  }

  /** Creates a new Curse RecordBuilder */
  public static com.test.avro_study.Curse.Builder newBuilder() {
    return new com.test.avro_study.Curse.Builder();
  }
  
  /** Creates a new Curse RecordBuilder by copying an existing Builder */
  public static com.test.avro_study.Curse.Builder newBuilder(com.test.avro_study.Curse.Builder other) {
    return new com.test.avro_study.Curse.Builder(other);
  }
  
  /** Creates a new Curse RecordBuilder by copying an existing Curse instance */
  public static com.test.avro_study.Curse.Builder newBuilder(com.test.avro_study.Curse other) {
    return new com.test.avro_study.Curse.Builder(other);
  }
  
  /**
   * RecordBuilder for Curse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificErrorBuilderBase<Curse>
    implements org.apache.avro.data.ErrorBuilder<Curse> {

    private java.lang.CharSequence msg;

    /** Creates a new Builder */
    private Builder() {
      super(com.test.avro_study.Curse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.test.avro_study.Curse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.msg)) {
        this.msg = data().deepCopy(fields()[0].schema(), other.msg);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Curse instance */
    private Builder(com.test.avro_study.Curse other) {
      super(other);
      if (isValidValue(fields()[0], other.msg)) {
        this.msg = data().deepCopy(fields()[0].schema(), other.msg);
        fieldSetFlags()[0] = true;
      }
    }

    @Override
    public com.test.avro_study.Curse.Builder setValue(Object value) {
      super.setValue(value);
      return this;
    }
    
    @Override
    public com.test.avro_study.Curse.Builder clearValue() {
      super.clearValue();
      return this;
    }

    @Override
    public com.test.avro_study.Curse.Builder setCause(Throwable cause) {
      super.setCause(cause);
      return this;
    }
    
    @Override
    public com.test.avro_study.Curse.Builder clearCause() {
      super.clearCause();
      return this;
    }

    /** Gets the value of the 'msg' field */
    public java.lang.CharSequence getMsg() {
      return msg;
    }
    
    /** Sets the value of the 'msg' field */
    public com.test.avro_study.Curse.Builder setMsg(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.msg = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'msg' field has been set */
    public boolean hasMsg() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'msg' field */
    public com.test.avro_study.Curse.Builder clearMsg() {
      msg = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public Curse build() {
      try {
        Curse record = new Curse(getValue(), getCause());
        record.msg = fieldSetFlags()[0] ? this.msg : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
