// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dimitStore.proto

package dimit.store;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code ChannelGroup}
 */
public  final class ChannelGroup extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ChannelGroup)
    ChannelGroupOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChannelGroup.newBuilder() to construct.
  private ChannelGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChannelGroup() {
    v_ = 0;
    id_ = "";
    cid_ = "";
    ct_ = 0L;
    mt_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChannelGroup(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            v_ = input.readUInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            cid_ = s;
            break;
          }
          case 72: {

            ct_ = input.readUInt64();
            break;
          }
          case 80: {

            mt_ = input.readUInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return dimit.store.DimitStore.internal_static_ChannelGroup_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dimit.store.DimitStore.internal_static_ChannelGroup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dimit.store.ChannelGroup.class, dimit.store.ChannelGroup.Builder.class);
  }

  public static final int V_FIELD_NUMBER = 1;
  private int v_;
  /**
   * <code>uint32 v = 1;</code>
   */
  public int getV() {
    return v_;
  }

  public static final int ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * instance id
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * instance id
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CID_FIELD_NUMBER = 3;
  private volatile java.lang.Object cid_;
  /**
   * <pre>
   * ChannelGroupConf's id
   * </pre>
   *
   * <code>string cid = 3;</code>
   */
  public java.lang.String getCid() {
    java.lang.Object ref = cid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ChannelGroupConf's id
   * </pre>
   *
   * <code>string cid = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCidBytes() {
    java.lang.Object ref = cid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CT_FIELD_NUMBER = 9;
  private long ct_;
  /**
   * <pre>
   * timestamp
   * </pre>
   *
   * <code>uint64 ct = 9;</code>
   */
  public long getCt() {
    return ct_;
  }

  public static final int MT_FIELD_NUMBER = 10;
  private long mt_;
  /**
   * <pre>
   * modify timestamp
   * </pre>
   *
   * <code>uint64 mt = 10;</code>
   */
  public long getMt() {
    return mt_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (v_ != 0) {
      output.writeUInt32(1, v_);
    }
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, id_);
    }
    if (!getCidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, cid_);
    }
    if (ct_ != 0L) {
      output.writeUInt64(9, ct_);
    }
    if (mt_ != 0L) {
      output.writeUInt64(10, mt_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (v_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, v_);
    }
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, id_);
    }
    if (!getCidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, cid_);
    }
    if (ct_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(9, ct_);
    }
    if (mt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(10, mt_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof dimit.store.ChannelGroup)) {
      return super.equals(obj);
    }
    dimit.store.ChannelGroup other = (dimit.store.ChannelGroup) obj;

    boolean result = true;
    result = result && (getV()
        == other.getV());
    result = result && getId()
        .equals(other.getId());
    result = result && getCid()
        .equals(other.getCid());
    result = result && (getCt()
        == other.getCt());
    result = result && (getMt()
        == other.getMt());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + V_FIELD_NUMBER;
    hash = (53 * hash) + getV();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + CID_FIELD_NUMBER;
    hash = (53 * hash) + getCid().hashCode();
    hash = (37 * hash) + CT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCt());
    hash = (37 * hash) + MT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMt());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dimit.store.ChannelGroup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dimit.store.ChannelGroup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dimit.store.ChannelGroup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dimit.store.ChannelGroup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dimit.store.ChannelGroup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dimit.store.ChannelGroup parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dimit.store.ChannelGroup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dimit.store.ChannelGroup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dimit.store.ChannelGroup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dimit.store.ChannelGroup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dimit.store.ChannelGroup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dimit.store.ChannelGroup parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(dimit.store.ChannelGroup prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * </pre>
   *
   * Protobuf type {@code ChannelGroup}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ChannelGroup)
      dimit.store.ChannelGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dimit.store.DimitStore.internal_static_ChannelGroup_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dimit.store.DimitStore.internal_static_ChannelGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dimit.store.ChannelGroup.class, dimit.store.ChannelGroup.Builder.class);
    }

    // Construct using dimit.store.ChannelGroup.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      v_ = 0;

      id_ = "";

      cid_ = "";

      ct_ = 0L;

      mt_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dimit.store.DimitStore.internal_static_ChannelGroup_descriptor;
    }

    public dimit.store.ChannelGroup getDefaultInstanceForType() {
      return dimit.store.ChannelGroup.getDefaultInstance();
    }

    public dimit.store.ChannelGroup build() {
      dimit.store.ChannelGroup result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public dimit.store.ChannelGroup buildPartial() {
      dimit.store.ChannelGroup result = new dimit.store.ChannelGroup(this);
      result.v_ = v_;
      result.id_ = id_;
      result.cid_ = cid_;
      result.ct_ = ct_;
      result.mt_ = mt_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof dimit.store.ChannelGroup) {
        return mergeFrom((dimit.store.ChannelGroup)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dimit.store.ChannelGroup other) {
      if (other == dimit.store.ChannelGroup.getDefaultInstance()) return this;
      if (other.getV() != 0) {
        setV(other.getV());
      }
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getCid().isEmpty()) {
        cid_ = other.cid_;
        onChanged();
      }
      if (other.getCt() != 0L) {
        setCt(other.getCt());
      }
      if (other.getMt() != 0L) {
        setMt(other.getMt());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      dimit.store.ChannelGroup parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dimit.store.ChannelGroup) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int v_ ;
    /**
     * <code>uint32 v = 1;</code>
     */
    public int getV() {
      return v_;
    }
    /**
     * <code>uint32 v = 1;</code>
     */
    public Builder setV(int value) {
      
      v_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 v = 1;</code>
     */
    public Builder clearV() {
      
      v_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * instance id
     * </pre>
     *
     * <code>string id = 2;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * instance id
     * </pre>
     *
     * <code>string id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * instance id
     * </pre>
     *
     * <code>string id = 2;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * instance id
     * </pre>
     *
     * <code>string id = 2;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * instance id
     * </pre>
     *
     * <code>string id = 2;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cid_ = "";
    /**
     * <pre>
     * ChannelGroupConf's id
     * </pre>
     *
     * <code>string cid = 3;</code>
     */
    public java.lang.String getCid() {
      java.lang.Object ref = cid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ChannelGroupConf's id
     * </pre>
     *
     * <code>string cid = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCidBytes() {
      java.lang.Object ref = cid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ChannelGroupConf's id
     * </pre>
     *
     * <code>string cid = 3;</code>
     */
    public Builder setCid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ChannelGroupConf's id
     * </pre>
     *
     * <code>string cid = 3;</code>
     */
    public Builder clearCid() {
      
      cid_ = getDefaultInstance().getCid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ChannelGroupConf's id
     * </pre>
     *
     * <code>string cid = 3;</code>
     */
    public Builder setCidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cid_ = value;
      onChanged();
      return this;
    }

    private long ct_ ;
    /**
     * <pre>
     * timestamp
     * </pre>
     *
     * <code>uint64 ct = 9;</code>
     */
    public long getCt() {
      return ct_;
    }
    /**
     * <pre>
     * timestamp
     * </pre>
     *
     * <code>uint64 ct = 9;</code>
     */
    public Builder setCt(long value) {
      
      ct_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * timestamp
     * </pre>
     *
     * <code>uint64 ct = 9;</code>
     */
    public Builder clearCt() {
      
      ct_ = 0L;
      onChanged();
      return this;
    }

    private long mt_ ;
    /**
     * <pre>
     * modify timestamp
     * </pre>
     *
     * <code>uint64 mt = 10;</code>
     */
    public long getMt() {
      return mt_;
    }
    /**
     * <pre>
     * modify timestamp
     * </pre>
     *
     * <code>uint64 mt = 10;</code>
     */
    public Builder setMt(long value) {
      
      mt_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * modify timestamp
     * </pre>
     *
     * <code>uint64 mt = 10;</code>
     */
    public Builder clearMt() {
      
      mt_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ChannelGroup)
  }

  // @@protoc_insertion_point(class_scope:ChannelGroup)
  private static final dimit.store.ChannelGroup DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dimit.store.ChannelGroup();
  }

  public static dimit.store.ChannelGroup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChannelGroup>
      PARSER = new com.google.protobuf.AbstractParser<ChannelGroup>() {
    public ChannelGroup parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChannelGroup(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChannelGroup> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChannelGroup> getParserForType() {
    return PARSER;
  }

  public dimit.store.ChannelGroup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
