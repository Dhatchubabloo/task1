package programs;
import java.util.Scanner;
public class LeaderNumber{
    Scanner scan = new Scanner(System.in);
    public void leaders(){
    	  System.out.println("enter the array size");
          int number = scan.nextInt();
          int [] display = new int[number];
          System.out.println("enter array values");
          for(int i=0;i<number;i++){
              int token = scan.nextInt();
              display[i] = token;
          }
        int count =0;
        int j=0;
        for(int i=0;i<number;i++){
            for(j=i;j<number;j++){
                if(!(display[i]>=display[j])){
                    count++;
                }
            }
            if(count==0){
                System.out.print(display[i]+" ");
            }
            count=0;
        }
    }
}