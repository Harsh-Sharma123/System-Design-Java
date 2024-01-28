import java.util.ArrayList;

public class Main2 {
    public static void main(String args[]){
        DeepCopyNetworkConnection conn1 = new DeepCopyNetworkConnection();
        conn1.setIp("127.0.0.1");
        conn1.setData("This is data!");
        ArrayList<String> a = new ArrayList<>();
        a.add("System");
        a.add("Design");
        a.add("Patterns");
        a.add("Java");
        conn1.setList(a);

        try{
            conn1.loadData();
        } catch (Exception e){
            e.printStackTrace();
        }

        try{
            DeepCopyNetworkConnection conn2 = (DeepCopyNetworkConnection) conn1.clone();
            System.out.println(conn1);
            conn2.getList().remove(3);
            System.out.println(conn2);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
