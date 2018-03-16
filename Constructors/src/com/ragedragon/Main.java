package com.ragedragon;

public class Main
{

    public static void main(String[] args)
    {
        BankAccount xavierAccount = new BankAccount("9029",0.00,"Xavier Guinto", "+52 55-32-76-76-43","xavierguinto3@outlook.es");
       /* xavierAccount.setNumber("9029");
        xavierAccount.setBalance(0.00);
        xavierAccount.setCustomerName("Xavier Guinto");
        xavierAccount.setEmail("xavier3@outlook.es");
        xavierAccount.setPhoneNumber("+52 55-32-76-76-43");*/

        System.out.println("The client information is");
        System.out.println("Number: " + xavierAccount.getNumber());
        System.out.println("Balance: "+ xavierAccount.getBalance());
        System.out.println("Customer Name: "+ xavierAccount.getCustomerName());
        System.out.println("Phone Number: "+ xavierAccount.getPhoneNumber());
        System.out.println("Email: "+ xavierAccount.getEmail());


        System.out.println("\n");
        xavierAccount.deposit(50.0);
        xavierAccount.withdrawal(100.0);
        System.out.println("\n");
        xavierAccount.deposit(51.0);
        xavierAccount.withdrawal(100.0);

        BankAccount georgeAccount = new BankAccount("George","53182689","george@gmail.com");
    }
}
