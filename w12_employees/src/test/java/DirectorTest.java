import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Bobby Hill", "112233OO", 100000.00, "Operations", 90000000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Bobby Hill", director.getEmployeeName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("112233OO", director.getEmployeeNI_Number());
    }

    @Test
    public void hasSalary(){
        org.junit.Assert.assertEquals(100000.00, director.getEmployeeSalary(), 0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Operations", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(90000000.00, director.getBudget(), 0);
    }

    @Test
    public void getsBonus(){
        assertEquals(2000, director.payBonus(), 0);
    }

}
