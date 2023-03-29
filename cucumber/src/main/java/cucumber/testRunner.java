package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="D:\\priti IMP\\eclipse\\cucumber\\src\\main\\java\\loginPage.feature",
        glue = {"stepDefination"},
        dryRun = false,
        monochrome = true,
 plugin = {"pretty","html:cucumber/HtmlReports"})
        

public class testRunner {

}
