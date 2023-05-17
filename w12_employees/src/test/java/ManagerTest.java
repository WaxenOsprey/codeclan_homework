import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Buck Strickland", "112233OK", 50000.00, "Operations");
    }

    @Test
    public void hasName(){
        assertEquals("Buck Strickland", manager.getEmployeeName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("112233OK", manager.getEmployeeNI_Number());
    }

    @Test
    public void hasSalary(){
        org.junit.Assert.assertEquals(50000.00, manager.getEmployeeSalary(), 0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Operations", manager.getDeptName());
    }

}
