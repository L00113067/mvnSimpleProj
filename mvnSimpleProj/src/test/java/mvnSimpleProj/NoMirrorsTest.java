package mvnSimpleProj;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 * @author rlepp
 *
 */
public class NoMirrorsTest {
	@Test
	public void noMirrorsTest() {
		Vehicle nuVehicle = new Vehicle();
		nuVehicle.setNoMirrors(3);
		assertEquals(3, nuVehicle.getNoMirrors());
	}
}


	