import java.util.*;
public class Question_5
{
    public static void main(String[] args){
        System.out.println("fibonocci series up to nth term");
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c,n,i;
        n=sc.nextInt();
        System.out.println("Printing the fibonocci series");
        System.out.println(a);
        System.out.println(b);
        if(n==0){
            System.out.println(0);
        }
        else{
            for(i=2;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
                System.out.println(b);
            }
        }
    
        
    }
}