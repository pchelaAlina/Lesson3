public class Cat extends Pet{
    public Cat(String name){
        super(name);
    }

    @Override
    String getPetType() {
        return "Кот";
    }
}
