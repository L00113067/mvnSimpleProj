package mvnSimpleProj;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ NoDoorsTest.class, NoMirrorsTest.class, NoWheelsTest.class })
public class AllTests {

}
