
public class Largestinarray{
    public static int largest(int[] arr)
    {   int n=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(n<arr[i])
            {
                n=arr[i];
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int arr[]={8,2,1,5,8,2,9,10,14,2};

        System.out.println("Largest element in an array is ="+largest(arr));
    }
}