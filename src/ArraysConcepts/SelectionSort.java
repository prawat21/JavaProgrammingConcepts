package ArraysConcepts;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {8,2,10,-1,3,6,1};
		int n = a.length;
		for(int i =0; i<n-1; i++) {
			
			int minIndex = i;
			for(int j =i; j<n; j++) {
				if (a[j]< a[minIndex]) {
					minIndex = j;
				}
				
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		for(int item: a) {
			System.out.print(item + " ");
		}

	}

}
