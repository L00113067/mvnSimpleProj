package mvnSimpleProj;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 * @author rlepp
 *
 */
public class NoDoorsTest {
	@Test
	public void noDoorsTest() {
		Vehicle nuVehicle = new Vehicle();
		nuVehicle.setNoDoors(5);
		assertEquals(5, nuVehicle.getNoDoors());	
	}	
}