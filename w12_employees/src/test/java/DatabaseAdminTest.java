import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Peggy Hill", "KK998877",35000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Peggy Hill", databaseAdmin.getEmployeeName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("KK998877", databaseAdmin.getEmployeeNI_Number());
    }

    @Test
    public void hasSalary(){
        org.junit.Assert.assertEquals(35000.00, databaseAdmin.getEmployeeSalary(), 0);
    }
}
