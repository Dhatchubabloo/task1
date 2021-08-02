import programs.*;
import java.util.Scanner;
public class Task1Runner{
    public static void main(String  [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value from 1 to 15 to execute the corresponding program");
        int n = scan.nextInt();
        switch(n){
            case 1:
            Arrayindex arrayindex = new Arrayindex();
            arrayindex.index();
            break;

            case 2:
            ArrayTotal arrayTotal = new ArrayTotal();
            arrayTotal.sum();
            break;

            case 3:
            Remove remove = new Remove();
            remove.removeElement();
            break;

            case 4:
            InsertElement insertelement = new InsertElement();
            insertelement.insertItem();
            break;

            case 5:
            ArrayValue value = new ArrayValue();
            System.out.println(value.isContains());
            break;

            case 6:
            MaxMin element  = new MaxMin();
            element.showValue();
            break;

            case 7:
            CommonElements com = new CommonElements();
            com.commonInt();
            com.commanString();
            break;

            case 8:
            DuplicateElement duplicate  = new DuplicateElement();
            duplicate.removeDuplicate();
            break;

            case 9:
            OddEven oddeven = new OddEven();
            oddeven.showElements();
            break;

            case 10:
            Average avg = new Average();
            avg.avgValue();
            break;

            case 11:
            AddSum result = new AddSum();
            result.sumVal();
            break;

            case 12:
            ReverseArray reversearray = new ReverseArray();
            reversearray.reverse();
            break;

            case 13:
            OddevenArray array = new OddevenArray();
            array.item();
            break;
            
            case 14:
            SortArray sortarray = new SortArray();
            sortarray.sort();
            break;

            case 15:
            LeaderNumber lead = new LeaderNumber();
            lead.leaders();
            break;

            default :
            System.out.println("invalid input");
            break;
        }
    } 
}