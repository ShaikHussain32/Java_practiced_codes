import java.util.Scanner;



public class sumofab_using_functions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        sumofab(a,b);
        
        
    }
    public static void sumofab(int a,int b)
    {   int sum=a+b;
        System.out.println(sum);
        
    }
}