package management;

public class Director extends Manager {

        private Double budget;

        public Director(String name, String NI_number, Double salary, String deptName, Double budget){
            super(name, NI_number, salary, deptName);
            this.budget = budget;
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

        public Double getBudget(){
            return this.budget;
        }

        @Override
        public Double payBonus(){
            return (getEmployeeSalary() / 100) * 2;
        }
}
