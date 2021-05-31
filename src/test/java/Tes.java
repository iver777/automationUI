import org.testng.Assert;
import org.testng.annotations.Test;
import task.AddEmployee;
import task.IsEmployeePageDisplayed;
import task.Login;

public class LoginTest extends Base {

    @Test
    public void testLogin() {
        Login.as(webDriver, "admin", "admin123");
        AddEmployee.as(webDriver, "Iver", "iver@gmail.com", "Vallegrande","78756439");
        Assert.assertTrue(IsEmployeePageDisplayed.form(webDriver));

    }


}

