package chapter14;

public class MinionGroup<T> {

    T tArray;

    void set(T n){
        tArray = n;
    }

    // tArray의 데이터타입은 T
    T get(){
        return tArray;
    }

}
