
public class AbstractAndroidDeveloper extends EmployeeAbstractFactory {
    public Employee createEmployee(){
        return new AndroidDeveloper();
    }
}
