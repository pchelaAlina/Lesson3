//Урок 3 задание 1
public class Box {
    private final int weight;
    private final int height;
    private final int width;
    private final int length;
    public Box(int weight, int height, int width, int length){
        this.height=height;
        this.weight=weight;
        this.width=width;
        this.length=length;
    }

    public int getHeight() {
        return height;
    }
    public int getWidth(){
        return width;
    }
    public int getWeight(){
        return weight;
    }
    public int getLength(){
        return length;
    }
}
