import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//Урок 3 задание 1:
// Создать ArrayList
//1.	Создать ArrayList, содержащий объекты Box. (Объект Box имеет поля вес, высота, широта, глубина)
//2.	Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
//3.	Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.

public class New {
    public static void main(String[] args) {
        Lesson3 ls3 = new Lesson3();
        ls3.addBox(new Box(50, 20, 5, 10));
        ls3.addBox(new Box(200, 5, 15, 20));
        ls3.addBox(new Box(180, 30, 8, 15));
        ls3.addBox(new Box(299, 35, 15, 25));
        ls3.addBox(new Box(301, 55, 9, 30));
        ls3.addBox(new Box(300, 54, 8, 30));

        ls3.perebor();
        ArrayList<Box> boxArray = ls3.getBoxArray();
        System.out.println("Коробки весом не более 300гр.");
        boxArray.forEach(box -> System.out.println("Характеристики: вес-" + box.getWeight() + " длина-" + box.getLength() + " ширина-" + box.getWidth() + " высота-" + box.getHeight()));
        System.out.println("Коробки весом более 300гр.");
        boxArray = ls3.getZeBoxArray();
        boxArray.forEach(box -> System.out.println("Характеристики: вес-" + box.getWeight() + " длина-" + box.getLength() + " ширина-" + box.getWidth() + " высота-" + box.getHeight()));
    }
}

