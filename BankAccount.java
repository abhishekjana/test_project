package accountpack;

import java.util.Scanner;

public class BankAccount {
public static void main(String[] args) {
		
		
		int ch;
		int  blnc=10000;
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME");
		System.out.println("Enter your Bank Account type");
		System.out.println("1:Saving Account");
		System.out.println("2:Current Account");
		ch=sc.nextInt();
		while(true) {
		switch(ch)
		{
			case 1:
				int op;
				System.out.println("Enter your choice");
				System.out.println("1.Withdraw");
				System.out.println("2.Deposit");
				System.out.println("3.Balance");
				
				op=sc.nextInt();
				while(true) {
				switch(op)
				{
				case 1:
					System.out.println("Enter the amount");
					int with_amt=sc.nextInt();
					if(with_amt<=5000 && with_amt>0)
					{
						blnc=blnc-with_amt;
					}
					else
						System.out.println("Limit exceeded");
					break;
					
				case 2:
					System.out.println("enter your amount");
					int dep_amt=sc.nextInt();
					blnc=blnc+dep_amt;
					break;
				
				case 3:{
					System.out.println("Your Available Balance is: " +blnc);}
					break;
				
				default :
		            System.out.println("Invalid option");
					
		            sc.close();
		    		System.exit(0);
				}
				break;
				
				}
				
				int op1;
				System.out.println("Enter your choice");
				System.out.println("1.Withdraw");
				System.out.println("2.Deposit");
				System.out.println("3.Balance");
				
				op1=sc.nextInt();
				while(true) {
				switch(op1)
				{
				case 1:
					System.out.println("Enter the amount");
					int with_amt=sc.nextInt();
					if(with_amt<=5000 && with_amt>0)
					{
						blnc=blnc-with_amt;
					}
					else
						System.out.println("Limit exceeded");
					break;
					
				case 2:
					System.out.println("enter your amount");
					int dep_amt=sc.nextInt();
					blnc=blnc+dep_amt;
					break;
				case 3:
					System.out.println("Your Available Balance is: "+blnc);
					break;
				
				default :
		            System.out.println("Invalid option");
		            sc.close();
		    		System.exit(0);
				}
				}
				
			default :
	            System.out.println("Invalid Bank Type");
				
		sc.close();
		System.exit(0);
		}
		}
	}
		

}
