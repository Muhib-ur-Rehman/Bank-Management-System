package com.company;

public class Account {
    private String accNo;
    private long accBalance;

    public Account(String accNo, long accBalance) {
        this.accNo = accNo;
        this.accBalance = accBalance;
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

    public void deductBalance(Long amount){
        this.accBalance=this.accBalance-amount;
    }

    public void increaseBalance(Long amount){
        this.accBalance=this.accBalance+amount;
    }

    public Long checkBalance(){
        return this.accBalance;
    }
}
