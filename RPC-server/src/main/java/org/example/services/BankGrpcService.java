package org.example.services;

import io.grpc.stub.StreamObserver;
import org.example.stubs.Bank;
import org.example.stubs.BankServiceGrpc;

import java.util.Timer;
import java.util.TimerTask;

public class BankGrpcService extends BankServiceGrpc.BankServiceImplBase{
    @Override
    public void deposer(Bank.DeposerRequest request,
                        StreamObserver<Bank.DeposerResponse> responseObserver) {
        Bank.Account account=Bank.Account.newBuilder()
                .setSolde(request.getAccount().getSolde()+request.getMontant())
                .build();
        Bank.DeposerResponse deposerResponse=Bank.DeposerResponse.newBuilder()
                .setAccount(account)
                .build();
        responseObserver.onNext(deposerResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void retirer(Bank.RetirerRequest request, StreamObserver<Bank.RetirerResponse> responseObserver) {
        Bank.Account account=Bank.Account.newBuilder()
                .setSolde(request.getAccount().getSolde()-request.getMontant())
                .build();
        Bank.RetirerResponse retirerResponse = Bank.RetirerResponse.newBuilder()
                .setAccount(account)
                .build();
        responseObserver.onNext(retirerResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void transferer(Bank.TransfererRequest request, StreamObserver<Bank.TransfererResponse> responseObserver) {
        Bank.Account account1=Bank.Account.newBuilder()
                .setSolde(request.getAccount1().getSolde()-request.getMontant())
                .build();
        Bank.Account account2=Bank.Account.newBuilder()
                .setSolde(request.getAccount2().getSolde()+request.getMontant())
                .build();
        Bank.TransfererResponse transfererResponse=Bank.TransfererResponse.newBuilder()
                .setAccount1(account1)
                .setAccount2(account2)
                .build();
        responseObserver.onNext(transfererResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getSolde(Bank.GetSoldeRequest request, StreamObserver<Bank.GetSoldeResponse> responseObserver) {
        System.out.println("receive a getSolde request solde = "+request.getAccount().getSolde());
        Bank.GetSoldeResponse getSoldeResponse=Bank.GetSoldeResponse.newBuilder()
                .setSolde(request.getAccount().getSolde())
                .build();
        responseObserver.onNext(getSoldeResponse);
        responseObserver.onCompleted();
    }
}
