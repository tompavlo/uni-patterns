package dealingwithgeneralization.pullupconstructorbody;

class Cat extends Animal {
    String color;
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
}
