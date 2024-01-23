import java.lang.reflect.Constructor;

public class SingletonExample{
    // public static void main(String args[]){

    //     Samosa s1 = Samosa.getSamosa();
    //     System.out.println(s1.hashCode());

    //     Samosa s2 = Samosa.getSamosa();
    //     System.out.println(s2.hashCode());
        
    // }

    // Breaking of Singleton Design Pattern
    // 1. Reflection API
    public static void main(String args[]) throws Exception{
        
        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());

        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor(null);
        constructor.setAccessible(true);

        Samosa s2 = constructor.newInstance();
        System.out.println(s2.hashCode());
    }
}