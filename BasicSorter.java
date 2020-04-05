package sortcomparison;

import static java.lang.System.*;
import java.util.*;

/**
 * 
 * Dylan Moon CS106-62502
 *
 */

public class BasicSorter implements Sorter {

	@Override
	public void insertionSort(String[] data, int fi, int n) {
		var range = fi + n;
		if (range > data.length) {
			return;
		}
		for (int i = fi + 1; i <= range; i++) {
			var properNdx = i - 1;
			while ((properNdx > fi) && (data[properNdx].compareTo(data[properNdx - 1])) < 0) {
				swap(data, properNdx - 1, properNdx);
				properNdx--;
			}
		}
	}


	@Override
	public void quickSort(String[] data, int fi, int n) {
		var range = fi + n;
		if (range > data.length) {
			return;
		}
		if (n > 15) {
			var pivot = partition(data, fi, n);

		} else {
			insertionSort(data, fi, n);
		}

	}


	@Override
	public int partition(String[] data, int fi, int n) {
		var last = fi + n - 1;
		var middle = ((n - fi) / 2) + fi;
		String[] temp = { data[fi], data[middle], data[last] };
		insertionSort(temp, 0, 3);
		var pivot = temp[1];
		if (data[fi].compareTo(pivot) == 0) {
			return fi;
		} else if (data[last].compareTo(pivot) == 0) {
			return last;
		} else {
			return middle;
		}
	}


	@Override
	public void mergeSort(String[] data, int fi, int n) {
		var range = fi + n;
		if (range > data.length) {
			return;
		}
		if (n > 15) {// mergeSort if set to be sorted is 16 or larger
			var half = n / 2;
			var secondHalf = (n % 2 == 0) ? half : half + 1;
			mergeSort(data, fi, half); // left half, gets the smaller chunk if n is odd
			mergeSort(data, fi + half, secondHalf); // right half, gets the bigger chunk if n is odd
			merge(data, fi, half, secondHalf);

		} else {// insertionSort if set to be sorted is 15 or fewer
			insertionSort(data, fi, n);
		}
	}


	@Override
	public void merge(String[] data, int fi, int nl, int nr) {
		if (data[fi + nl - 1].compareTo(data[fi + nl]) < 0) {
			return;// if the largest item in the first half is
			// less than the smallest of the second half
			// the two chunks are already sorted. Return
		}
		var p1 = fi;
		var p2 = fi + nl;
		var chunk1 = p1 + nl - 1;
		var chunk2 = p2 + nr - 1;
		var p3 = 0;
		String[] temp = new String[nl + nr];
		while ((p1 <= chunk1) && (p2 <= chunk2)) {
			// add lower value to temp array until chunk1 or chunk2 is emtpy
			if (data[p1].compareTo(data[p2]) < 0) {
				temp[p3] = data[p1];
				p1++;
				p3++;
			} else {
				temp[p3] = data[p2];
				p2++;
				p3++;
			}
		}
		while (p1 <= chunk1) {
			// if chunk1 is not empty add the rest of the values to temp array
			arraycopy(data, p1, temp, p3, 1);
			p1++;
			p3++;
		}
		while (p2 <= chunk2) {
			// if chunk2 is not empty add the rest of the values to temp array
			arraycopy(data, p2, temp, p3, 1);
			p2++;
			p3++;
		}
		arraycopy(temp, 0, data, fi, nl + nr);
	}


	@Override
	public void heapSort(String[] data) {
		// TODO Auto-generated method stub

	}


	@Override
	public void heapify(String[] data) {
		// TODO Auto-generated method stub

	}


	private void swap(String[] data, int i, int j) {
		var temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

}
