public class Person {
    private String name;
    private int age;
    private PetManager petManager;

    public Person(String name, int age, int numberOfPet) {
        this.name = name;
        this.age = age;
        this.petManager = new PetManager(numberOfPet);

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

    public PetManager getPetManager() {
        return petManager;
    }

    public void setPetManager(PetManager petManager) {
        this.petManager = petManager;
    }

    public boolean addPet(Pet pet) {
        return petManager.addPets(pet);
    }
}
