/*  !!!                               NUMBER GUSSESING GAME                         !!!
          

               POINTS                  NO.OF ATTEMPTS                       SCORE 
                 10                          1-3                              10
                 05                          4-8                              05
                 01                           >8                              00

*/
import java.util.Scanner;
import java.util.Random;
public class number{
    public static void main(String args[]){
        Random ran= new Random();
        int Randomnumber= ran.nextInt(100);
        System.out.println("Guess the number:"  );
        Scanner src= new Scanner(System.in); 
        int flag=0;
        while(true){
        int num1= src.nextInt();  
       flag++;
        if(num1==Randomnumber){
            System.out.println("Yeah! you Gussed correctly !!! HURRAH!! ");
            System.out.println("You have guessed in " +  flag  +  "  counts ");
            break;
        }
        else if(Randomnumber>num1){
            System.out.println(" the number you Guess is Higher!!! : Guess Again");
        }
        else{
            System.out.println("The number you guess is Lower: Guess Again");
        } 
        } 
        if (flag<=3){
          System.out.println("Your Score is " + 10 +" you Deserve it" );

        } 
        else if( flag==4 && flag>=8){
          System.out.println("Your Score is " + 05 +" well played");

        }
        else{
          System.out.println("Your Score is " + 00 + " Try Again!!! ");
        }
        src.close();
      }
    }
    
    
    