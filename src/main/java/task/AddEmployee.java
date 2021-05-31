package task;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.AddEmployeeUI;


public class AddEmployee {

    public static void as(WebDriver driver, String name, String email, String address, String phone ){
        Enter.text(driver, AddEmployeeUI.name, name);
        Enter.text(driver, AddEmployeeUI.email, email);
        Enter.text(driver, AddEmployeeUI.address, address);
        Enter.text(driver, AddEmployeeUI.phone, phone);
        Click.on(driver,AddEmployeeUI.addButton);
    }
}
