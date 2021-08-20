package programminglaungage;

import static org.junit.Assert.*;

import org.junit.Test;

public class equals {
	JUnitMethods ju = new JUnitMethods();

	@Test
	 
		
		public void nullstring()
		{
		String str=null;
		assertNotNull(str);
		
			
		}
		
	@Test
	public void compareArrrays() {
		int a[]= {1,2,3};
		int b[]= {1,2};
		
		assertEquals(a,b);
	}

}
