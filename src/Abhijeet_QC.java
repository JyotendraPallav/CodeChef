
import java.util.*;
interface InfoBank{
    void DataInput();
    void Withdrawl();
}
class QuestionTwo implements InfoBank{
    Scanner sc=new Scanner(System.in);
    double Current_Balance,Withdrawl_Amount;

    QuestionTwo(){
        
    }
    @Override
    public void DataInput(){
        System.out.println("Enter the current bank balance : ");
        Current_Balance=sc.nextInt();
        
        System.out.println("Enter the withdrawl amount : ");
        Withdrawl_Amount=sc.nextInt();
    
    }
    @Override 
    public void Withdrawl(){
        if(Current_Balance<2000 && Withdrawl_Amount<2000){
        if(Withdrawl_Amount>Current_Balance || Withdrawl_Amount%5!=0){
            System.out.println("Insufficent fund or Withdrawl amount is not divisible by 5");
            System.out.println("Current Balance : "+Current_Balance);
        }
        else {
            Current_Balance=Current_Balance-Withdrawl_Amount;
            Current_Balance=Current_Balance-0.5;
            System.out.println("Transcation Successful!");
            System.out.println("Current Balance : "+Current_Balance);
        }
}
        else{
            System.out.println("Enter the Balance and Withdrawl amount between 0 and 2000");
        }
}
}
public class Abhijeet_QC {
    public static void main(String args[]){
        QuestionTwo q2=new QuestionTwo();
        q2.DataInput();
        q2.Withdrawl();
    }
    
}