public class Main{
    public static void main(String args[]){
        NetworkConnection conn1 = new NetworkConnection();
        conn1.setIp("127.0.0.1");
        conn1.setData("This is data!");

        try{
            conn1.loadImportantData();
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            NetworkConnection conn2 = (NetworkConnection) conn1.clone();
            System.out.println(conn1);
            System.out.println(conn2);

            System.out.println(conn1.hashCode());
            System.out.println(conn2.hashCode());
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}