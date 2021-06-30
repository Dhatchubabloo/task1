package programs;
import java.util.Scanner;
public class Arraysum{
    Scanner scan = new Scanner(System.in);
    public void sum(){
        System.out.println("enter the array size");
        int n = scan.nextInt();
        int [] a = new int[n];
        System.out.println("enter array values");
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            a[i] = x;
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+a[i];
        }
        System.out.println("sum of the array elements is");
        System.out.println(sum);
    }
}