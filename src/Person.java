public class Person {
    private String name;
    private int age;
    private Pet[] pet;

    public Person(String name, int age, int numberOfPet) {
        this.name = name;
        this.age = age;
        this.pet = new Pet[numberOfPet];
        
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet[] getPet() {
        return pet;
    }

    public void setPet(Pet[] pet) {
        this.pet = pet;
    }
}
