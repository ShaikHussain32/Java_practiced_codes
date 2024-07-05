import java.util.Scanner;



public class pattern4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {    c=c+1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
            
        }
    }
}