public class NetworkConnection implements Cloneable{
    private String ip;
    private String data;

    public String getIp(){
        return this.ip;
    }

    public String getData(){
        return this.data;
    }

    public void setIp(String ip){
        this.ip = ip;
    }

    public void setData(String data){
        this.data = data;
    }

    public void loadImportantData() throws InterruptedException{
        Thread.sleep(5000);
    }

    @Override
    public String toString(){
        return this.ip + " " + this.data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}