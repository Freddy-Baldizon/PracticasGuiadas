
import java.util.ArrayList;
import java.util.List;


public class ManagerList {
    private int counter;
    private List<Pet> pets;

    public ManagerList(int numberOfPets) {
        this.counter = 0;
        this.pets = new ArrayList<>();
    }

    public boolean addPets(Pet pet) {

        if (pets == null) {
            return pets.add(pet);
        }

        return false;
    }

    public boolean removePet(Pet pet) {

        if (pets != null && pets.equals(pet)) {

            pets.remove(pet);

            return true;
        }
        return false;
    }

    public List<Pet> getPets() {
        List<Pet> pet = new ArrayList<>(pets);
        return pet;
    }

    public boolean updatePet(Pet pet, int index) {
        if (pet == null) {
            return false;
        }

        if (index < 0 || index > pets.size()) {
            return false;
        }
        pets.set(index, pet);

        return true;

    }
    

    
}
