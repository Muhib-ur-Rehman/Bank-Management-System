package com.company;

public class User {
    public String userName;
    public String phoneNo;
    public Account account;

    public User(String userName, String phoneNo,  String accNo , Long accBal , String password) {
        this.userName = userName;
        this.phoneNo = phoneNo;
        this.account = new Account(accNo,accBal,password);
    }

    public String toString(User user){
        return "Name = "+user.userName +" , Phone no = "+user.phoneNo + " , Account number = "+user.account.getAccNo()+" , Password = "+user.account.getPassword()+" , Amount in balance = "+user.account.getAccBalance();
    }

}
