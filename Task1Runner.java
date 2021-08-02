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
            Arraysum arraysum = new Arraysum();
            arraysum.sum();
            break;

            case 3:
            Remove remove = new Remove();
            remove.removeelement();
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
            element.maxminValue();
            break;

            case 7:
            CommonElements com = new CommonElements();
            com.IntCommon();
            com.StringCommon();
            break;

            case 8:
            DuplicateElement duplicate  = new DuplicateElement();
            duplicate.removeDup();
            break;

            case 9:
            OddEven oddeven = new OddEven();
            oddeven.oddevenElements();
            break;

            case 10:
            Average avg = new Average();
            avg.avgVal();
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
