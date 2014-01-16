package pl.inpar.javapowertools.testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;

public class GroupsMethod {
	
	@BeforeGroups(groups="B")
	public void beforeGroupB() {
		System.out.println("  @BeforeGroup B");
	}
	
	@AfterGroups(groups="B")
	public void afterGroupB() {
		System.out.println("  @AfterGroup B");
	}

	
	
}
