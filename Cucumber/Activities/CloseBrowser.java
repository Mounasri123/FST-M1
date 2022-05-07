package stepDefinitions;

import io.cucumber.java.en.And;
import sun.jvm.hotspot.debugger.cdbg.BaseClass;

public class CloseBrowser extends BaseClass{
    @And("^Close the browser"){
        driver.close();

    }

}
