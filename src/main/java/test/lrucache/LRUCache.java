package test.lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * Least Recently Used cache using Linked Hash Map.
 * 
 * @author vinit-prajapati
 *
 * @param <K>
 * @param <V>
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {

	private static final long serialVersionUID = 1L;

	private final int capacity;

	public LRUCache(final int capacity) {
		// set access order to true - keys will be sorted based on access order
		super(capacity, 1.0f, true);
		this.capacity = capacity;
	}

	/**
	 * return true when map size is greater than capacity
	 */
	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> enttry) {
		return size() > this.capacity;
	}

	/**
	 * synchronized find method
	 * 
	 * @param key
	 * @return value
	 */
	public synchronized V find(final K key) {
		return super.get(key);
	}

	/**
	 * synchronized add method
	 * 
	 * @param key
	 * @param value
	 */
	public synchronized void add(final K key, final V value) {
		super.put(key, value);
	}
}
