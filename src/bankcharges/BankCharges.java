
package bankcharges;
import java.util.*;

public class BankCharges {
    public static double calculateCharges(Integer count){
    double charges;
    double sum;
    if(count < 20){
       charges = 0.10*count;
       sum = 10+charges;
    }else if(count>= 20 && count < 39){
       charges = 0.08*count;
       sum = 10+charges;
    }else if(count>= 40 && count < 59){
       charges = 0.06*count;
       sum = 10+charges;
    }else{
       charges = 0.04*count;
       sum = 10+charges;
    }
     return sum; 
    }
   
    public static void main(String[] args) {
     try {
    Scanner inputName = new Scanner(System.in);
    System.out.print("Enter number of checks written for the month:");
    int count = inputName.nextInt();
    double charges = calculateCharges(count);
    System.out.println("Bank service fee for the month is $"+charges);
    inputName.close();
    }catch (Exception e) {
      System.out.println("Please enter number only");
    }       
 }    
}
