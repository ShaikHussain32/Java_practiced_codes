


public class BinarySearch{


    public static int BinSearch(int[] arr,int key)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {   int mid=(start+end)/2;
            if(key==arr[mid])
            {
                return mid;
            }
            if(arr[mid]<key)
            {
                start=mid+1;
            }
            else{           //if mid is greater than key then end=mid-1
                end =mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,9,12,14,17};

        int key=14;

        System.out.println(BinSearch(arr,key));
    }
}