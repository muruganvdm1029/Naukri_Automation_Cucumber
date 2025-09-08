package hooks;

import org.junit.Before;

import io.cucumber.messages.types.Scenario;

public class HooksMethod {
	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println("Scenario Name:"+ name);
		
	}
	
	public void  classafterhooks() {

}
}