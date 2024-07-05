import java.util.Scanner;
import java.util.*;


public class first_n_natural_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
       {
             sum=sum+i;
       }
       System.out.println(sum);
    }
}
