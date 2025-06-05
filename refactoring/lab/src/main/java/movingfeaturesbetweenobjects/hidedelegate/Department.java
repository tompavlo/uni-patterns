package movingfeaturesbetweenobjects.hidedelegate;

public class Department {
    private String name;
    private Employee manager;

    public String getName() {
        return name;
    }

    public String getManagerName() {
        return manager.getName();
    }
}
