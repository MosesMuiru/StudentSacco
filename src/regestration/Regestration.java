package regestration;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Regestration {
    Scanner scan = new Scanner(System.in);

    private String name;
    private int age;
    private int yearOfBirth;
    private long mobileNumber;
    private int regAmount;

    void setName(String name)
    {
        name = scan.next();
        this.name = name;

    }
    void setAge(int age)
    {
        System.out.println("-----please enter your age----");
        age = scan.nextInt();
        if(age>18||age<34) this.age = age;
        else System.out.println("sorry you cannot regester---grow up");
    }
    void setYearOfBirth(int yearOfBirth){
        System.out.println("enter the year of Birth");
        yearOfBirth = scan.nextInt();
        if(yearOfBirth > 2006 ) this.yearOfBirth = yearOfBirth;
        else System.out.println("you are such a child");

    }
    void mobileNumber(long number){
        System.out.println("-----enter you number---");
        number = scan.nextInt();
        this.mobileNumber = number;
    }
    //lets get the values
    int getAge(){return age;}
    int getYearOfBirth(){return yearOfBirth;}
    long getMobileNumber(){return mobileNumber;}
    String getName(){return name;}

    //getting regAmount
    void setRegAmount(){
        System.out.println("enter the amount you want to save + plus the regestration amount");
        int amount = scan.nextInt();
        int regAmount = amount - 500;
        if(regAmount<500) System.out.println("sorry you have not entered the regestration amount");
        else System.out.println("welcome to these group");

    }
  public   int getRegAmount(){
        return regAmount;
    }



}
//class that stores the element

