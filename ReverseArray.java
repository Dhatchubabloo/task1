package programs;
import java.util.Scanner;
public class ReverseArray{
    Scanner scan = new Scanner(System.in);
    public void reverse(){
        System.out.println("enter the array size");
        int n = scan.nextInt();
        int [] a = new int[n];
        System.out.println("enter array values");
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            a[i] = x;
        }
        System.out.println("the reversing array is");
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}