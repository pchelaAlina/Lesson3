public abstract class Pet {
    private final String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    abstract String getPetType();

    @Override
    public String toString() {
        return "{ " + "Кличка животного = '" + name + '\'' + '}';
    }
}


