import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {

    @DataProvider(name = "Email for Happy path")
    public static Object[][] dataMethod() {
        return new Object[][]{
                {"Ad1@gmail.com"},
                {"weq51@gmail.com"},
                {"fluffy_2003@gmail.com"},
                {"behappy!@gmail.com"},
                {"behappy!@12l.com"},
                {"beh@gm.com"},
                {"fromhere@GM.com"},
                {"behappy!beyourself20@gmail.com"}
        };
    }

    @Test(dataProvider = "Email for Happy path")
    public void checkEmailHappyPath(String email) {
        Email e = new Email();
        boolean result = Email.isEmailCorrect(email);
        Assert.assertTrue(result);

    }
}