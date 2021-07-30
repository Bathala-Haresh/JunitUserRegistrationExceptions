package userregistration;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UserRegistrartionExceptionsApplicationTests {

	UserRegistration userRegistration = new UserRegistration();
	
	 @Test
	    public void givenFirstName_WhenNull_ShouldReturnException() {
	        try {
	        } catch (UserRegitrationException e) {
	            Assert.assertEquals(UserRegitrationException.ExceptionType.ENTERED_NULL, e.type);
	        }
	    }
	 @Test
	    public void givenLastName_WhenNull_ShouldReturnException() {
	        try {
	        } catch (UserRegitrationException e) {
	            Assert.assertEquals(UserRegitrationException.ExceptionType.ENTERED_NULL, e.type);
	        }
	    }

	    @Test
	    public void givenLastName_WhenEmpty_ShouldReturnException() {
	        try {
	        } catch (UserRegitrationException e) {
	            Assert.assertEquals(UserRegitrationException.ExceptionType.ENTERED_EMPTY, e.type);
	        }
	    }

	    @Test
	    public void givenEmail_WhenNull_ShouldReturnException() {
	        try {
	        } catch (UserRegitrationException e) {
	            Assert.assertEquals(UserRegitrationException.ExceptionType.ENTERED_NULL, e.type);
	        }
	    }

	    @Test
	    public void givenEmail_WhenEmpty_ShouldReturnException() {
	        try {
	        } catch (UserRegitrationException e) {
	            Assert.assertEquals(UserRegitrationException.ExceptionType.ENTERED_EMPTY, e.type);
	        }
	    }

	    @Test
	    public void givenPhoneNumber_WhenNull_ShouldReturnException() {
	        try {
	        } catch (UserRegitrationException e) {
	            Assert.assertEquals(UserRegitrationException.ExceptionType.ENTERED_NULL, e.type);
	        }
	    }

	    @Test
	    public void givenPhoneNumber_WhenEmpty_ShouldReturnException() {
	        try {
	        } catch (UserRegitrationException e) {
	            Assert.assertEquals(UserRegitrationException.ExceptionType.ENTERED_EMPTY, e.type);
	        }
	    }

	    @Test
	    public void givenPassword_WhenNull_ShouldReturnException() {
	        try {
	        } catch (UserRegitrationException e) {
	            Assert.assertEquals(UserRegitrationException.ExceptionType.ENTERED_NULL, e.type);
	        }
	    }

	    @Test
	    public void givenPassword_WhenEmpty_ShouldReturnException() {
	        try {
	        } catch (UserRegitrationException e) {
	            Assert.assertEquals(UserRegitrationException.ExceptionType.ENTERED_EMPTY, e.type);
	        }
	    }


}
