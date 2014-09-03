package TestQueue;


import queue.Cola;
import junit.framework.TestCase;

public class TestQueue extends TestCase{
	
	public void test(){
		Cola cola = new Cola();
		assertEquals(0, cola.size());
		assertEquals(true, cola.isEmpty());

		cola.add(1);
		assertEquals(false,cola.isEmpty());
		assertEquals(1, cola.size());
		assertEquals(1,cola.top());
		cola.add(2);
		assertEquals(1,cola.top());
		cola.add(3);
		cola.add(4);
		assertEquals(4, cola.size());
		cola.remove();
		assertEquals(2,cola.top());
		assertEquals(3, cola.size());
		cola.remove();
		cola.remove();
		cola.remove();
		try{
			cola.remove();
		}
		catch(AssertionError e){
			return;
		}
		fail();		
	}

}
