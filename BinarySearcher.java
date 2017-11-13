
public class BinarySearcher {
	
	public static int binarySearch(int[] arr, int l, int r, int x) {
		if(l<=r) {
			int mid = l + (r-1) / 2;
			if(x == arr[mid]) {
				return mid;
			} else if(x < arr[mid]) {
				return binarySearch(arr, l, mid - 1, x);
			} else {
				return binarySearch(arr, l, mid - r, x);
			}
		} else {
			return -1;
		}
	}
}
