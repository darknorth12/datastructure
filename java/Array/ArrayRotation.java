public class ArrayRotation{

    public int[] leftRotateByOne(int[] arr){
    	int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i < n-1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        return arr;
    }

    public int[] simpleLeftRotate(int[] arr, int d){
        for(int i = 0; i < d; i++){
            leftRotateByOne(arr);
        }
        return arr;
    }
    
    public int getGCD(int a, int b) {
    	if (a % b == 0) return b;
    	else return getGCD(b,a%b);
    }
    
    public int[] improvisedLeftRotate(int[] arr, int d) {
    	int gcd = getGCD(arr.length,d);
    	for(int i = 0; i < (arr.length)/gcd;i++) {
    		int temp = arr[i];
    		int j = i;
    		for(; (j + gcd) < (arr.length); j = j + gcd) {
    			arr[j] = arr[j + gcd];
    		}
    		arr[j] = temp;
    	}
    	return arr;
    }


}