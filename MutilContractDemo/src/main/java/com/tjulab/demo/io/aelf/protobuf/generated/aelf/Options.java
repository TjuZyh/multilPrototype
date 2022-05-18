// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: options.proto

package aelf;

public final class Options {
  private Options() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(aelf.Options.identity);
    registry.add(aelf.Options.base);
    registry.add(aelf.Options.csharpState);
    registry.add(aelf.Options.isView);
    registry.add(aelf.Options.isEvent);
    registry.add(aelf.Options.isIndexed);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int IDENTITY_FIELD_NUMBER = 500001;
  /**
   * <code>extend .google.protobuf.FileOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FileOptions,
      String> identity = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        String.class,
        null);
  public static final int BASE_FIELD_NUMBER = 505001;
  /**
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.ServiceOptions,
      java.util.List<String>> base = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        String.class,
        null);
  public static final int CSHARP_STATE_FIELD_NUMBER = 505030;
  /**
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.ServiceOptions,
      String> csharpState = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        String.class,
        null);
  public static final int IS_VIEW_FIELD_NUMBER = 506001;
  /**
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MethodOptions,
      Boolean> isView = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        Boolean.class,
        null);
  public static final int IS_EVENT_FIELD_NUMBER = 50100;
  /**
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      Boolean> isEvent = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        Boolean.class,
        null);
  public static final int IS_INDEXED_FIELD_NUMBER = 502001;
  /**
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      Boolean> isIndexed = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        Boolean.class,
        null);

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\roptions.proto\022\004aelf\032 google/protobuf/d" +
      "escriptor.proto:0\n\010identity\022\034.google.pro" +
      "tobuf.FileOptions\030\241\302\036 \001(\t:/\n\004base\022\037.goog" +
      "le.protobuf.ServiceOptions\030\251\351\036 \003(\t:7\n\014cs" +
      "harp_state\022\037.google.protobuf.ServiceOpti" +
      "ons\030\306\351\036 \001(\t:1\n\007is_view\022\036.google.protobuf" +
      ".MethodOptions\030\221\361\036 \001(\010:3\n\010is_event\022\037.goo" +
      "gle.protobuf.MessageOptions\030\264\207\003 \001(\010:3\n\ni" +
      "s_indexed\022\035.google.protobuf.FieldOptions" +
      "\030\361\321\036 \001(\010B\007\252\002\004AElfb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    identity.internalInit(descriptor.getExtensions().get(0));
    base.internalInit(descriptor.getExtensions().get(1));
    csharpState.internalInit(descriptor.getExtensions().get(2));
    isView.internalInit(descriptor.getExtensions().get(3));
    isEvent.internalInit(descriptor.getExtensions().get(4));
    isIndexed.internalInit(descriptor.getExtensions().get(5));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
