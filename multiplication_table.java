import java.util.Scanner;
import java.util.*;




public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int mul=0;
        for(int i=1;i<=10;i++)
        {
            mul=n*i;
            System.out.println(n + "*" + i +"="+mul);
        }


    }
}
