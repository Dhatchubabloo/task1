package programs;
import java.util.Scanner;
public class SortArray{
    Scanner scan = new Scanner(System.in);
    public void sort(){
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
                max = a[i];;
            }
        }
        int [] b= new int[max+1];
        for(int i=0;i<max+1;i++){
            b[i] = 0;
        }
        for(int i=0;i<n;i++){
            int x = a[i];
            b[x]++;
        }
        for(int i=0;i<max+1;i++){
            int x = b[i];
            while(x!=0){
                System.out.print(i+" ");
                x--;
            }
        }
    }
}