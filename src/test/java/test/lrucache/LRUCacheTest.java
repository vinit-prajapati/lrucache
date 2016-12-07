package test.lrucache;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * LRU Cache Test
 * 
 * @author vinit-prajapati
 *
 */
public class LRUCacheTest {
	private LRUCache<String, String> cache;

	@Before
	public void setUpCache() {
		cache = new LRUCache<String, String>(3);
		
		// add three element
		cache.add("1", "One");
		cache.add("2", "Two");
		cache.add("3", "Three");
	}
	
	@Test
	public void test_get_element(){
		assertEquals("Three", cache.find("3"));
	}
	
	@Test
	public void test_add_element(){
		// add 4 element, so that 1st should be removed
		cache.add("4", "Four");
		assertNull(cache.get("1"));
	}
}

