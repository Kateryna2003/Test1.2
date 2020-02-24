import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {

    @DataProvider(name = "Email for Unhappy path")
    public static Object[][] dataMethod() {
        return new Object[][]{
                {"ad@gmail.com"},
                {"па@gmail.com"},
                {"парам@gmail.com"},
                {"12@gmail.com"},
                {"mail@gmail.COM"},
                {"mail@g.COM"},
                {"mailb@g.Compys"},
                {"mailgooglefinfuncoore@gmail.COM"}
        };
    }

    @Test(dataProvider = "Email for Unhappy path")
    public static void checkEmailUnhappyPath(String email) {
        Email e = new Email();
        boolean result = Email.isEmailCorrect(email);
        Assert.assertFalse(result, " This email is un correct");

    }
}