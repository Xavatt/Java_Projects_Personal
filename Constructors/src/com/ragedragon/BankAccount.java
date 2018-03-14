package com.ragedragon;

public class BankAccount
{
    private String number;
    private double balance;
    private String customerName;
    private String phoneNumber;
    private String email;

    public BankAccount(String number, double balance, String customerName,String phoneNumber, String email)
    {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public BankAccount(String customerName, String phoneNumber, String email)
    {
        this("9999", 100.55,customerName,phoneNumber,email);
    }

    // Function to control the deposit of the balance of the account.
    public void deposit(double depositAmount)
    {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }
    // Function to control the withdrawal of the balance of the account.
    public void withdrawal(double withdrawalAmount)
    {
        // Checks that the account has enough money for the withdrawal.
        if(this.balance - withdrawalAmount < 0)
        {
            System.out.println("Only: " + balance + " available. Withdrawal not processed");
        }
        // If the account has enough money the Withdrawal proceeds.
        else
        {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = "+ this.balance);
        }
    }

    /**
     *  Getter's.
     */
    public String getNumber()
    {
        return number;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public String getEmail()
    {
        return email;
    }

    /**
     *  Setter's.
     */
    public void setNumber(String number)
    {
        this.number = number;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
