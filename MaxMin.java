package programs;
import java.util.Scanner;
public class MaxMin{
    Scanner scan = new Scanner(System.in);
    public void maxminValue(){
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
        System.out.println("maximum value of the array");
        System.out.println(max);
        int min = a[0];
        for(int i=1;i<n;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("minimum value of the array");
        System.out.println(min);
    }
}