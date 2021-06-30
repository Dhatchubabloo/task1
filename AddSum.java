package programs;
import java.util.Scanner;
public class AddSum{
    Scanner scan = new Scanner(System.in);
    public void sumVal(){
        System.out.println("enter the array size");
        int n = scan.nextInt();
        int [] a = new int[n];
        System.out.println("enter array values");
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            a[i] = x;
        }
        System.out.println("the target value is");
        int target = scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i!=j){
                    int x = a[i]+a[j];
                    if(x==target){
                        System.out.println("the sum of "+a[i]+" and "+a[j]+" is "+target);
                    }
                }
            }
        }
    }
}