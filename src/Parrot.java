public class Parrot extends Pet{
    public Parrot(String name){
        super(name);
    }

    @Override
    String getPetType() {
        return "Попугай";
    }
}
