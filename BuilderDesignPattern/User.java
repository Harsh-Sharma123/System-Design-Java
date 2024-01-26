public class User {

    private String name;
    private String email;

    private User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.email = userBuilder.email;
    }    

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    static class UserBuilder{
        private String name;
        private String email;

        public UserBuilder(){}

        public UserBuilder setName(String name){
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email){
            this.email = email;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
