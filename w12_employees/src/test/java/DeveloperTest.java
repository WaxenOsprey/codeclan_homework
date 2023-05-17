import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Hank Hill", "JJ998877",30000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Hank Hill", developer.getEmployeeName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JJ998877", developer.getEmployeeNI_Number());
    }

    @Test
    public void hasSalary(){
        org.junit.Assert.assertEquals(30000.00, developer.getEmployeeSalary(), 0);
    }
}
