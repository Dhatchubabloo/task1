package programs;
import java.util.Scanner;
public class ReverseArray{
    Scanner scan = new Scanner(System.in);
    public void reverse(){
    	  System.out.println("enter the array size");
          int number = scan.nextInt();
          int [] display = new int[number];
          System.out.println("enter array values");
          for(int i=0;i<number;i++){
              int token = scan.nextInt();
              display[i] = token;
          }
        System.out.println("the reversing array is");
        for(int i=number-1;i>=0;i--){
            System.out.print(display[i]+" ");
        }
    }
}