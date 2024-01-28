import java.util.*;
public class Question_3
{
    public static void main(String[] args){
        System.out.println("Greatest commom divisor of two numbers");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number : ");
        int n1=sc.nextInt();
        System.out.println("enter the second number : ");
        int n2=sc.nextInt();
        int a=1,i=1;
        while(i<=n1 && i<=n2){
            if(n1%i==0 && n2%i==0){
                a=i;
            }
            i++;
        }
        System.out.println(a);
    }        
}