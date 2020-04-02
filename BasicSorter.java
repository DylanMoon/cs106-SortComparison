package sortcomparison;

import java.util.*;

public class BasicSorter implements Sorter {

	@Override
	public void insertionSort(String[] data, int fi, int n) {
		int range = fi + n;
		if (range >= data.length) {
			return;
		}
		for (int i = fi + 1; i < range; i++) {
			var temp = data[i];
			int properNdx = i - 1;
			while ((properNdx >= fi) && (data[properNdx].compareTo(temp) > 0)) {
				swap(data, properNdx + 1, properNdx);
				properNdx--;
			}
			data[properNdx + 1] = temp;
		}

	}


	@Override
	public void quickSort(String[] data, int fi, int n) {
		// TODO Auto-generated method stub

	}


	@Override
	public int partition(String[] data, int fi, int n) {
		// TODO Auto-generated method stub
		return 0;
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
