
public class ReverseanArray{
public static void reversearr(int[] arr)
{
    int start=0;
    int end=arr.length-1;
    int temp=0;
    while(start<=end)
    {
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
}

public static void main(String[] args) {
    int arr[]={1,2,3,4,5};

    reversearr(arr);

    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
}
}

