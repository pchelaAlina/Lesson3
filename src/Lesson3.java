import java.util.ArrayList;
import java.util.Iterator;
//Урок 3, задание 1
public class Lesson3 {
    final private ArrayList<Box> boxArray = new ArrayList<>();
    final private ArrayList<Box> zeBoxArray = new ArrayList<>();

    public void addBox(Box box) {
        boxArray.add(box);
    }

    public ArrayList<Box> getBoxArray() {
        return boxArray;
    }

    public ArrayList<Box> getZeBoxArray() {
        return zeBoxArray;
    }

    public void perebor() {
        for (Iterator<Box> iterator = boxArray.iterator(); iterator.hasNext(); ) { //перебираем элементы коллекции
            Box box = iterator.next();
            if (box.getWeight() > 300) {
                zeBoxArray.add(box);
                iterator.remove();

            }
        }
    }
}

