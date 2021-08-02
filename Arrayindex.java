package programs;
import java.util.Scanner;
public class Arrayindex{
    Scanner scan = new Scanner(System.in);
    public void index(){
    	 System.out.println("enter the array size");
         int number = scan.nextInt();
         int [] display = new int[number];
         System.out.println("enter array values");
         for(int i=0;i<number;i++){
             int token = scan.nextInt();
             display[i] = token;
         }
        System.out.println("enter the element to find it's index");
        int value = scan.nextInt();
        for(int i=0;i<number;i++){
            if(display[i] == value){
                System.out.println("index of given element is : "+i);
            }
        }
    }
}