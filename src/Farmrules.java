import java.util.HashMap;

import static java.lang.System.err;

public class Farmrules {
    private final HashMap<String, Pet> petHashMap = new HashMap<>();

    void logError(String str) {
        err.println(str);
    }

    public void addPet(Pet pet) {
        if (petHashMap.put(pet.getName(), pet) != null) {
            logError(pet.getName()); //
        }
    }

    public void listOfPet() {
        for (String name : petHashMap.keySet()) {
            System.out.println(petHashMap.get(name));
        }
    }
}
