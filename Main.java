package sortcomparison;

import static sbcc.Core.*;
import static java.lang.System.*;
import static org.apache.commons.lang3.StringUtils.*;

/**
 * 
 * Dylan Moon CS106-62502
 *
 */
public class Main {

	public static void main(String[] args) {
		BasicSorter bs = new BasicSorter();
		String[] sort = { "d", "c", "b", "k", "f", "e", "a" };
		for (var word : sort) {
			print(word + " ");
		}
		println();
		bs.insertionSort(sort, 1, 5);
		for (var word : sort) {
			print(word + " ");

		}
		println();
	}
}
