package programs;
import java.util.Scanner;
public class OddEven{
    Scanner scan = new Scanner(System.in);
    public void showElements(){
    	  System.out.println("enter the array size");
          int number = scan.nextInt();
          int [] display = new int[number];
          System.out.println("enter array values");
          for(int i=0;i<number;i++){
              int token = scan.nextInt();
              display[i] = token;
          }
        int oddCount = 0;
        int evenCount = 0;
        for(int i=0;i<number;i++){
            if(display[i]%2==0)
                evenCount++;
            else
            oddCount++;
        }
        System.out.println("number of odd integers in given array are : "+oddCount);
        System.out.println("number of even integers in given array are : "+evenCount);
    }
}