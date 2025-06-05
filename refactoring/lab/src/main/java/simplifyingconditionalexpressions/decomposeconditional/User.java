package simplifyingconditionalexpressions.decomposeconditional;

public class User {
    public void checkAccess(User user, Resource resource) {
        if (dataValidation(user, resource)) {
            if (user.hasPermission(resource)) {
                System.out.println("Access granted");
            } else {
                System.out.println("Access denied");
            }
        } else {
            System.out.println("Access denied");
        }
    }

    public boolean dataValidation(User user, Resource resource){
        return user != null && user.isLoggedIn() && resource != null;
    }

    public boolean isLoggedIn() {
        return Math.random() % 2 == 0;
    }

    public boolean hasPermission(Resource resource) {
        return Math.random() % 2 == 0;
    }
}
