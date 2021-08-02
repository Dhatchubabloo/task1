package programs;
import java.util.Scanner;
public class CommonElements{
    Scanner scan = new Scanner(System.in);
    public void commonInt(){
        System.out.println("for an integer elements");
        System.out.println("enter the size of 1st Array");
        int number = scan.nextInt();
        int [] display = new int[number];
        System.out.println("enter array values");
        for(int i=0;i<number;i++){
            int token = scan.nextInt();
            display[i] = token;
        }
        System.out.println("enter the size of 2nd Array");
        int number1 = scan.nextInt();
        int [] display1 = new int[number1];
        System.out.println("enter array values");
        for(int i=0;i<number1;i++){
            int token = scan.nextInt();
            display1[i] = token;
        }
        System.out.println("common elements between two integer arrays are:");
        for(int i=0;i<number;i++){
            for(int j=0;j<number1;j++){
                if(display[i] == display1[j]){
                    System.out.print(display[i]+" ");
                    break;
                }
            }
        }
        System.out.println();
    }
    public void commanString(){
        System.out.println("for an String elements");
        System.out.println("enter the size of 1st Array");
        int number = scan.nextInt();
        String word[]  = new String[number];
        System.out.println("enter array values");
        for(int i=0;i<number;i++){
            String token = scan.next();
            word[i] = token;
        }
        System.out.println("enter the size of 2nd Array");
        int number1 = scan.nextInt();
        String word1[]  = new String[number1];
        System.out.println("enter array values");
        for(int i=0;i<number1;i++){
            String token = scan.next();
            word1[i] = token;
        }
        System.out.println("common elements between two string arrays are:");
        for(int i=0;i<number;i++){
            for(int j=0;j<number1;j++){
                if(word[i].equals(word1[j])){
                    System.out.print(word[i]+" ");
                }
            }
        }
    }
}