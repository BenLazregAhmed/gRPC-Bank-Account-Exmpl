package org.example.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: bank.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.stubs.Bank.DeposerRequest,
      org.example.stubs.Bank.DeposerResponse> getDeposerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposer",
      requestType = org.example.stubs.Bank.DeposerRequest.class,
      responseType = org.example.stubs.Bank.DeposerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.stubs.Bank.DeposerRequest,
      org.example.stubs.Bank.DeposerResponse> getDeposerMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.Bank.DeposerRequest, org.example.stubs.Bank.DeposerResponse> getDeposerMethod;
    if ((getDeposerMethod = BankServiceGrpc.getDeposerMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getDeposerMethod = BankServiceGrpc.getDeposerMethod) == null) {
          BankServiceGrpc.getDeposerMethod = getDeposerMethod =
              io.grpc.MethodDescriptor.<org.example.stubs.Bank.DeposerRequest, org.example.stubs.Bank.DeposerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Bank.DeposerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Bank.DeposerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("Deposer"))
              .build();
        }
      }
    }
    return getDeposerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stubs.Bank.RetirerRequest,
      org.example.stubs.Bank.RetirerResponse> getRetirerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Retirer",
      requestType = org.example.stubs.Bank.RetirerRequest.class,
      responseType = org.example.stubs.Bank.RetirerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.stubs.Bank.RetirerRequest,
      org.example.stubs.Bank.RetirerResponse> getRetirerMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.Bank.RetirerRequest, org.example.stubs.Bank.RetirerResponse> getRetirerMethod;
    if ((getRetirerMethod = BankServiceGrpc.getRetirerMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getRetirerMethod = BankServiceGrpc.getRetirerMethod) == null) {
          BankServiceGrpc.getRetirerMethod = getRetirerMethod =
              io.grpc.MethodDescriptor.<org.example.stubs.Bank.RetirerRequest, org.example.stubs.Bank.RetirerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Retirer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Bank.RetirerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Bank.RetirerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("Retirer"))
              .build();
        }
      }
    }
    return getRetirerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stubs.Bank.TransfererRequest,
      org.example.stubs.Bank.TransfererResponse> getTransfererMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transferer",
      requestType = org.example.stubs.Bank.TransfererRequest.class,
      responseType = org.example.stubs.Bank.TransfererResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.stubs.Bank.TransfererRequest,
      org.example.stubs.Bank.TransfererResponse> getTransfererMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.Bank.TransfererRequest, org.example.stubs.Bank.TransfererResponse> getTransfererMethod;
    if ((getTransfererMethod = BankServiceGrpc.getTransfererMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getTransfererMethod = BankServiceGrpc.getTransfererMethod) == null) {
          BankServiceGrpc.getTransfererMethod = getTransfererMethod =
              io.grpc.MethodDescriptor.<org.example.stubs.Bank.TransfererRequest, org.example.stubs.Bank.TransfererResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Transferer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Bank.TransfererRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Bank.TransfererResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("Transferer"))
              .build();
        }
      }
    }
    return getTransfererMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stubs.Bank.GetSoldeRequest,
      org.example.stubs.Bank.GetSoldeResponse> getGetSoldeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSolde",
      requestType = org.example.stubs.Bank.GetSoldeRequest.class,
      responseType = org.example.stubs.Bank.GetSoldeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.stubs.Bank.GetSoldeRequest,
      org.example.stubs.Bank.GetSoldeResponse> getGetSoldeMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.Bank.GetSoldeRequest, org.example.stubs.Bank.GetSoldeResponse> getGetSoldeMethod;
    if ((getGetSoldeMethod = BankServiceGrpc.getGetSoldeMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetSoldeMethod = BankServiceGrpc.getGetSoldeMethod) == null) {
          BankServiceGrpc.getGetSoldeMethod = getGetSoldeMethod =
              io.grpc.MethodDescriptor.<org.example.stubs.Bank.GetSoldeRequest, org.example.stubs.Bank.GetSoldeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSolde"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Bank.GetSoldeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Bank.GetSoldeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("GetSolde"))
              .build();
        }
      }
    }
    return getGetSoldeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceStub>() {
        @java.lang.Override
        public BankServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceStub(channel, callOptions);
        }
      };
    return BankServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub>() {
        @java.lang.Override
        public BankServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceBlockingStub(channel, callOptions);
        }
      };
    return BankServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub>() {
        @java.lang.Override
        public BankServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceFutureStub(channel, callOptions);
        }
      };
    return BankServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void deposer(org.example.stubs.Bank.DeposerRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Bank.DeposerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeposerMethod(), responseObserver);
    }

    /**
     */
    default void retirer(org.example.stubs.Bank.RetirerRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Bank.RetirerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetirerMethod(), responseObserver);
    }

    /**
     */
    default void transferer(org.example.stubs.Bank.TransfererRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Bank.TransfererResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransfererMethod(), responseObserver);
    }

    /**
     */
    default void getSolde(org.example.stubs.Bank.GetSoldeRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Bank.GetSoldeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSoldeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BankService.
   */
  public static abstract class BankServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BankServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BankService.
   */
  public static final class BankServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BankServiceStub> {
    private BankServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     */
    public void deposer(org.example.stubs.Bank.DeposerRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Bank.DeposerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeposerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retirer(org.example.stubs.Bank.RetirerRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Bank.RetirerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetirerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferer(org.example.stubs.Bank.TransfererRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Bank.TransfererResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransfererMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSolde(org.example.stubs.Bank.GetSoldeRequest request,
        io.grpc.stub.StreamObserver<org.example.stubs.Bank.GetSoldeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSoldeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BankService.
   */
  public static final class BankServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.stubs.Bank.DeposerResponse deposer(org.example.stubs.Bank.DeposerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeposerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.stubs.Bank.RetirerResponse retirer(org.example.stubs.Bank.RetirerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetirerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.stubs.Bank.TransfererResponse transferer(org.example.stubs.Bank.TransfererRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransfererMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.stubs.Bank.GetSoldeResponse getSolde(org.example.stubs.Bank.GetSoldeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSoldeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BankService.
   */
  public static final class BankServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BankServiceFutureStub> {
    private BankServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.stubs.Bank.DeposerResponse> deposer(
        org.example.stubs.Bank.DeposerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeposerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.stubs.Bank.RetirerResponse> retirer(
        org.example.stubs.Bank.RetirerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetirerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.stubs.Bank.TransfererResponse> transferer(
        org.example.stubs.Bank.TransfererRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransfererMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.stubs.Bank.GetSoldeResponse> getSolde(
        org.example.stubs.Bank.GetSoldeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSoldeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEPOSER = 0;
  private static final int METHODID_RETIRER = 1;
  private static final int METHODID_TRANSFERER = 2;
  private static final int METHODID_GET_SOLDE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEPOSER:
          serviceImpl.deposer((org.example.stubs.Bank.DeposerRequest) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.Bank.DeposerResponse>) responseObserver);
          break;
        case METHODID_RETIRER:
          serviceImpl.retirer((org.example.stubs.Bank.RetirerRequest) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.Bank.RetirerResponse>) responseObserver);
          break;
        case METHODID_TRANSFERER:
          serviceImpl.transferer((org.example.stubs.Bank.TransfererRequest) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.Bank.TransfererResponse>) responseObserver);
          break;
        case METHODID_GET_SOLDE:
          serviceImpl.getSolde((org.example.stubs.Bank.GetSoldeRequest) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.Bank.GetSoldeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getDeposerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.stubs.Bank.DeposerRequest,
              org.example.stubs.Bank.DeposerResponse>(
                service, METHODID_DEPOSER)))
        .addMethod(
          getRetirerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.stubs.Bank.RetirerRequest,
              org.example.stubs.Bank.RetirerResponse>(
                service, METHODID_RETIRER)))
        .addMethod(
          getTransfererMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.stubs.Bank.TransfererRequest,
              org.example.stubs.Bank.TransfererResponse>(
                service, METHODID_TRANSFERER)))
        .addMethod(
          getGetSoldeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.stubs.Bank.GetSoldeRequest,
              org.example.stubs.Bank.GetSoldeResponse>(
                service, METHODID_GET_SOLDE)))
        .build();
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.stubs.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BankServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getDeposerMethod())
              .addMethod(getRetirerMethod())
              .addMethod(getTransfererMethod())
              .addMethod(getGetSoldeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
