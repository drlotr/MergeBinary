

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortTestCases {

	@Test
	public void testMergeSort() {
		int[] pre = {5, 2, 3, 4, 0, 1};
		int[] post = {0, 1, 2, 3, 4, 5};
		MergeSorter.mergeSort(pre, 0, 5);
		assertTrue(Arrays.equals(pre, post));
	}
	public void testBinarySearch() {
		int[] test1 = {13, 2, 7, 12, 15, 4, 11, 6, 10, 9, 3, 1, 14, 5, 8};
		MergeSorter.mergeSort(test1,  0,  14);
		assertEquals(0, BinarySearcher.binarySearch(test1, 0, 14, 1));
		assertEquals(14, BinarySearcher.binarySearch(test1,  0,  14,  15));
		assertEquals(5, BinarySearcher.binarySearch(test1,  0, 14, 6));
		}
	public void test2BinarySearch() {
		int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100};
		assertEquals(0, BinarySearcher.binarySearch(test1, 0, 10, 1));
		assertEquals(10, BinarySearcher.binarySearch(test1, 0, 10, 100));
	}
	public void test3BinarySEarch() {
		int[] test1 = {100, 200, 300, 400, 500, 600, 700};
		assertEquals(0, BinarySearcher.binarySearch(test1, 0, 6, 100));
		assertEquals(4, BinarySearcher.binarySearch(test1, 0, 6, 500));
	}
}
