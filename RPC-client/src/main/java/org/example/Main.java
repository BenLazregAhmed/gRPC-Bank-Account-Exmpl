package org.example;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.example.stubs.Bank;
import org.example.stubs.BankServiceGrpc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagedChannel managedChannel= ManagedChannelBuilder
                .forAddress("localhost",5555)
                .usePlaintext()
                .build();
        BankServiceGrpc.BankServiceBlockingStub stub= BankServiceGrpc.newBlockingStub(managedChannel);
        Bank.Account account=Bank.Account.newBuilder().setSolde(100).build();
        Bank.Account account2=Bank.Account.newBuilder().setSolde(150).build();
        int choixUtilisateur=0;
        Scanner clavier = new Scanner(System.in);
        System.out.println("Merci d'entrer votre choix ! ");

        do
        {
            System.out.println("tapez 1 si vous voulez consulter votre solde");
            System.out.println("tapez 2 si vous voulez deposer une somme d'argent");
            System.out.println("tapez 3 si vous voulez retirer une somme d'argent");
            System.out.println("tapez 4 Si vous voulez quitter");

            choixUtilisateur=clavier.nextInt();

            int somArg;
            switch(choixUtilisateur)
            {
                case 1 :
                {
                    Bank.GetSoldeRequest getSoldeRequest=Bank.GetSoldeRequest.newBuilder()
                            .setAccount(account)
                            .build();
                    System.out.println("Votre solde est : "+stub.getSolde(getSoldeRequest)+" dinar(s)");
                    break;
                }
                case 2 :
                {
                    System.out.println("Merci de saisir la somme a deposer ...");
                    somArg=clavier.nextInt();
                    Bank.DeposerRequest deposerRequest=Bank.DeposerRequest.newBuilder()
                            .setAccount(account)
                            .setMontant(somArg)
                            .build();
                    account=stub.deposer(deposerRequest).getAccount();
                    Bank.GetSoldeRequest getSoldeRequest=Bank.GetSoldeRequest.newBuilder()
                            .setAccount(account)
                            .build();
                    System.out.println("Votre nouveau solde est :"+stub.getSolde(getSoldeRequest)+" dinar(s)");
                    break;
                }
                case 3 :
                {
                    System.out.println("Merci de saisir la somme a retirer ...");
                    somArg=clavier.nextInt();
                    Bank.RetirerRequest retirerRequest=Bank.RetirerRequest.newBuilder()
                            .setAccount(account)
                            .setMontant(somArg)
                            .build();
                    account=stub.retirer(retirerRequest).getAccount();
                    Bank.GetSoldeRequest getSoldeRequest=Bank.GetSoldeRequest.newBuilder()
                            .setAccount(account)
                            .build();
                    System.out.println("votre nouveau solde est :"+stub.getSolde(getSoldeRequest)+" dinar(s)");
                    break;
                }
                case 4 :
                {
                    System.out.println("Merci et a la prochaine ...");
                    break;
                }
            }
        }while(choixUtilisateur != 4);
    }
}