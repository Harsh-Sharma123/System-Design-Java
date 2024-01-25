public class AbstractWebDeveloper extends EmployeeAbstractFactory {
    public Employee createEmployee(){
        return new WebDeveloper();
    }
}
