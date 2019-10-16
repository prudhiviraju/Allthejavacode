package retrylogic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;



/**
 * 
 * @author Admin 
 * 
 * <suite name="Retryfailtestsuite">


<listeners>
<listener  class-name="retrylogic.Annotationtransformer"/>

</listeners>


  <test thread-count="5" name="Retrymultipletestcases">
    <classes>
      <class name="retrylogic.Example"/>    overhere if you mention the name Retrylogic.* it'll be applicable to all classes
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->




public class Analyser implements IRetryAnalyzer {

	
	int counter =0;
	int retry=3;
	
	
	public boolean retry(ITestResult result) {
		
		
		if(counter < retry) {
			
			counter++;
			return true;
		}
		
		return false;
	}
	
}


 *
 */

public class Annotationtransformer implements IAnnotationTransformer {

	
	public void transform(ITestAnnotation annotation,Class testclass,Constructor testconstructor,Method testmethod) {
		
		
		annotation.setRetryAnalyzer(Analyser.class);
		
		
		
		
		
		 		 
	}
	
	
	
}
