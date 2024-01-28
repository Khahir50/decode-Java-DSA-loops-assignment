import java.util.*;
public class Question_1
{
	public static void main(String[] args) {
		System.out.println("Sum of n natural numbers until the n");
		Scanner sc = new Scanner(System.in);
		int n,i,a=0;
		System.out.println("enter the value upto where you want to add : ");
		n=sc.nextInt();
		for(i=0;i<=n;i++){
		    a=a+i;
		}
		System.out.println("Sum of n natural numbers is : "+a);
		
	}
}