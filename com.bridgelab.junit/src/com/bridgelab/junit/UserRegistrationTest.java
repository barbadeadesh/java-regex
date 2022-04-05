package com.bridgelab.junit;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
public class UserRegistrationTest {

	@Test
	public void givenfirstnameshouldbeTrue() {
		UserRegistrationCase userRegistration = new UserRegistrationCase();
		boolean result = userRegistration.validateFirstName("Adesh");
		Assert.assertEquals(true, result);
	}
}
