package test.lrucache;

import java.util.Map;

/**
 * LRU cache executor
 * 
 * @author vinit-prajapati
 *
 */
public class Executor {
	public static void main(String[] args) {
		LRUCache<String, String> cache = new LRUCache<String, String>(5);

		// adding 5 element;
		cache.add("1", "One");
		cache.add("2", "Two");
		cache.add("3", "Three");
		cache.add("4", "Four");
		cache.add("5", "Five");

		// access 1 entry, so that "2" will be oldest entry map
		System.out.println("'1' Entry: " + cache.find("1"));

		// add entry, and '2' key should be removed
		cache.add("6", "Six");

		System.out.println("\nPrinting all elements:");

		for (Map.Entry<String, String> entry : cache.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
