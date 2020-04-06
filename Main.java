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
		String[] sort = { "d", "c", "b", "k", "f", "H", "e", "a", "P", "q", "r", "s", "v", "u", "t", "o", "n", "C", "m",
				"z", "y", "h", "g", "x", "l", "j", "w", "p", "Z", "W", "T", "U", "Y", "V", "K", "X", "A", "S", "B", "E",
				"G", "I", "Q", "J", "R", "M", "L", "N", "F", "O", "D", "i" };
		for (var word : sort) {
			print(word + " ");
		}

		// bs.quickSort(sort, 0, sort.length);
		bs.makeHeap(sort);
		println();
		for (var word : sort) {
			print(word + " ");
		}
		println("\n");
		println("Testing sorted data");
		println();
		String[] sorted = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
				"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
		for (var letter : sorted) {
			print(letter + " ");
		}
		bs.quickSort(sorted, 0, sort.length);
		println();
		for (var letter : sorted) {
			print(letter + " ");
		}
	}
}
