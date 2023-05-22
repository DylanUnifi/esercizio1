package esercizio1;

import org.junit.runner.Result;
import org.junit.runner.JUnitCore;  
import org.junit.runner.notification.Failure;

import test.AdapterCompositeTest;


public class TestRunner {
	public static void main(String[] args) throws Exception {  
	      Result result = JUnitCore.runClasses(AdapterCompositeTest.class);  
	          
	      for (Failure fail : result.getFailures()) {  
	         System.out.println(fail.toString());  
	      }  
	          
	      System.out.println(result.wasSuccessful());
	 }  
}