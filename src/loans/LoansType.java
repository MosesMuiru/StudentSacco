package loans;
import java.util.Scanner;
import Accounts.amountSaved;




public class LoansType implements Intere{
    amountSaved amount = new amountSaved();
    public int period;
    public int rate;
    public int principle;


    Scanner scan = new Scanner(System.in);

    private int emergency = 1;
    private int shortTerm = 2;
    private int longTerm = 3;

    int savings = amount.amountSavedByUser();
    public void showTheSaving(){
        System.out.println("the amount of savings are "+ savings);
    }
   public int typeOfLoan(){

       System.out.println("Enter the type of loan you want to boorrow--");
       System.out.println("1.Emergency loan");
       System.out.println("2. shortTerm Loan");
       System.out.println("3. Long Term Loan");
       return scan.nextInt();

    }


    //the amount user is recquired to pay
    //the interest
   public int interest(){
       int interest = this.period * this.rate * this.principle /100;

       return interest;

    }


// emergeny
    public void emergency(){

       period = 1;

        rate = 4;



        System.out.println("amount for emergency is --"+ savings+"--the only amount that can be given");
        System.out.println("enter the amount of loan--> ");
         principle = scan.nextInt();

        if(principle > savings) {
            System.out.println("choose another amount ");
            emergency();
        }

            System.out.println("loan --" + principle);

            System.out.println("amount you are supposed to pay-=> " + (principle + interest()));

        System.out.println("the time you must pay is by---"+ period + " month");


        //loan amout == total saving
//        total amount of loan offered

    }


    //Short term loan

    public void shortTermLoan(){
       period = 2;
       rate = 6;


        System.out.println("the amount that you have saved is=== "+savings);
        int amountOffered = savings * 2;
        System.out.println("the amount of loan offered here is=== "+ (amountOffered));

        System.out.println("Enter the amount of loan you want for short term loan");

        principle = scan.nextInt();

        if(principle > amountOffered ) {
            System.out.println("sorry you cannot be loaned--amount must be less than "+amountOffered);

            shortTermLoan();
        }
        System.out.println("your loan is == "+ principle);

        System.out.println("the period to pay the loan is "+ period);

        System.out.println("the interest is"+interest());

        System.out.println("amount supposed to be paid "+(interest() + principle));



    }

    //long term loan

    public void longTermLoan(){
        period = 3;
        rate = 8;

        showTheSaving();

        int amountOffered = savings * 3;
        System.out.println("the amount of loan offered here is=== "+ (amountOffered));

        System.out.println("Enter the amount of loan you want for long term loan");

        principle = scan.nextInt();

        if(principle > amountOffered ) {
            System.out.println("sorry you cannot be loaned--amount must be less than "+amountOffered);

            shortTermLoan();
        }
        System.out.println("your loan is == "+ principle);

        System.out.println("the period to pay the loan is "+ period);

        System.out.println("the interest is "+interest());

        System.out.println("amount supposed to be paid "+(interest() + principle));



    }

    public int choice = typeOfLoan();
    //choosing loan
    public void chooseLoan(int choice){
        this.choice = choice;

        if(choice == 1) emergency();
        else if(choice == 2) shortTermLoan();
        else longTermLoan();

    }

}

