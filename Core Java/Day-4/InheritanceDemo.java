package com.hcl.inh;
// Superclass
class BankAccount {
    double withdrawAmount;
    double depositAmount;
    double interestRate = 9.5;
    double balance;

    void depositMoney(double amount) {
        depositAmount = amount;
        System.out.println("Deposited Amount: " + depositAmount);
    }

    void withdrawMoney(double amount) {
        withdrawAmount = amount;
        balance = depositAmount - withdrawAmount;
        System.out.println("Withdrawn Amount: " + withdrawAmount);
        System.out.println("Balance after withdrawal: " + balance);
    }
}

// Subclass for NRI Account
class NRIAccount extends BankAccount {
    void applyFixedDeposit() {
        interestRate = 6.5;
        System.out.println("NRIAccount Fixed Deposit Applied. New Interest Rate: " + interestRate + "%");
    }
}

// Subclass for Senior Citizen Account
class SeniorCitizenAccount extends BankAccount {
    void applyFixedDeposit() {
        interestRate = 10.5;
        System.out.println("SeniorCitizenAccount Fixed Deposit Applied. New Interest Rate: " + interestRate + "%");
    }
}

// Demo class with main method
public class InheritanceDemo {
    public static void main(String[] args) {
        // Create NRIAccount instance
        NRIAccount nri = new NRIAccount();
        nri.depositMoney(5000);
        nri.withdrawMoney(2000);
        nri.applyFixedDeposit();

        System.out.println();

        // Create SeniorCitizenAccount instance
        SeniorCitizenAccount senior = new SeniorCitizenAccount();
        senior.depositMoney(8000);
        senior.withdrawMoney(3000);
        senior.applyFixedDeposit();
    }
}
