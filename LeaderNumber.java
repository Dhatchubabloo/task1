package programs;
import java.util.Scanner;
public class LeaderNumber{
    Scanner scan = new Scanner(System.in);
    public void leaders(){
        System.out.println("enter the array size");
        int n = scan.nextInt();
        int [] a = new int[n];
        System.out.println("enter array values");
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            a[i] = x;
        }
        int count =0;
        int j=0;
        for(int i=0;i<n;i++){
            for(j=i;j<n;j++){
                if(!(a[i]>=a[j])){
                    count++;
                }
            }
            if(count==0){
                System.out.print(a[i]+" ");
            }
            count=0;
        }
    }
}