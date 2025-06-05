package codebase.largeclass;

public class LargeClass {
    private String name;
    private int age;
    private Gender gender;
    private EnemyList enemies;
    private FriendList friends;
    private TaskList tasks;
    public LargeClass(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.friends = new FriendList();
        this.enemies = new EnemyList();
        this.tasks = new TaskList();
    }

    public EnemyList getEnemies() {
        return enemies;
    }

    public FriendList getFriends() {
        return friends;
    }

    public TaskList getTasks() {
        return tasks;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender.name());
        System.out.println("Friends: " + this.friends.toString());
        System.out.println("Enemies: " + this.enemies.toString());
        System.out.println("Tasks: " + this.tasks.toString());
    }
}

