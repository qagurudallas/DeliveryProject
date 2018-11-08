import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class DeliveryTest {

	Delivery delObj = new Delivery("Priyanka");

	// delObj.Distance returns 10 if distance is less than 10km
	

	@Test
	public void deliveryPriceForLessthan10km() {

		int result = delObj.Distance(9);
		Assert.assertEquals(10, result);
	}

	@Test
	public void deliveryPriceForMorethan10km() {
		int result = delObj.Distance(12);
		Assert.assertEquals(25, result);
	}

	@Test
	public void deliveryPriceForlessthanZero() {
		int result = delObj.Distance(-50);
		Assert.assertEquals(-1, result);

	}

	@Test
	public void deliveryPriceLessthan10KMAndStairs() {
		int result = delObj.DistanceAndStairs(9);
		Assert.assertEquals(20, result);

	}
	@Test
	public void deliveryPriceMorethan10KMAndStairs() {
		int result = delObj.DistanceAndStairs(14);
		Assert.assertEquals(35, result);

	}
	@Test
	public void deliveryPriceMorethan30KM() {
		int result = delObj.Distance30(35);
		Assert.assertEquals(100, result);

	}

	@Test
	public void deliveryPriceForWeekend() {
		int result = delObj.weekend();
		Assert.assertEquals(50, result);

	}

	@Test
	public void errorMessageWhenNothingIsSelected() {
		String result = delObj.errorMessage();
		Assert.assertEquals("Please select at least one distance", result);

	}
}
