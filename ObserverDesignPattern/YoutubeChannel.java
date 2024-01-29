import java.util.ArrayList;

public class YoutubeChannel implements Subject {
    
    ArrayList<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer ob){
        this.subscribers.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob){
        this.subscribers.remove(ob);
    }

    @Override
    public void newVideUploaded(){
        for (Observer ob : this.subscribers){
            ob.notified();
        }
    }
    
}
