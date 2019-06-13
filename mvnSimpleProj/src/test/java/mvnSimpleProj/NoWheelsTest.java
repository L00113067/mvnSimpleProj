/**
 * 
 */
package mvnSimpleProj;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @author rlepp
 *
 */
public class NoWheelsTest {
	@Test
	public void noWheelsCarTest() {
	Vehicle nuVehicle = new Vehicle();
	nuVehicle.setNoWheels(5);
	assertEquals(5, nuVehicle.getNoWheels());
	}
	}
