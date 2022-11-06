package chapter14;

public class Minion {

    String color;
    String kind;
    int hp;
    int power;

    Minion(String color,String kind){
        this.color = color;
        this.kind = kind;
        this.hp = 100;
        this.power = estimatePower(this.kind);
    }

    int estimatePower(String kind){
        if(kind == "sword") return 5;
        else if(kind == "magic") return 3;
        else return 10;
    }

    void attack(){

    }

}
