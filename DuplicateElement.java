package programs;
import java.util.Scanner;
public class DuplicateElement{
    Scanner scan = new Scanner(System.in);
    public void removeDuplicate(){
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
                max = display[i];;
            }
        }
        int [] temp = new int[max+1];
        for(int i=0;i<max+1;i++){
            temp[i] = 0;
        }
        for(int i=0;i<number;i++){
            int token = display[i];
            temp[token]++;
        }
        for(int i=0;i<max+1;i++){
            if(temp[i]>0){
                System.out.print(i+" ");
            }
        }
    }
}