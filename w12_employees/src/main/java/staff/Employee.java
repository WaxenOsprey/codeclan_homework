package staff;

public abstract class Employee {

    private String name;
    private String NI_number;
    private Double salary;

    public Employee(String name, String NI_number, Double salary){
        this.name = name;
        this.NI_number = NI_number;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNI_number(){
        return this.NI_number;
    }

    public Double getSalary(){
        return this.salary;
    }

    public void setName(String new_name){
        if (new_name != null){
            this.name = new_name;
        }
    }

    public void setNI_number(String new_NI_number){
        this.NI_number = new_NI_number;
    }

    public void setSalary(Double new_Salary){
        this.salary = new_Salary;
    }

    public void payBonus(Double salary_increment){
        if (salary_increment > 0){
            setSalary(this.salary += salary_increment);
        }
    }
}
