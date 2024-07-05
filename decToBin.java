import java.util.Scanner;

public class decToBin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int rem=0;
        int power=0;
        int t=0;
        while(n!=0)
        {
            rem=n%2;
            t=(int) (t+rem*(Math.pow(10, power)));
            n=n/2;
            power++;

        }
        System.out.println(t);
    }
}