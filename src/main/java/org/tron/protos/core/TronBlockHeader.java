// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/TronBlockHeader.proto

package org.tron.protos.core;

public final class TronBlockHeader {
  private TronBlockHeader() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlockHeaderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protos.BlockHeader)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 timestamp = 1;</code>
     */
    long getTimestamp();

    /**
     * <code>bytes txTrieRoot = 2;</code>
     */
    com.google.protobuf.ByteString getTxTrieRoot();

    /**
     * <code>bytes parentHash = 3;</code>
     */
    com.google.protobuf.ByteString getParentHash();

    /**
     * <code>bytes hash = 4;</code>
     */
    com.google.protobuf.ByteString getHash();

    /**
     * <code>bytes nonce = 5;</code>
     */
    com.google.protobuf.ByteString getNonce();

    /**
     * <code>bytes difficulty = 6;</code>
     */
    com.google.protobuf.ByteString getDifficulty();

    /**
     * <code>int64 number = 7;</code>
     */
    long getNumber();
  }
  /**
   * Protobuf type {@code protos.BlockHeader}
   */
  public  static final class BlockHeader extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protos.BlockHeader)
      BlockHeaderOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlockHeader.newBuilder() to construct.
    private BlockHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlockHeader() {
      timestamp_ = 0L;
      txTrieRoot_ = com.google.protobuf.ByteString.EMPTY;
      parentHash_ = com.google.protobuf.ByteString.EMPTY;
      hash_ = com.google.protobuf.ByteString.EMPTY;
      nonce_ = com.google.protobuf.ByteString.EMPTY;
      difficulty_ = com.google.protobuf.ByteString.EMPTY;
      number_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlockHeader(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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

              timestamp_ = input.readInt64();
              break;
            }
            case 18: {

              txTrieRoot_ = input.readBytes();
              break;
            }
            case 26: {

              parentHash_ = input.readBytes();
              break;
            }
            case 34: {

              hash_ = input.readBytes();
              break;
            }
            case 42: {

              nonce_ = input.readBytes();
              break;
            }
            case 50: {

              difficulty_ = input.readBytes();
              break;
            }
            case 56: {

              number_ = input.readInt64();
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
      return org.tron.protos.core.TronBlockHeader.internal_static_protos_BlockHeader_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tron.protos.core.TronBlockHeader.internal_static_protos_BlockHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tron.protos.core.TronBlockHeader.BlockHeader.class, org.tron.protos.core.TronBlockHeader.BlockHeader.Builder.class);
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private long timestamp_;
    /**
     * <code>int64 timestamp = 1;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int TXTRIEROOT_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString txTrieRoot_;
    /**
     * <code>bytes txTrieRoot = 2;</code>
     */
    public com.google.protobuf.ByteString getTxTrieRoot() {
      return txTrieRoot_;
    }

    public static final int PARENTHASH_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString parentHash_;
    /**
     * <code>bytes parentHash = 3;</code>
     */
    public com.google.protobuf.ByteString getParentHash() {
      return parentHash_;
    }

    public static final int HASH_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString hash_;
    /**
     * <code>bytes hash = 4;</code>
     */
    public com.google.protobuf.ByteString getHash() {
      return hash_;
    }

    public static final int NONCE_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString nonce_;
    /**
     * <code>bytes nonce = 5;</code>
     */
    public com.google.protobuf.ByteString getNonce() {
      return nonce_;
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 6;
    private com.google.protobuf.ByteString difficulty_;
    /**
     * <code>bytes difficulty = 6;</code>
     */
    public com.google.protobuf.ByteString getDifficulty() {
      return difficulty_;
    }

    public static final int NUMBER_FIELD_NUMBER = 7;
    private long number_;
    /**
     * <code>int64 number = 7;</code>
     */
    public long getNumber() {
      return number_;
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
      if (timestamp_ != 0L) {
        output.writeInt64(1, timestamp_);
      }
      if (!txTrieRoot_.isEmpty()) {
        output.writeBytes(2, txTrieRoot_);
      }
      if (!parentHash_.isEmpty()) {
        output.writeBytes(3, parentHash_);
      }
      if (!hash_.isEmpty()) {
        output.writeBytes(4, hash_);
      }
      if (!nonce_.isEmpty()) {
        output.writeBytes(5, nonce_);
      }
      if (!difficulty_.isEmpty()) {
        output.writeBytes(6, difficulty_);
      }
      if (number_ != 0L) {
        output.writeInt64(7, number_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, timestamp_);
      }
      if (!txTrieRoot_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, txTrieRoot_);
      }
      if (!parentHash_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, parentHash_);
      }
      if (!hash_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, hash_);
      }
      if (!nonce_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, nonce_);
      }
      if (!difficulty_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, difficulty_);
      }
      if (number_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(7, number_);
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
      if (!(obj instanceof org.tron.protos.core.TronBlockHeader.BlockHeader)) {
        return super.equals(obj);
      }
      org.tron.protos.core.TronBlockHeader.BlockHeader other = (org.tron.protos.core.TronBlockHeader.BlockHeader) obj;

      boolean result = true;
      result = result && (getTimestamp()
          == other.getTimestamp());
      result = result && getTxTrieRoot()
          .equals(other.getTxTrieRoot());
      result = result && getParentHash()
          .equals(other.getParentHash());
      result = result && getHash()
          .equals(other.getHash());
      result = result && getNonce()
          .equals(other.getNonce());
      result = result && getDifficulty()
          .equals(other.getDifficulty());
      result = result && (getNumber()
          == other.getNumber());
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
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
      hash = (37 * hash) + TXTRIEROOT_FIELD_NUMBER;
      hash = (53 * hash) + getTxTrieRoot().hashCode();
      hash = (37 * hash) + PARENTHASH_FIELD_NUMBER;
      hash = (53 * hash) + getParentHash().hashCode();
      hash = (37 * hash) + HASH_FIELD_NUMBER;
      hash = (53 * hash) + getHash().hashCode();
      hash = (37 * hash) + NONCE_FIELD_NUMBER;
      hash = (53 * hash) + getNonce().hashCode();
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDifficulty().hashCode();
      hash = (37 * hash) + NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getNumber());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tron.protos.core.TronBlockHeader.BlockHeader parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tron.protos.core.TronBlockHeader.BlockHeader parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tron.protos.core.TronBlockHeader.BlockHeader parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tron.protos.core.TronBlockHeader.BlockHeader parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tron.protos.core.TronBlockHeader.BlockHeader parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tron.protos.core.TronBlockHeader.BlockHeader parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tron.protos.core.TronBlockHeader.BlockHeader parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tron.protos.core.TronBlockHeader.BlockHeader parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tron.protos.core.TronBlockHeader.BlockHeader parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tron.protos.core.TronBlockHeader.BlockHeader parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tron.protos.core.TronBlockHeader.BlockHeader parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tron.protos.core.TronBlockHeader.BlockHeader parseFrom(
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
    public static Builder newBuilder(org.tron.protos.core.TronBlockHeader.BlockHeader prototype) {
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
     * Protobuf type {@code protos.BlockHeader}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protos.BlockHeader)
        org.tron.protos.core.TronBlockHeader.BlockHeaderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tron.protos.core.TronBlockHeader.internal_static_protos_BlockHeader_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tron.protos.core.TronBlockHeader.internal_static_protos_BlockHeader_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tron.protos.core.TronBlockHeader.BlockHeader.class, org.tron.protos.core.TronBlockHeader.BlockHeader.Builder.class);
      }

      // Construct using org.tron.protos.core.TronBlockHeader.BlockHeader.newBuilder()
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
        timestamp_ = 0L;

        txTrieRoot_ = com.google.protobuf.ByteString.EMPTY;

        parentHash_ = com.google.protobuf.ByteString.EMPTY;

        hash_ = com.google.protobuf.ByteString.EMPTY;

        nonce_ = com.google.protobuf.ByteString.EMPTY;

        difficulty_ = com.google.protobuf.ByteString.EMPTY;

        number_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tron.protos.core.TronBlockHeader.internal_static_protos_BlockHeader_descriptor;
      }

      public org.tron.protos.core.TronBlockHeader.BlockHeader getDefaultInstanceForType() {
        return org.tron.protos.core.TronBlockHeader.BlockHeader.getDefaultInstance();
      }

      public org.tron.protos.core.TronBlockHeader.BlockHeader build() {
        org.tron.protos.core.TronBlockHeader.BlockHeader result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.tron.protos.core.TronBlockHeader.BlockHeader buildPartial() {
        org.tron.protos.core.TronBlockHeader.BlockHeader result = new org.tron.protos.core.TronBlockHeader.BlockHeader(this);
        result.timestamp_ = timestamp_;
        result.txTrieRoot_ = txTrieRoot_;
        result.parentHash_ = parentHash_;
        result.hash_ = hash_;
        result.nonce_ = nonce_;
        result.difficulty_ = difficulty_;
        result.number_ = number_;
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
        if (other instanceof org.tron.protos.core.TronBlockHeader.BlockHeader) {
          return mergeFrom((org.tron.protos.core.TronBlockHeader.BlockHeader)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tron.protos.core.TronBlockHeader.BlockHeader other) {
        if (other == org.tron.protos.core.TronBlockHeader.BlockHeader.getDefaultInstance()) return this;
        if (other.getTimestamp() != 0L) {
          setTimestamp(other.getTimestamp());
        }
        if (other.getTxTrieRoot() != com.google.protobuf.ByteString.EMPTY) {
          setTxTrieRoot(other.getTxTrieRoot());
        }
        if (other.getParentHash() != com.google.protobuf.ByteString.EMPTY) {
          setParentHash(other.getParentHash());
        }
        if (other.getHash() != com.google.protobuf.ByteString.EMPTY) {
          setHash(other.getHash());
        }
        if (other.getNonce() != com.google.protobuf.ByteString.EMPTY) {
          setNonce(other.getNonce());
        }
        if (other.getDifficulty() != com.google.protobuf.ByteString.EMPTY) {
          setDifficulty(other.getDifficulty());
        }
        if (other.getNumber() != 0L) {
          setNumber(other.getNumber());
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
        org.tron.protos.core.TronBlockHeader.BlockHeader parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tron.protos.core.TronBlockHeader.BlockHeader) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long timestamp_ ;
      /**
       * <code>int64 timestamp = 1;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>int64 timestamp = 1;</code>
       */
      public Builder setTimestamp(long value) {
        
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 timestamp = 1;</code>
       */
      public Builder clearTimestamp() {
        
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString txTrieRoot_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes txTrieRoot = 2;</code>
       */
      public com.google.protobuf.ByteString getTxTrieRoot() {
        return txTrieRoot_;
      }
      /**
       * <code>bytes txTrieRoot = 2;</code>
       */
      public Builder setTxTrieRoot(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        txTrieRoot_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes txTrieRoot = 2;</code>
       */
      public Builder clearTxTrieRoot() {
        
        txTrieRoot_ = getDefaultInstance().getTxTrieRoot();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString parentHash_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes parentHash = 3;</code>
       */
      public com.google.protobuf.ByteString getParentHash() {
        return parentHash_;
      }
      /**
       * <code>bytes parentHash = 3;</code>
       */
      public Builder setParentHash(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        parentHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes parentHash = 3;</code>
       */
      public Builder clearParentHash() {
        
        parentHash_ = getDefaultInstance().getParentHash();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes hash = 4;</code>
       */
      public com.google.protobuf.ByteString getHash() {
        return hash_;
      }
      /**
       * <code>bytes hash = 4;</code>
       */
      public Builder setHash(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        hash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes hash = 4;</code>
       */
      public Builder clearHash() {
        
        hash_ = getDefaultInstance().getHash();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString nonce_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes nonce = 5;</code>
       */
      public com.google.protobuf.ByteString getNonce() {
        return nonce_;
      }
      /**
       * <code>bytes nonce = 5;</code>
       */
      public Builder setNonce(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nonce_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes nonce = 5;</code>
       */
      public Builder clearNonce() {
        
        nonce_ = getDefaultInstance().getNonce();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString difficulty_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes difficulty = 6;</code>
       */
      public com.google.protobuf.ByteString getDifficulty() {
        return difficulty_;
      }
      /**
       * <code>bytes difficulty = 6;</code>
       */
      public Builder setDifficulty(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        difficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes difficulty = 6;</code>
       */
      public Builder clearDifficulty() {
        
        difficulty_ = getDefaultInstance().getDifficulty();
        onChanged();
        return this;
      }

      private long number_ ;
      /**
       * <code>int64 number = 7;</code>
       */
      public long getNumber() {
        return number_;
      }
      /**
       * <code>int64 number = 7;</code>
       */
      public Builder setNumber(long value) {
        
        number_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 number = 7;</code>
       */
      public Builder clearNumber() {
        
        number_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:protos.BlockHeader)
    }

    // @@protoc_insertion_point(class_scope:protos.BlockHeader)
    private static final org.tron.protos.core.TronBlockHeader.BlockHeader DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tron.protos.core.TronBlockHeader.BlockHeader();
    }

    public static org.tron.protos.core.TronBlockHeader.BlockHeader getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlockHeader>
        PARSER = new com.google.protobuf.AbstractParser<BlockHeader>() {
      public BlockHeader parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new BlockHeader(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BlockHeader> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlockHeader> getParserForType() {
      return PARSER;
    }

    public org.tron.protos.core.TronBlockHeader.BlockHeader getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_BlockHeader_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_BlockHeader_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032core/TronBlockHeader.proto\022\006protos\"\211\001\n" +
      "\013BlockHeader\022\021\n\ttimestamp\030\001 \001(\003\022\022\n\ntxTri" +
      "eRoot\030\002 \001(\014\022\022\n\nparentHash\030\003 \001(\014\022\014\n\004hash\030" +
      "\004 \001(\014\022\r\n\005nonce\030\005 \001(\014\022\022\n\ndifficulty\030\006 \001(\014" +
      "\022\016\n\006number\030\007 \001(\003B\'\n\024org.tron.protos.core" +
      "B\017TronBlockHeaderb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_protos_BlockHeader_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_BlockHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_BlockHeader_descriptor,
        new java.lang.String[] { "Timestamp", "TxTrieRoot", "ParentHash", "Hash", "Nonce", "Difficulty", "Number", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
