public class Arrays{
    public static void kadanesAlgorithm(int[] a){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i =0; i<a.length;i++){
            curSum+=a[i];
            if(curSum<=0){
                curSum=0;
            }
        maxSum=Math.max(maxSum,curSum);
        }
        System.out.println(maxSum);
    }
    public static void dutchNationalFlag(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int i = 0;

        while (i <= high) {
            if (nums[i] == 0) {
                swap(nums, i, low);
                i++;
                low++;
            } else if (nums[i] == 2) {
                swap(nums, i, high);
                high--;
            } else {
                i++;
            }
        }
        System.out.print("Sorted array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void findMaxMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int n = arr.length;
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move towards the center
            start++;
            end--;
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void rotateRight(int a[], int k) {
        int n = a.length;
        reverseA(a, 0, n - k - 1);
        reverseA(a, n - k, n - 1);
        reverseA(a, 0, n - 1);
        System.out.print("Right Rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void rotateLeft(int a[], int k) {
        int n = a.length;
        reverseA(a, 0, k - 1);
        reverseA(a, k, n - 1);
        reverseA(a, 0, n - 1);
        System.out.print("Left Rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    private static void reverseA(int[] arr, int start, int end) {
        while (start < end) {
            
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            
            start++;
            end--;
        }
    }
    public static void findMaxSubarray(int[] arr) {
        int n = arr.length;
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > maxEndingHere + arr[i]) {
                maxEndingHere = arr[i];
                tempStart = i;
            } else {
                maxEndingHere = maxEndingHere + arr[i];
            }

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSoFar);
        System.out.println("Start Index: " + start);
        System.out.println("End Index: " + end);
    }
    public static void xor(int[] ab) {
        int n = ab.length ;
        int xor = 2*ab.length+2;
        int k=0;
        for(int i=2;i<=2*ab.length;i=i+2){
               xor = xor ^ i ^ ab[k++];
            }
           System.out.println(xor); 
    }
    public static void main(String ...asd){
        int[] a={3,4,5,6,7};
        int[] nums = {2,1,0,2,1,0,1};
        kadanesAlgorithm(a);
        dutchNationalFlag(nums);
        int[] array = {1,2,3,4,5};
        findMaxMin(array);
        reverse(array);
        int k = 2;
        rotateRight(array, k);
        rotateLeft(array,k);
        findMaxSubarray(array);
        int [] ab={9,8,7,6,5};
        xor(ab);
    }
}