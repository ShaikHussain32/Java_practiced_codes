


public class Selectionsort{
    public static void main(String[] args) {
        int[] arr={5,4,1,3,2};

        SelectionSort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void SelectionSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {   int minpos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minpos]>arr[j])
                {
                    minpos=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }
    }
}