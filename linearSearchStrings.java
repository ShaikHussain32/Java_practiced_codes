import java.util.Scanner;

public class linearSearchStrings{
    
    public static void findstring(String[] arr,String key)
    {
        for(int i=0;i<arr.length;i++)
        {
        if(key.equals(arr[i]))
        {
            System.out.println("index at"+i);
        }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]={"mango","apple","goa","pineapple","grapes"};

        String key=sc.nextLine();

        findstring(arr,key);
    }
}