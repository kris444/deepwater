// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc_service.proto

package ai.h2o.deepwater.backends.grpc;

public interface CreateSessionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:deepwater.CreateSessionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; options = 1;</code>
   */
  int getOptionsCount();
  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; options = 1;</code>
   */
  boolean containsOptions(
      java.lang.String key);
  /**
   * Use {@link #getOptionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
  getOptions();
  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; options = 1;</code>
   */
  java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
  getOptionsMap();
  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; options = 1;</code>
   */

  ai.h2o.deepwater.backends.grpc.ParamValue getOptionsOrDefault(
      java.lang.String key,
      ai.h2o.deepwater.backends.grpc.ParamValue defaultValue);
  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; options = 1;</code>
   */

  ai.h2o.deepwater.backends.grpc.ParamValue getOptionsOrThrow(
      java.lang.String key);
}
