package programs;
import java.util.Scanner;
public class Average{
    Scanner scan = new Scanner(System.in);
    public void avgValue(){
        System.out.println("enter the array size");
        int number = scan.nextInt();
        int [] display = new int[number];
        System.out.println("enter array values");
        for(int i=0;i<number;i++){
            int token = scan.nextInt();
            display[i] = token;
        }
        int max = a[0];
        for(int i=1;i<number;i++){
            if(display[i]>max){
                max = display[i];
            }
        }
        int min = a[0];
        for(int i=1;i<number;i++){
            if(display[i]<min){
                min = display[i];
            }
        }
        float sum= 0;
        for(int i=0;i<number;i++){
            if(display[i]!=max && display[i]!=min){
                sum = sum+display[i];
            }
        }
        float avg = sum/(number-2);
        System.out.println("average of given array except smallest and largest value of the array");
        System.out.println(avg);
    }
}
