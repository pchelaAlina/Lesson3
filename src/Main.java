public class Main {
    public static void main(String[] args) {
        Farmrules fm = new Farmrules();
        Pet pet = new Cat("Пушок");
        fm.addPet(pet);
        pet = new Dog("Тайсон");
        fm.addPet(pet);
        pet = new Parrot("Петька");
        fm.addPet(pet);

        fm.listOfPet();
    }
}