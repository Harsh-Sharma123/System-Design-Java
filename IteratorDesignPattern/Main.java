
public class Main {

    public static void main(String args[]){

        UserManagement usermgmnt = new UserManagement();
        usermgmnt.addUser(new User("a", "1"));
        usermgmnt.addUser(new User("b", "2"));
        usermgmnt.addUser(new User("c", "3"));
        usermgmnt.addUser(new User("d", "4"));

        MyIterator myiterator = usermgmnt.getIterator();
        
        while(myiterator.hasNext()){
            User user = (User) myiterator.next();
            System.out.println(user.getName() + " " + user.getId());
        }

    }

}
