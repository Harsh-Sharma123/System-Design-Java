import java.util.List;

public class MyIteratorImpl implements MyIterator{

    private List<User> list;
    private int position = 0;
    private int length;

    public MyIteratorImpl(List<User> list){
        this.list = list;
        this.length = list.size();
    }

    @Override
    public boolean hasNext(){
        if(this.position < length) return true;
        return false;
    }

    @Override
    public Object next(){
        User user = this.list.get(position);
        position += 1;
        return user;
    }

}