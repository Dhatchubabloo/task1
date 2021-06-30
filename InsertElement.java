package programs;
import java.util.Scanner;
public class InsertElement{
        Scanner scan = new Scanner(System.in);
        public void insertItem(){
            System.out.println("enter the array size");
            int n = scan.nextInt();
            int [] a = new int[n];
            System.out.println("enter array values");
            for(int i=0;i<n;i++){
                int x = scan.nextInt();
                a[i] = x;
            }
            int b [] =new int[n+1];
            System.out.println("enter item to insert");
            int item = scan.nextInt();
            System.out.println("enter the position to insert");
            int position = scan.nextInt();
            int c = 0;
            for(int i=0;i<n;i++){
                if(i == position-1){
                   b[c] = item;
                   c++;
                   b[c] = a[i];
                   c++;
                }
                else{
                    b[c] = a[i];
                    c++;
                }
            }
            for(int i=0;i<c;i++){
                System.out.print(b[i]+" ");
            }
        }
}