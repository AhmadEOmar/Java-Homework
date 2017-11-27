import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {

	// FIRST
	// Write a class Counter such that the following test works
	@Test
	public void testZero() {
		Counter cnt = new Counter(0);
		assertEquals("initial value of (0) failed", 0, cnt.getCount());

		cnt.increase();
		assertEquals("increased value of (0) failed", 0, cnt.getCount());

		cnt.decrease();
		assertEquals("decreased value of (0) failed", 0, cnt.getCount());
	}

	// SECOND
	// Uncomment the following method,
	// modify your Counter class so that this test works.
	/*
	@Test
	public void testIncrease() {
		Counter cnt = new Counter(7);
		assertEquals("initial value of (7) failed", 0, cnt.getCount());

		cnt.increase();
		assertEquals("increased once value of (7) failed", 7, cnt.getCount());

		cnt.increase();
		assertEquals("twice increased once value of (7) failed", 14,
				cnt.getCount());
	}
	*/


	// THIRD
	// Uncomment the following method,
	// modify your Counter class so that this test works.
	/*
	@Test
	public void testDecrease() {
		Counter cnt = new Counter(11);
		cnt.decrease();
		assertEquals("decreased value of (11) failed", -11, cnt.getCount());

		cnt.decrease();
		assertEquals("twice decreased value of (11) failed", -22,
				cnt.getCount());
	}
	*/


	// FOURTH
	// Uncomment the following method,
	// modify your Counter class so that this test works.
	/*
	@Test
	public void testNegative() {
		Counter cnt = new Counter(-1);
		cnt.decrease();
		assertEquals("decreased value of (-1) failed", 1, cnt.getCount());

		cnt.increase();
		assertEquals("decreased/increased value of (-1) failed", 0,
				cnt.getCount());

		cnt.increase();
		assertEquals("decreased/increased/increased value of (-1) failed", -1,
				cnt.getCount());
	}
	*/
}
