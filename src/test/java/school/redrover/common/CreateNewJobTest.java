package school.redrover.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateNewJobTest extends BaseTest {
    @Test
    public void testCreateNewJob() {
        getDriver().findElement(By.xpath("//a[@href = 'newJob']")).click();

        WebElement itemNameField = getDriver().findElement(By.id("#name"));
        itemNameField.click();
        itemNameField.sendKeys("test_job_1");

        getDriver().findElement(
                By.xpath("//li[@class = 'jenkins_branch_OrganizationFolder']")).click();

        getDriver().findElement(By.id("#ok-button")).click();

        getDriver().findElement(By.id("#jenkins-head-icon"));


        //Assert
        //need to check that - same folder name displayed (test_job_1)
        //                   - same element type displayed (OrganizationFolder)

    }
}
