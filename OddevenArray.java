package programs;
import java.util.Scanner;
public class OddevenArray{
    Scanner scan = new Scanner(System.in);
    public void item(){
        System.out.println("enter the array size");
        int n = scan.nextInt();
        int [] a = new int[n];
        System.out.println("enter array values");
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            a[i] = x;
        }
        int [] b = new int[50];
        int k=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                b[k] = a[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                b[k] = a[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(b[i]+" ");
        }
    }
}