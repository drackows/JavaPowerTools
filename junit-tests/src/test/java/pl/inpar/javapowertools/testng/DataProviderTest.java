package pl.inpar.javapowertools.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider(name="test-cities")
	public Object[][] cityData () {
		return new Object[][] {
				new Object[] {"London"},
				new Object[] {"Paris"}
		};
	}
	
	@Test(dataProvider="test-cities")
	public void sysoutCityName(String name) {
		System.out.println("printing name of city..."+name);
	}
	
}
