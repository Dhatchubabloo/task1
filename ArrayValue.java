package programs;
import java.util.Scanner;
public class ArrayValue{
    Scanner scan = new Scanner(System.in);
    public boolean isContains(){
        System.out.println("enter the array size");
        int number = scan.nextInt();
        int [] display = new int[number];
        System.out.println("enter array values");
        for(int i=0;i<n;i++){
            int token = scan.nextInt();
            display[i] = token;
        }
        System.out.println("enter the element to check it is present in this array or not");
        int value = scan.nextInt();
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
