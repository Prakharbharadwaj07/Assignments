package assignment10;

	public class FindSecondAndThirdLargest {
	    public static void main(String[] args) {
	        int[] values = {12, 34, 11, 36, 87, 98, 93};

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;
	        int thirdLargest = Integer.MIN_VALUE;

	        for (int num : values) {
	            if (num > largest) {
	                // Update all three when new largest found
	                thirdLargest = secondLargest;
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num < largest) {
	                // Update second and third largest
	                thirdLargest = secondLargest;
	                secondLargest = num;
	            } else if (num > thirdLargest && num < secondLargest) {
	                // Update third largest
	                thirdLargest = num;
	            }
	        }

	        System.out.println("Second Largest Number: " + secondLargest);
	        System.out.println("Third Largest Number: " + thirdLargest);
	    }
	}



