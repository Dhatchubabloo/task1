package programs;
import java.util.Scanner;
public class Remove{
        Scanner scan = new Scanner(System.in);
        public void removeElement(){
        	  System.out.println("enter the array size");
              int number = scan.nextInt();
              int [] display = new int[number];
              System.out.println("enter array values");
              for(int i=0;i<number;i++){
                  int token = scan.nextInt();
                  display[i] = token;
              }
            System.out.println("enter the element to remove");
            int item = scan.nextInt();
            for(int i=0;i<number;i++){
                if(display[i]==item){
                    display[i] = display[i+1];
                    System.out.print(display[i]+" ");
                    i++;
                }
                else{
                    System.out.print(display[i]+" ");
                }
            }
        }
}