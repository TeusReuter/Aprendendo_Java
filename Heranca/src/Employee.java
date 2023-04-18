import java.math.BigDecimal;

public class Employee extends Person{

    private String title;
    private String employerName;
    private String employeeGrade;
    private BigDecimal salary;

    public Employee(String name, String title) {
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employerName;
    }

    public void setEmployer(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(String employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String toString() {
//        return String.format("Name: %s, Email: %s, Salary: %s", getName(), getEmail(), getSalary());
//        return title + "#" + employerName + "#" + employeeGrade + "#" + getName();
        return super.toString() + title + ", " + getEmail() + getPhoneNumber();
    }
}
