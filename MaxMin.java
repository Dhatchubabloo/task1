package programs;
import java.util.Scanner;
public class MaxMin{
    Scanner scan = new Scanner(System.in);
    public void showValue(){
    	  System.out.println("enter the array size");
          int number = scan.nextInt();
          int [] display = new int[number];
          System.out.println("enter array values");
          for(int i=0;i<number;i++){
              int token = scan.nextInt();
              display[i] = token;
          }
        int max = display[0];
        for(int i=1;i<number;i++){
            if(display[i]>max){
                max = display[i];
            }
        }
        System.out.println("maximum value of the array");
        System.out.println(max);
        int min = display[0];
        for(int i=1;i<number;i++){
            if(display[i]<min){
                min = display[i];
            }
        }
        System.out.println("minimum value of the array");
        System.out.println(min);
    }
}