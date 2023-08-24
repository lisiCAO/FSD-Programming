/*
 * Purpose:  takes a map of any type and prints each key-value pair.
 * Script Date: August 24, 2023
 * Developed by: Lisi Cao
 */

package generic;

import java.util.Map;

/**
 * A utility class to print the contents of a map.
 */
public class MapPrinter {
	private MapPrinter() {
	};

	/**
	 * Takes a map of any type and prints each key-value pair.
	 *
	 * @param <K> the type of keys in the map
	 * @param <V> the type of values in the map
	 * @param map the input map to print
	 */
	public static <K, V> void printMap(Map<K, V> map) {
		System.out.println("Map:");
		if (map == null) {
			System.out.println("Map is null.");
			return; // Ensure we exit early if map is null.
		}

		if (map.isEmpty()) {
			System.out.println("Map is empty.");
			return; // Ensure we exit early if map is empty.
		}

		for (Map.Entry<K, V> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public static void main(String[] args) {

		Map<String, Integer> sampleMap = Map.of("One", 1, "Two", 2, "Three", 3);

		printMap(sampleMap);
		System.out.println();

		Map<Integer, String> reversedMap = Map.of(1, "One", 2, "Two", 3, "Three");
		printMap(reversedMap);

	}

}
