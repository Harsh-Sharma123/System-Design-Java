import java.util.ArrayList;

public class DeepCopyNetworkConnection{


    private String ip;
    private String data;
    private ArrayList<String> arr = new ArrayList<>();

    public void setIp(String ip){
        this.ip = ip;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getIp(){
        return this.ip;
    }

    public String getData(){
        return this.data;
    }

    public void setList(ArrayList<String> l){
        this.arr = l;
    }

    public ArrayList<String> getList(){
        return this.arr;
    }

    public void loadData() throws InterruptedException{
        Thread.sleep(5000);
    }

    @Override
    public String toString(){
        String tmp = "";
        for(String s: this.getList()){
            tmp += s;
            tmp += " ";
        }
        return this.ip + " " + this.data + " " + tmp;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCopyNetworkConnection conn1 = new DeepCopyNetworkConnection();
        conn1.setIp(this.ip);
        conn1.setData(this.data);
        for(String s : this.getList()){
            conn1.getList().add(s);
        }
        return conn1;
    }
}