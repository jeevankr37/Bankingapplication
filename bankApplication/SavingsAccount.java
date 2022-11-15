package com.tns.bankApplication;

public class SavingsAccount extends Details{
	
	@Override
	void menu2() {
		{
			System.out.println("******Welcome to Our Bank Services");
			System.out.println("1.Current account");
			System.out.println("2.Savings Account");
			System.out.println("3.Salary Account");
			System.out.println("4.Fixed Deposit Account");
			System.out.println("5.Recurring Deposit Account");
			System.out.println("6.NRI Account");
		}
	}

}
