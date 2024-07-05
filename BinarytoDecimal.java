import java.util.Scanner;
public class BinarytoDecimal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int rem=0;
        int t=0;
        int power=0;
        int c=0;
        while(n!=0)
        {   
            rem=(n%10);
           // power=(int) Math.pow(2,c);
            t=(int) (t+rem *(Math.pow(2, c)));
            n=n/10;
            c++;
        }
        System.out.println(t);

    }
}