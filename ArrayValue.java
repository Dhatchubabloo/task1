package programs;
import java.util.Scanner;
public class ArrayValue{
    Scanner scan = new Scanner(System.in);
    public boolean testvalue(){
        System.out.println("enter the array size");
        int n = scan.nextInt();
        int [] a = new int[n];
        System.out.println("enter array values");
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            a[i] = x;
        }
        System.out.println("enter the element to check it is present in this array or not");
        int val = scan.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            if(a[i]==val){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        else{
        return false;
        }
    }
}