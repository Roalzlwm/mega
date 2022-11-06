package GUI.itemEvent.teacher;

public class Fruit {
    String name;
    Integer price;

    Fruit(String name, int price){
        this.name = name;
        this.price = price;
    }

    String namingify() {
        return name+" "+price.toString()+"원";
    }
}
