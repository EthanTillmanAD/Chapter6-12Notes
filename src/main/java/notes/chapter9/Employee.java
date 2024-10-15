package notes.chapter9;

public class Employee extends Person{
private String employeeID;
private String title;

    public Employee() {
        super();
        System.out.println("employee created");
    }

    public Employee(String name) {
        super(name);
        System.out.println("This person got a job he is now an employee -> "+ getName());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
}
