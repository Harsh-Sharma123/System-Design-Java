public class Main {
    public static void main(String args[]){
        User user = new User.UserBuilder().setName("Harsh Sharma").setEmail("hs804506@gmail.com").build();

        System.out.println(user.getEmail());
        System.out.println(user.getName());
    }    
}
