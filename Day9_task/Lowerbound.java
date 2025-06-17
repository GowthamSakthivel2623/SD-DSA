package addon_day9;

public class Lowerbound {
	public class LowerBoundFinder {

	    public static int lowerBound(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length;  

	        while (left < right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }

	        return left;  	    }

	    public static void main(String[] args) {
	        int[] sortedArray = {1 ,34 , 22 , 45 , 67 ,70};
	        int target = 4;

	        int lbIndex = lowerBound(sortedArray, target);

	        System.out.println("Lower bound of " + target + " is at index: " + lbIndex);
	    }
	}


}
