public class Main {
    public static void main(String args[]){
        Employee e1 = EmployeeFactory.getEmployee(new AbstractAndroidDeveloper());
        System.out.println(e1.salary());
    }
}
