package programs;
import java.util.Scanner;
public class ArraySum{
    Scanner scan = new Scanner(System.in);
    public void sum(){
        System.out.println("enter the array size");
        int number = scan.nextInt();
        int [] display = new int[number];
        System.out.println("enter array values");
        for(int i=0;i<n;i++){
            int token = scan.nextInt();
            display[i] = token;
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+a[i];
        }
        System.out.println("sum of the array elements is");
        System.out.println(sum);
    }
}
