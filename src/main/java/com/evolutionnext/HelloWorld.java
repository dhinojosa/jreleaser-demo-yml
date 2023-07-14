package com.evolutionnext;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello JReleaser");
        Wallet wallet = new Wallet();
        wallet.addFunds(3000);
        System.out.format("You have %d tokens", wallet.getBalance());
    }
}
