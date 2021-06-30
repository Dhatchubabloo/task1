package programs;
import java.util.Scanner;
public class OddEven{
    Scanner scan = new Scanner(System.in);
    public void oddevenElements(){
        System.out.println("enter the array size");
        int n = scan.nextInt();
        int [] a = new int[n];
        System.out.println("enter array values");
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            a[i] = x;
        }
        int oddcount = 0;
        int evencount = 0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0)
                evencount++;
            else
            oddcount++;
        }
        System.out.println("number of odd integers in given array are : "+oddcount);
        System.out.println("number of even integers in given array are : "+evencount);
    }
}