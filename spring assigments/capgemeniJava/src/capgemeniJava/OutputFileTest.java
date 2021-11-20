package capgemeniJava;

public class OutputFileTest {
			
    	private File output; 
    	@Before public voidcreateOutputFile() 
 	 { 
       output = new File(...);
    	}
  
	@After public void deleteOutputFile() 
   		{
        output.delete(); 
   	} 
     
    @Test public void testFile1() 
    		{
       
   		} 
	@Test public void testFile2() 
   	 {
       
    		}
}


