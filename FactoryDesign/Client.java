
public class Client {
    public static void main(String args[]){
        Employee emp = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(emp.salary());

        Employee emp2 = EmployeeFactory.getEmployee("Web Developer");
        System.out.println(emp2.salary());
    }
}
