package programs;
import java.util.Scanner;
public class SortArray{
    Scanner scan = new Scanner(System.in);
    public void sort(){
    	  System.out.println("enter the array size");
          int number = scan.nextInt();
          int [] display = new int[number];
          System.out.println("enter array values");
          for(int i=0;i<number;i++){
              int token = scan.nextInt();
              display[i] = token;
          }
          for(int i=0;i<number;i++) {
  			int small =display[i],temp=0,index=i,count=0;
  			for(int j=i+1;j<number;j++) {
  				if(display[j]<small) {
  					small = display[j];
  					index = j;
  				}
  			}
  			temp = display[i];
  			display[i] = small;
  			display[index] = temp;
  		}
  				
  		for(int i=0;i<number;i++) {
  			System.out.print(display[i]+" ");
  		}
    }
}