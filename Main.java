package sortcomparison;

import static sbcc.Core.*;
import static java.lang.System.*;
import static org.apache.commons.lang3.StringUtils.*;
import java.util.*;

/**
 * 
 * Dylan Moon CS106-62502
 *
 */
public class Main {

	public static void main(String[] args) {
		BasicSorter bs = new BasicSorter();
		String[] sort = { "B", "d", "A", "c", "b", "k", "f", "H", "e", "a", "P", "q", "r", "s", "v", "u", "t", "o", "n",
				"C", "m", "z", "y", "h", "g", "x", "l", "j", "w", "p", "Z", "W", "T", "U", "Y", "V", "K", "X", "S", "E",
				"G", "I", "Q", "J", "R", "M", "L", "N", "F", "O", "D", "i" };

		println("Testing unsorted data");
		printArray(sort);

		// bs.quickSort(sort, 0, sort.length);
		bs.heapSort(sort);

		println();
		printArray(sort);

		Arrays.sort(sort);
		println();
		printArray(sort);
		println("\n");

		println("Testing sorted data");
		String[] sorted = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
				"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

		printArray(sorted);

		// bs.quickSort(sorted, 0, sort.length);
		bs.heapSort(sorted);

		println();
		printArray(sorted);
	}


	private static void printArray(String[] arr) {
		for (String item : arr) {
			print(item + " ");
		}
	}
}
