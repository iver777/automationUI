import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.AddEmployee;
import task.IsEmployeePageDisplayed;
import task.Login;

public class TestAll extends Base {

    @Test
    public void testing() {

        String mensaje;
        Login.as(webDriver, "admin", "admin123");
        Assert.assertTrue(IsEmployeePageDisplayed.form(webDriver));
        AddEmployee.as(webDriver, "Iver", "iver@gmail.com", "Vallegrande","78756439");
        Alert alert=webDriver.switchTo().alert();
        mensaje=alert.getText();
        Assert.assertEquals(mensaje,"Success! Employee successfully added.");

    }


}

