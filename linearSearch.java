import java.util.Scanner;


public class linearSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];
        
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        int key=sc.nextInt();
        System.out.println(findindex(arr, key));

    }
        public static int  findindex(int[] arr,int key){
        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                return i;
            }
        //    System.out.print(arr[i]);
            
        }
        return 0;

    }
}