// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package pt.grpc.service.user;

public final class UserOuterClass {
  private UserOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_power_trade_GetUserNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_power_trade_GetUserNameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_power_trade_GetUserNameResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_power_trade_GetUserNameResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\nuser.proto\022\013power.trade\" \n\022GetUserName" +
      "Request\022\n\n\002id\030\001 \001(\t\"#\n\023GetUserNameRespon" +
      "se\022\014\n\004name\030\001 \001(\t2Z\n\004User\022R\n\013GetUserName\022" +
      "\037.power.trade.GetUserNameRequest\032 .power" +
      ".trade.GetUserNameResponse\"\000B,\n\024pt.grpc." +
      "service.userP\001\252\002\021PtGrpcServiceUserb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_power_trade_GetUserNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_power_trade_GetUserNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_power_trade_GetUserNameRequest_descriptor,
        new String[] { "Id", });
    internal_static_power_trade_GetUserNameResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_power_trade_GetUserNameResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_power_trade_GetUserNameResponse_descriptor,
        new String[] { "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
