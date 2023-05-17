package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String NI_number, Double salary, String deptName) {
        super(name, NI_number, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
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

    public Double payBonus(){
        return (getEmployeeSalary() / 100) * 2;
    }
}
