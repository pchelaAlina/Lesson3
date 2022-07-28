import java.util.HashMap;
import java.util.Map;
//Урок 3, задание 2
//Создать HashMap
//1.	Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
//2.	Перебрать и распечатать пары значений - entrySet().
//3.	Перебрать и распечатать набор из имен продуктов  - keySet().
//4.	Перебрать и распечатать значения продуктов - values().
//5.	Для каждого перебора создать свой метод.
public class Toys {
    public static void main(String[] args) {
        Map<String, Product> productMap = new HashMap<>();
        fillMap(productMap);
        System.out.println("Используем keySet():");
        MapIteration.printByKeySet(productMap);
        System.out.println("Используем values():");
        MapIteration.printByValues(productMap);
        System.out.println("Используем entrySet():");
        MapIteration.printByEntrySet(productMap);
    }
    public static void fillMap(Map<String, Product> toyMap) {
        toyMap.put("Poop-it", new Product("Poop-it", 1234));
        toyMap.put("Teddy bear", new Product("Teddy bear", 1250));
        toyMap.put("Barbie", new Product("Barbie", 1251));
        toyMap.put("Lego", new Product("Lego", 4522));
        toyMap.put("Yula", new Product("Yula", 1111));


    }
}
