//program to get student details
import java.util.Scanner;
 
public class Main
{
      public static void main(String args[])
      {
          String name;
          int roll, math, phy, eng;
           
          Scanner SC=new Scanner(System.in);
           
          System.out.print("Enter Name: ");
          name=SC.nextLine();
          System.out.print("Enter Roll Number: ");
          roll=SC.nextInt();
          System.out.print("Enter marks in Maths, Physics and English: ");
          math=SC.nextInt();
          phy=SC.nextInt();
          eng=SC.nextInt();
           
          int total=math+eng+phy;
          float perc=(float)total/300*100;
           
          System.out.println("Roll Number:" + roll +"\tName: "+name);
          System.out.println("Marks (Maths, Physics, English): " +math+","+phy+","+eng);
          System.out.println("Total: "+total +"\tPercentage: "+perc);
            
      }
          
}
