import java.util.Scanner;

public class pattern8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int s=2*n;
        for(int i=1;i<=n;i++)
        {   
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<s;k++)
            {
                System.out.print("* ");
            }
            s=s-2;
            System.out.println();
        }
    }
}