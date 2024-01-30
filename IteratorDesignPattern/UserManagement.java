import java.util.ArrayList;

public class UserManagement {

    ArrayList<User> users = new ArrayList<>();

    public void addUser(User user){
        this.users.add(user);
    }

    public void getUser(int index){
        this.users.get(index);
    }

    public MyIterator getIterator(){
        return new MyIteratorImpl(this.users);
    }


}
