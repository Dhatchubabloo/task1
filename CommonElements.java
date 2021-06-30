package programs;
import java.util.Scanner;
public class CommonElements{
    Scanner scan = new Scanner(System.in);
    public void IntCommon(){
        System.out.println("for an integer elements");
        System.out.println("enter the size of 1st Array");
        int n = scan.nextInt();
        int [] a = new int[n];
        System.out.println("enter array values");
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            a[i] = x;
        }
        System.out.println("enter the size of 2nd Array");
        int n1 = scan.nextInt();
        int [] a1 = new int[n1];
        System.out.println("enter array values");
        for(int i=0;i<n1;i++){
            int x = scan.nextInt();
            a1[i] = x;
        }
        System.out.println("common elements between two integer arrays are:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n1;j++){
                if(a[i] == a1[j]){
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
        System.out.println();
    }
    public void StringCommon(){
        System.out.println("for an String elements");
        System.out.println("enter the size of 1st Array");
        int n = scan.nextInt();
        String str[]  = new String[n];
        System.out.println("enter array values");
        for(int i=0;i<n;i++){
            String x = scan.next();
            str[i] = x;
        }
        System.out.println("enter the size of 2nd Array");
        int n1 = scan.nextInt();
        String str1[]  = new String[n1];
        System.out.println("enter array values");
        for(int i=0;i<n1;i++){
            String x = scan.next();
            str1[i] = x;
        }
        System.out.println("common elements between two string arrays are:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n1;j++){
                if(str[i].equals(str1[j])){
                    System.out.print(str[i]+" ");
                }
            }
        }
    }
}