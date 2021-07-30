package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<User> usersList = new ArrayList<>();
        usersList.add( new User("Ali","03001111111","11111",25000l,"12345"));
        usersList.add( new User("Ahmed","03001111111","22222",40000l,"12345"));
        usersList.add( new User("Muhib","03001111111","33333",50000l,"12345"));
        usersList.add( new User("Bilal","03001111111","44444",70000l,"12345"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Account number ?");
        String accNo = sc.next();
        System.out.println("Enter password ?");
        String pass = sc.next();
        boolean flag = false;
        int i = 0;
        for (i =0;i<usersList.size();i++){
            if (usersList.get(i).account.getAccNo().equals(accNo) && usersList.get(i).account.getPassword().equals(pass)){
                flag = true;
                break;
            }
        }
        if (flag == true) {
            while (true) {
                System.out.println("Select your choice :");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                int choice = sc.nextInt();
                boolean result;
                boolean doExit=false;
                switch (choice) {
                    case 1:
                        System.out.println("Enter the amount you want to withdraw ?");
                        Long withdrawAmount = sc.nextLong();
                        result = usersList.get(i).account.withDraw(withdrawAmount);
                        if (result) {
                            System.out.println("Success, withdrawing amount is " + withdrawAmount);
                        } else {
                            System.out.println("You dont have enough balance to withdraw this amount");
                        }
                        break;
                    case 2:
                        System.out.println("Enter the amount you want to deposit ?");
                        Long depositAmount = sc.nextLong();
                        result = usersList.get(i).account.deposit(depositAmount);
                        if (result) {
                            System.out.println("Success, amount is successfully deposited to your account...");
                        }
                        break;
                    case 3:
                        System.out.println("Your Current Account Balance is " + usersList.get(i).account.checkBalance());
                        break;
                    case 4:
                        doExit=true;
                        break;
                    default:
                        System.out.println("Wrong choice, enter again...");
                }
                if (doExit){
                    break;
                }
            }
        }
        else{
            System.out.println("Account number or password is incorrect...");
        }
    }
}
