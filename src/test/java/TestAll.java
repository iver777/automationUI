import org.testng.Assert;
import org.testng.annotations.Test;
import task.AddEmployee;
import task.IsEmployeePageDisplayed;
import task.Login;

public class TestAll extends Base {

    @org.testng.annotations.Test
    public void testing() {
        Login.as(webDriver, "admin", "admin123");
        Assert.assertTrue(IsEmployeePageDisplayed.form(webDriver));
        AddEmployee.as(webDriver, "Iver", "iver@gmail.com", "Vallegrande","78756439");
        //Assert.assertEquals("Success! Employee successfully added.","Success! Employee successfully added.");

    }


}

