package techStaff;

import staff.Employee;

public class Developer extends Employee {

    public Developer (String name, String NI_number, Double salary) {
        super(name, NI_number, salary);
    }
    public String getEmployeeName() {
        return super.getName();
    }

    public String getEmployeeNI_Number() {
        return super.getNI_number();
    }

    public Double getEmployeeSalary() {
        return super.getSalary();
    }

}
