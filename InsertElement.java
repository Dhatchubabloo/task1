package programs;
import java.util.Scanner;
public class InsertElement{
        Scanner scan = new Scanner(System.in);
        public void insertItem(){
        	  System.out.println("enter the array size");
              int number = scan.nextInt();
              int [] display = new int[number];
              System.out.println("enter array values");
              for(int i=0;i<number;i++){
                  int token = scan.nextInt();
                  display[i] = token;
              }
            int temp [] =new int[number+1];
            System.out.println("enter item to insert");
            int item = scan.nextInt();
            System.out.println("enter the position to insert");
            int position = scan.nextInt();
            int value = 0;
            for(int i=0;i<number;i++){
                if(i == position-1){
                   temp[value] = item;
                   value++;
                   temp[value] = display[i];
                   value++;
                }
                else{
                    temp[value] = display[i];
                    value++;
                }
            }
            for(int i=0;i<value;i++){
                System.out.print(temp[i]+" ");
            }
        }
}