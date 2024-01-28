import java.util.*;
public class Question_2
{
    public static void main(String[] args){
        System.out.println("Printing the table of given number");
        Scanner sc=new Scanner(System.in);        
        System.out.println("enter upto how many multiples you want ex:10 or 20");        
        int i=sc.nextInt();        
        System.out.println("Enter the number of which you want the table : ");        
        int n=sc.nextInt();
        int res=n*i;
        for(int j=1;j<=i;j++){
            System.out.println(n+"*"+j+"="+res);
        }
    }
}