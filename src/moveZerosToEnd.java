import java.util.Arrays;
import java.util.Scanner;

public class moveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many integers you want to enter?");
        int n=sc.nextInt();
        System.out.println("enter integers");
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }
       zerosToEnd(array);
       System.out.println(Arrays.toString(array));

    }
    public static int[] zerosToEnd(int[] arr){
        int len=arr.length;
        int count=0;
        for(int i=0;i<len;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<len){
            arr[count++]=0;
        }
        return arr;
    }}
