public class Main{
    public static void main(String[] args) {
        // int[] numbers = {10,20,30,40,50};
        // String[] fruits = new String[3];
        // System.out.println(numbers[1] + " - " + fruits[1]);

        // System.out.println(pers.getPets());
        // for (Pet pet : pers.getPets()) {
        //     System.out.println(pet.getPetName());
        // }

        Person pers = new Person("Freddy", 19, 2);
        Pet pet1 =  new Pet("Golden", "dog");

        if (pers.addPet(pet1)) {
            IOManager.printMessage("Success");
        } else {
            IOManager.printMessage("Failed");
        }

      
        if (pers.removePet(pet1)) {
            IOManager.printMessage("Pet remove successfully");
        }else{
            IOManager.printMessage("Failled to remove pet");
        }
       
        if (pers.getPets().length == 0) {
            IOManager.printMessage("no pets found");
        }else{
            for(Pet pet : pers.getPets()){
                IOManager.printMessage(pet.getPetName());
            }
        }


    }
}