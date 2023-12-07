import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.CheckboxElements;
import task.validations.IsCheckboxElements;

public class CheckBoxesTest extends BaseTest {

    @Test
    public void CheckBoxesTest(){
        CheckboxElements.as(webDriver);
        Assert.assertTrue(IsCheckboxElements.visible(webDriver));
    }
}
