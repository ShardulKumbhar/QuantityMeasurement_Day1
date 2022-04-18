import org.junit.Assert;
import org.junit.Test;

import com.measurment.Measurement;

import measurement.Mesurement;

public class MeasurmentTest {

	@Test
	public void test() {
		/*
		 * created a object
		 */
		Measurement obj = new Measurement();
	       int feet = 1;
	       int inch = obj.comparision(feet);
	        Assert.assertEquals(12, inch);
	    }
}
