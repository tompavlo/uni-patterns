package composingmethods.removeassignmentstoparameters;

public class User {
    String username;
    String UUID;

    public User(String username){
        this.username = username;
    }

    public User(User user){
        username = user.username;
        username = user.UUID;
    }


    public void setRegistered(boolean b) {
        System.out.println("smth");
    }
}
