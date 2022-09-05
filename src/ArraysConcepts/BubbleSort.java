package ArraysConcepts;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {8,2,10,-1,3,6,1};
		int n = a.length;
		for(int i =0; i<n-1; i++) {
			boolean sorted = true;
			for(int j =0; j<n-1-i; j++) { // for optimation we can use (n-1-i)
				
				if(a[j+1] < a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					sorted = false; // If we swap any of values it means array is not sorted
				}
			}
			if (sorted) 
				break;
		}
		for(int item: a) {
			System.out.print(item + " " );
		}
		

	}

}
