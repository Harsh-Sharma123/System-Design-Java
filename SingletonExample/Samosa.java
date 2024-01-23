public class Samosa{
    
    // This is Lazy Initialization, we are creating object for first time when it is called.
    // private static Samosa samosa;
    
    // public static Samosa  getSamosa(){
    //     if(samosa == null) samosa = new Samosa();
    //     return samosa;
    // }

    // Eager way of creating object
    private static Samosa samosa = new Samosa();

    private Samosa(){
        
    }

    public static Samosa getSamosa(){
        return samosa;
    }


}