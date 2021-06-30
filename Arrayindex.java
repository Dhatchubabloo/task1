package programs;
import java.util.Scanner;
public class Arrayindex{
    Scanner scan = new Scanner(System.in);
    public void index(){
        System.out.println("enter the array size");
        int n = scan.nextInt();
        int [] a = new int[n];
        System.out.println("enter array values");
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            a[i] = x;
        }
        System.out.println("enter the element to find it's index");
        int value = scan.nextInt();
        for(int i=0;i<n;i++){
            if(a[i] == value){
                System.out.println("index of given element is : "+i);
            }
        }
    }
}