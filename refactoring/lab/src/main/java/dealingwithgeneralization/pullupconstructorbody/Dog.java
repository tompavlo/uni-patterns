package dealingwithgeneralization.pullupconstructorbody;

class Dog extends Animal {

    String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
}
