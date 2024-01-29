
public class Subscriber implements Observer {

    private String name;

    Subscriber(String name){
        this.name = name;
    }
    
    @Override
    public void notified(){
        System.out.println("Hey " + this.name + "! New Video is Uploaded on the Channel");
    }

}
