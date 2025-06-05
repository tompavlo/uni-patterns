package composingmethods.removeassignmentstoparameters;

import java.util.List;

public class UserManager {
    private List<User> users;
    public void addUser(User user) {
        var userToAdd = new User(user);
        userToAdd.setRegistered(true);
        users.add(userToAdd);
    }
}
