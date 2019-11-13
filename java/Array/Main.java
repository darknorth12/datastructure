import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        ArrayUtils utils = new ArrayUtils();
        ArrayRotation rotate = new ArrayRotation();
        Scanner s = new Scanner(System.in);
        int[] arr = utils.readArray();
        System.out.print("You want to rotate by how many places :");
        int d = s.nextInt();
        arr = rotate.improvisedLeftRotate(arr,d);
        utils.printArray(arr);
    }
}