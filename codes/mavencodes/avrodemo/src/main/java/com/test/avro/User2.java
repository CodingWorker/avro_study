/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.test.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class User2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -405609104341708780L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User2\",\"namespace\":\"com.test.avro\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"nickName\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"score\",\"type\":{\"type\":\"map\",\"values\":\"long\"}},{\"name\":\"avgscore\",\"type\":[\"int\",\"null\"]}],\"messages\":{\"hello\":{\"doc\":\"Say hello.\",\"request\":[{\"name\":\"greeting\",\"type\":\"string\"}],\"response\":\"string\"}}}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<User2> ENCODER =
      new BinaryMessageEncoder<User2>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<User2> DECODER =
      new BinaryMessageDecoder<User2>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<User2> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<User2> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<User2>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this User2 to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a User2 from a ByteBuffer. */
  public static User2 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence name;
  @Deprecated public int age;
  @Deprecated public java.util.List<java.lang.CharSequence> nickName;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.Long> score;
  @Deprecated public java.lang.Integer avgscore;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public User2() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param age The new value for age
   * @param nickName The new value for nickName
   * @param score The new value for score
   * @param avgscore The new value for avgscore
   */
  public User2(java.lang.CharSequence name, java.lang.Integer age, java.util.List<java.lang.CharSequence> nickName, java.util.Map<java.lang.CharSequence,java.lang.Long> score, java.lang.Integer avgscore) {
    this.name = name;
    this.age = age;
    this.nickName = nickName;
    this.score = score;
    this.avgscore = avgscore;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return age;
    case 2: return nickName;
    case 3: return score;
    case 4: return avgscore;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: age = (java.lang.Integer)value$; break;
    case 2: nickName = (java.util.List<java.lang.CharSequence>)value$; break;
    case 3: score = (java.util.Map<java.lang.CharSequence,java.lang.Long>)value$; break;
    case 4: avgscore = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'nickName' field.
   * @return The value of the 'nickName' field.
   */
  public java.util.List<java.lang.CharSequence> getNickName() {
    return nickName;
  }

  /**
   * Sets the value of the 'nickName' field.
   * @param value the value to set.
   */
  public void setNickName(java.util.List<java.lang.CharSequence> value) {
    this.nickName = value;
  }

  /**
   * Gets the value of the 'score' field.
   * @return The value of the 'score' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.Long> getScore() {
    return score;
  }

  /**
   * Sets the value of the 'score' field.
   * @param value the value to set.
   */
  public void setScore(java.util.Map<java.lang.CharSequence,java.lang.Long> value) {
    this.score = value;
  }

  /**
   * Gets the value of the 'avgscore' field.
   * @return The value of the 'avgscore' field.
   */
  public java.lang.Integer getAvgscore() {
    return avgscore;
  }

  /**
   * Sets the value of the 'avgscore' field.
   * @param value the value to set.
   */
  public void setAvgscore(java.lang.Integer value) {
    this.avgscore = value;
  }

  /**
   * Creates a new User2 RecordBuilder.
   * @return A new User2 RecordBuilder
   */
  public static com.test.avro.User2.Builder newBuilder() {
    return new com.test.avro.User2.Builder();
  }

  /**
   * Creates a new User2 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new User2 RecordBuilder
   */
  public static com.test.avro.User2.Builder newBuilder(com.test.avro.User2.Builder other) {
    return new com.test.avro.User2.Builder(other);
  }

  /**
   * Creates a new User2 RecordBuilder by copying an existing User2 instance.
   * @param other The existing instance to copy.
   * @return A new User2 RecordBuilder
   */
  public static com.test.avro.User2.Builder newBuilder(com.test.avro.User2 other) {
    return new com.test.avro.User2.Builder(other);
  }

  /**
   * RecordBuilder for User2 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User2>
    implements org.apache.avro.data.RecordBuilder<User2> {

    private java.lang.CharSequence name;
    private int age;
    private java.util.List<java.lang.CharSequence> nickName;
    private java.util.Map<java.lang.CharSequence,java.lang.Long> score;
    private java.lang.Integer avgscore;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.test.avro.User2.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.nickName)) {
        this.nickName = data().deepCopy(fields()[2].schema(), other.nickName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.score)) {
        this.score = data().deepCopy(fields()[3].schema(), other.score);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.avgscore)) {
        this.avgscore = data().deepCopy(fields()[4].schema(), other.avgscore);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing User2 instance
     * @param other The existing instance to copy.
     */
    private Builder(com.test.avro.User2 other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.nickName)) {
        this.nickName = data().deepCopy(fields()[2].schema(), other.nickName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.score)) {
        this.score = data().deepCopy(fields()[3].schema(), other.score);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.avgscore)) {
        this.avgscore = data().deepCopy(fields()[4].schema(), other.avgscore);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.test.avro.User2.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.test.avro.User2.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public com.test.avro.User2.Builder setAge(int value) {
      validate(fields()[1], value);
      this.age = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public com.test.avro.User2.Builder clearAge() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'nickName' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getNickName() {
      return nickName;
    }

    /**
      * Sets the value of the 'nickName' field.
      * @param value The value of 'nickName'.
      * @return This builder.
      */
    public com.test.avro.User2.Builder setNickName(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.nickName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'nickName' field has been set.
      * @return True if the 'nickName' field has been set, false otherwise.
      */
    public boolean hasNickName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'nickName' field.
      * @return This builder.
      */
    public com.test.avro.User2.Builder clearNickName() {
      nickName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'score' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.Long> getScore() {
      return score;
    }

    /**
      * Sets the value of the 'score' field.
      * @param value The value of 'score'.
      * @return This builder.
      */
    public com.test.avro.User2.Builder setScore(java.util.Map<java.lang.CharSequence,java.lang.Long> value) {
      validate(fields()[3], value);
      this.score = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'score' field has been set.
      * @return True if the 'score' field has been set, false otherwise.
      */
    public boolean hasScore() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'score' field.
      * @return This builder.
      */
    public com.test.avro.User2.Builder clearScore() {
      score = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'avgscore' field.
      * @return The value.
      */
    public java.lang.Integer getAvgscore() {
      return avgscore;
    }

    /**
      * Sets the value of the 'avgscore' field.
      * @param value The value of 'avgscore'.
      * @return This builder.
      */
    public com.test.avro.User2.Builder setAvgscore(java.lang.Integer value) {
      validate(fields()[4], value);
      this.avgscore = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'avgscore' field has been set.
      * @return True if the 'avgscore' field has been set, false otherwise.
      */
    public boolean hasAvgscore() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'avgscore' field.
      * @return This builder.
      */
    public com.test.avro.User2.Builder clearAvgscore() {
      avgscore = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public User2 build() {
      try {
        User2 record = new User2();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.age = fieldSetFlags()[1] ? this.age : (java.lang.Integer) defaultValue(fields()[1]);
        record.nickName = fieldSetFlags()[2] ? this.nickName : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[2]);
        record.score = fieldSetFlags()[3] ? this.score : (java.util.Map<java.lang.CharSequence,java.lang.Long>) defaultValue(fields()[3]);
        record.avgscore = fieldSetFlags()[4] ? this.avgscore : (java.lang.Integer) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<User2>
    WRITER$ = (org.apache.avro.io.DatumWriter<User2>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<User2>
    READER$ = (org.apache.avro.io.DatumReader<User2>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
