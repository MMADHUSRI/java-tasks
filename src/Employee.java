public class Employee {
    private String employeename;
    private String employee_id;
    private double employeesalary;
    public Employee(String employeename, String employee_id,double employeesalary){
        this.employeename = employeename;
        this.employee_id = employee_id;
        this.employeesalary = employeesalary;
    }

    public Employee() {

    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeesalary() {
        return "This Salary is "+employeesalary;
    }

    public void setEmployeesalary(double employeesalary) {
        this.employeesalary = employeesalary;
    }


    public static void main(String[] args) {
        Employee employee= new Employee();
        employee.setEmployee_id("2134");
        employee.setEmployeename("Madhu");
        employee.setEmployeesalary(100000);
         employee.getEmployee_id();
         employee.getEmployeename();
         employee.getEmployeesalary();

        System.out.println("Employee Details : ");
        System.out.println("Employe ID : " + employee.getEmployee_id());
        System.out.println("Employee Name : " + employee.getEmployeename());
        System.out.println("Employee Salary : " +employee.getEmployeesalary());
    }
}
