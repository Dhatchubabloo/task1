package programs;
import java.util.Scanner;
public class Remove{
        Scanner scan = new Scanner(System.in);
        public void removeelement(){
            System.out.println("enter the array size");
            int n = scan.nextInt();
            int [] a = new int[n];
            System.out.println("enter array values");
            for(int i=0;i<n;i++){
                int x = scan.nextInt();
                a[i] = x;
            }
            System.out.println("enter the element to remove");
            int item = scan.nextInt();
            for(int i=0;i<n;i++){
                if(a[i]==item){
                    a[i] = a[i+1];
                    System.out.print(a[i]+" ");
                    i++;
                }
                else{
                    System.out.print(a[i]+" ");
                }
            }
        }
}