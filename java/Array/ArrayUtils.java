import java.util.Scanner;

public class ArrayUtils{

    public void printArray(int arr[]){
        for(int i=0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public int[] readArray(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in the array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter all elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }


}