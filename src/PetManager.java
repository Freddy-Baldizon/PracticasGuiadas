public class PetManager {
    private int counter;
    private Pet[] pets;

    public PetManager(int numberOfPets) {
        this.counter = counter;
        this.pets = new Pet[numberOfPets];
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

    public boolean removePet(Pet pet){
        for(int i = 0; i< pets.length; i++){
            if (pets[i] != null && pets[i].equals(pet)) {
                //corre a la izquierda los elementos posteriores a los eliminados
                for(int j = i;j < pets.length -1; j++ ){
                    pets[j] = pets[j + 1];
                }

                pets[pets.length -1] = null;
                counter--;
                return true;
            }
        }
        return false;
    }
}
