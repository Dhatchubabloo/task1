package programs;
import java.util.Scanner;
public class AddSum{
    Scanner scan = new Scanner(System.in);
    public void sumVal(){
        System.out.println("enter the array size");
        int number = scan.nextInt();
        int [] display = new int[number];
        System.out.println("enter array values");
        for(int i=0;i<number;i++){
            int token = scan.nextInt();
            display[i] = token;
        }
        System.out.println("the target value is");
        int target = scan.nextInt();
        for(int i=0;i<number;i++){
            for(int j=i+1;j<number;j++){
                if(i!=j){
                    int sum = display[i]+display[j];
                    if(sum==target){
                        System.out.println("the sum of "+display[i]+" and "+display[j]+" is "+target);
                    }
                }
            }
        }
    }
}
