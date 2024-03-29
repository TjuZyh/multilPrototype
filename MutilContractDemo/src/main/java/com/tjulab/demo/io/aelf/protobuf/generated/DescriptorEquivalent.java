// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: descriptor_equivalent.proto

package com.tjulab.demo.io.aelf.protobuf.generated;

public final class DescriptorEquivalent {
  private DescriptorEquivalent() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FileDescriptorSetOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FileDescriptorSet)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated bytes file = 1;</code>
     * @return A list containing the file.
     */
    java.util.List<com.google.protobuf.ByteString> getFileList();
    /**
     * <code>repeated bytes file = 1;</code>
     * @return The count of file.
     */
    int getFileCount();
    /**
     * <code>repeated bytes file = 1;</code>
     * @param index The index of the element to return.
     * @return The file at the given index.
     */
    com.google.protobuf.ByteString getFile(int index);
  }
  /**
   * <pre>
   *fileDescriptor_equivalent
   * </pre>
   *
   * Protobuf type {@code FileDescriptorSet}
   */
  public  static final class FileDescriptorSet extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FileDescriptorSet)
      FileDescriptorSetOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FileDescriptorSet.newBuilder() to construct.
    private FileDescriptorSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FileDescriptorSet() {
      file_ = java.util.Collections.emptyList();
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new FileDescriptorSet();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FileDescriptorSet(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                file_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
                mutable_bitField0_ |= 0x00000001;
              }
              file_.add(input.readBytes());
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          file_ = java.util.Collections.unmodifiableList(file_); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_FileDescriptorSet_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_FileDescriptorSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              FileDescriptorSet.class, Builder.class);
    }

    public static final int FILE_FIELD_NUMBER = 1;
    private java.util.List<com.google.protobuf.ByteString> file_;
    /**
     * <code>repeated bytes file = 1;</code>
     * @return A list containing the file.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getFileList() {
      return file_;
    }
    /**
     * <code>repeated bytes file = 1;</code>
     * @return The count of file.
     */
    public int getFileCount() {
      return file_.size();
    }
    /**
     * <code>repeated bytes file = 1;</code>
     * @param index The index of the element to return.
     * @return The file at the given index.
     */
    public com.google.protobuf.ByteString getFile(int index) {
      return file_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < file_.size(); i++) {
        output.writeBytes(1, file_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < file_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(file_.get(i));
        }
        size += dataSize;
        size += 1 * getFileList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof FileDescriptorSet)) {
        return super.equals(obj);
      }
      FileDescriptorSet other = (FileDescriptorSet) obj;

      if (!getFileList()
          .equals(other.getFileList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getFileCount() > 0) {
        hash = (37 * hash) + FILE_FIELD_NUMBER;
        hash = (53 * hash) + getFileList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static FileDescriptorSet parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static FileDescriptorSet parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static FileDescriptorSet parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static FileDescriptorSet parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static FileDescriptorSet parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static FileDescriptorSet parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static FileDescriptorSet parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static FileDescriptorSet parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static FileDescriptorSet parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static FileDescriptorSet parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static FileDescriptorSet parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static FileDescriptorSet parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(FileDescriptorSet prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *fileDescriptor_equivalent
     * </pre>
     *
     * Protobuf type {@code FileDescriptorSet}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FileDescriptorSet)
        FileDescriptorSetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_FileDescriptorSet_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_FileDescriptorSet_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                FileDescriptorSet.class, Builder.class);
      }

      // Construct using io.aelf.protobuf.generated.DescriptorEquivalent.FileDescriptorSet.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        file_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_FileDescriptorSet_descriptor;
      }

      @Override
      public FileDescriptorSet getDefaultInstanceForType() {
        return getDefaultInstance();
      }

      @Override
      public FileDescriptorSet build() {
        FileDescriptorSet result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public FileDescriptorSet buildPartial() {
        FileDescriptorSet result = new FileDescriptorSet(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          file_ = java.util.Collections.unmodifiableList(file_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.file_ = file_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof FileDescriptorSet) {
          return mergeFrom((FileDescriptorSet)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(FileDescriptorSet other) {
        if (other == getDefaultInstance()) return this;
        if (!other.file_.isEmpty()) {
          if (file_.isEmpty()) {
            file_ = other.file_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFileIsMutable();
            file_.addAll(other.file_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        FileDescriptorSet parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (FileDescriptorSet) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.google.protobuf.ByteString> file_ = java.util.Collections.emptyList();
      private void ensureFileIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          file_ = new java.util.ArrayList<com.google.protobuf.ByteString>(file_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated bytes file = 1;</code>
       * @return A list containing the file.
       */
      public java.util.List<com.google.protobuf.ByteString>
          getFileList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(file_) : file_;
      }
      /**
       * <code>repeated bytes file = 1;</code>
       * @return The count of file.
       */
      public int getFileCount() {
        return file_.size();
      }
      /**
       * <code>repeated bytes file = 1;</code>
       * @param index The index of the element to return.
       * @return The file at the given index.
       */
      public com.google.protobuf.ByteString getFile(int index) {
        return file_.get(index);
      }
      /**
       * <code>repeated bytes file = 1;</code>
       * @param index The index to set the value at.
       * @param value The file to set.
       * @return This builder for chaining.
       */
      public Builder setFile(
          int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFileIsMutable();
        file_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes file = 1;</code>
       * @param value The file to add.
       * @return This builder for chaining.
       */
      public Builder addFile(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFileIsMutable();
        file_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes file = 1;</code>
       * @param values The file to add.
       * @return This builder for chaining.
       */
      public Builder addAllFile(
          Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureFileIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, file_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes file = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFile() {
        file_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:FileDescriptorSet)
    }

    // @@protoc_insertion_point(class_scope:FileDescriptorSet)
    private static final FileDescriptorSet DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new FileDescriptorSet();
    }

    public static FileDescriptorSet getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FileDescriptorSet>
        PARSER = new com.google.protobuf.AbstractParser<FileDescriptorSet>() {
      @Override
      public FileDescriptorSet parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileDescriptorSet(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FileDescriptorSet> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<FileDescriptorSet> getParserForType() {
      return PARSER;
    }

    @Override
    public FileDescriptorSet getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FileDescriptorSet_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FileDescriptorSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\033descriptor_equivalent.proto\"!\n\021FileDes" +
      "criptorSet\022\014\n\004file\030\001 \003(\014B\034\n\032io.aelf.prot" +
      "obuf.generatedb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FileDescriptorSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FileDescriptorSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FileDescriptorSet_descriptor,
        new String[] { "File", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
