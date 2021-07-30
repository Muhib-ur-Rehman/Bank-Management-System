package com.company;

public class Account {
    private String accNo;
    private long accBalance;
    private String password;

    public Account(String accNo, long accBalance, String password) {
        this.accNo = accNo;
        this.accBalance = accBalance;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public long getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(long accBalance) {
        this.accBalance = accBalance;
    }

    public Boolean withDraw(Long amount){
        if (this.accBalance < amount){
            return false;
        }
        else{
            this.accBalance=accBalance-amount;
            return true;
        }
    }

    public Boolean deposit(Long amount){
        this.accBalance=this.accBalance+amount;
        return true;
    }

    public Long checkBalance(){
        return this.accBalance;
    }
}
