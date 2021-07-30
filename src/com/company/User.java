package com.company;

public class User {
    public String userName;
    public String phoneNo;
    public Account account;

    public User(String userName, String phoneNo,  Account account1) {
        this.userName = userName;
        this.phoneNo = phoneNo;
        this.account = new Account(account1.getAccNo(),account1.getAccBalance());
    }

}
