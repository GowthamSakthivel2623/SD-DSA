package addon_day9;

public class Upperbound {
	public class UpperBoundFinder {
	    public static int upperBound(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length; 

	        while (left < right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] <= target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }

	        return left; 
	    }

	    public static void main(String[] args) {
	        int[] sortedArray = {1, 2, 4, 4, 5, 6};
	        int target = 4;

	        int ubIndex = upperBound(sortedArray, target);

	        System.out.println("Upper bound of " + target + " is at index: " + ubIndex);
	    }
	}


}
