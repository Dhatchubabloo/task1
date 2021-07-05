package programs;
import java.util.Scanner;
public class OddevenArray{
    Scanner scan = new Scanner(System.in);
    public void item(){
        System.out.println("enter the array size");
        int n = scan.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int evencount = 0;
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            a[i] = x;
            if(x%2==0)
            evencount++;
        }
        int k=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                b[k] = a[i];
                k++;
            }
            else{
                b[evencount] = a[i];
                evencount++;
            }
        }
        for(int i=0;i<evencount;i++){
            System.out.print(b[i]+" ");
        }
    }
}