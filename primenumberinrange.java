import java.util.Scanner;




public class primenumberinrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        
        for(int i=2;i<=n;i++)
        {
            isprime(i);
        }
    }
    public static void isprime(int n)
    {   int c=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0){c++;}
        }
        if(c==1){
            System.out.println(n);
        }
        
    }
}
