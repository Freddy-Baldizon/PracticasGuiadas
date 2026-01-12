public class PetManager {
    private int counter;
    private Pet[] pets;

    public PetManager(int numberOfPets) {
        numberOfPets = 0;
    }

    public boolean addPets(Pet pet){
        for(int i = 0; i < pets.length; i++){
            if (pets[i] == null) {
                pets[i] = pet;
                counter++;
                return true;
            }
        }

        return false;
    }
}
