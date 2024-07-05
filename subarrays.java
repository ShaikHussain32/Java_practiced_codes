

public class subarrays {
    public static void SubArrays(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {  int  start=i;
               int  end=j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(arr[k]);
                }
                System.out.print(",");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};

        SubArrays(arr);
    }
}
