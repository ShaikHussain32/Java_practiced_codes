import java.util.Scanner;


public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]={5,4,1,3,2};
        Bubblesort(arr);


        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void Bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
    }
}
