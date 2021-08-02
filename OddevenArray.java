package programs;
import java.util.Scanner;
public class OddevenArray{
    Scanner scan = new Scanner(System.in);
    public void item(){
        System.out.println("enter the array size");
        int number = scan.nextInt();
        int oddDisplay[] = new int[number];
        int evenDisplay[] = new int[number];
        int evenCount = 0;
        System.out.println("enter array elements");
        for(int i=0;i<number;i++){
            int token = scan.nextInt();
            oddDisplay[i] = token;
            if(token%2==0)
            evenCount++;
        }
        int k=0;
        for(int i=0;i<number;i++){
            if(oddDisplay[i]%2==0){
                evenDisplay[k] = oddDisplay[i];
                k++;
            }
            else{
                evenDisplay[evenCount] = oddDisplay[i];
                evenCount++;
            }
        }
        for(int i=0;i<evenCount;i++){
            System.out.print(evenDisplay[i]+" ");
        }
    }
}