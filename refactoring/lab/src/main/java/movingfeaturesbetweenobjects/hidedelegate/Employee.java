package movingfeaturesbetweenobjects.hidedelegate;

public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    private Department department;

    public String getDepartmentName() {
        return department.getName();
    }
}

