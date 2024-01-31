

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) {
    	int placeholder = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length-1-i] = placeholder;
    }

  }
  
  
  // 1 2 3 4 5 
  // placeholder = 1, arr[0] = 5, arr[4] = 1; new array = 5,2,3,4,1
  // placeholder = 2, arr[1] 4, arr[3] = 2; new array = 

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
	  if(arr.length==0) {
		  return new int[]{}; 
	  }
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i++) {
     newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; }
    }
    return sum / (arr.length - 1);
  }


}

