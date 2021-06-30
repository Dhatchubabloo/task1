package programs;
import java.util.Scanner;
public class Average{
    Scanner scan = new Scanner(System.in);
    public void avgVal(){
        System.out.println("enter the array size");
        int n = scan.nextInt();
        int [] a = new int[n];
        System.out.println("enter array values");
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            a[i] = x;
        }
        int max = a[0];
        for(int i=1;i<n;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        int min = a[0];
        for(int i=1;i<n;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        float sum= 0;
        for(int i=0;i<n;i++){
            if(a[i]!=max && a[i]!=min){
                sum = sum+a[i];
            }
        }
        float avg = sum/(n-2);
        System.out.println("average of given array except smallest and largest value of the array");
        System.out.println(avg);
    }
}