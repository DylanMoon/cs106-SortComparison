package sortcomparison;

import java.util.*;

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
		// TODO Auto-generated method stub

	}


	@Override
	public void merge(String[] data, int fi, int nl, int nr) {
		// TODO Auto-generated method stub

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
