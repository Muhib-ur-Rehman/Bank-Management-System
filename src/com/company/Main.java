package com.company;

public class Main {

    public static void main(String[] args) {
        User user = new User("Ahmed","03001111111",new Account("32234234234",25000l));
        System.out.println("Current balance is : "+user.account.checkBalance());
        user.account.increaseBalance(5000l);
        System.out.println("Current balance is : "+user.account.checkBalance());
        user.account.deductBalance(2000l);
        System.out.println("Current balance is : "+user.account.checkBalance());
    }
}
