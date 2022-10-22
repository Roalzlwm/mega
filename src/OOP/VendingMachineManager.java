package OOP;

public class VendingMachineManager {

    int pocariSweat;
    int coke;
    int cider;
    int welchs;
    int vita500;


    VendingMachineManager(){
        this.pocariSweat = 30;
        this.coke = 30;
        this.cider = 30;
        this.welchs = 30;
        this.vita500 = 30;
    }


    void showRemain(String TradeName){
        if (TradeName == "POCARISWEAT") System.out.println("POCARISWEAT : "+this.pocariSweat);
        if (TradeName == "COKE") System.out.println("COKE : "+this.coke);
        if (TradeName == "CIDER") System.out.println("CIDER : "+this.cider);
        if (TradeName == "WELCHS") System.out.println("WELCHS : "+this.welchs);
        if (TradeName == "VITA500") System.out.println("VITA500 : "+this.vita500);
    }

    void showAllRemain(){
        System.out.println("POCARISWEAT : "+this.pocariSweat);
        System.out.println("COKE : "+this.coke);
        System.out.println("CIDER : "+this.cider);
        System.out.println("WELCHS : "+this.welchs);
        System.out.println("VITA500 : "+this.vita500);
    }

    void fill(){
        for(int i = 0; i < 30; i++){
            int pocariSweatFill = 30 - this.pocariSweat;
            int cokeFill = 30 - this.coke;
            int ciderFill = 30 - this.cider;
            int welchsFill = 30 - this.welchs;
            int vita500Fill = 30 - this.vita500;
            int pocariSweatAfter = this.pocariSweat + pocariSweatFill;
            int cokeAfter = this.coke + cokeFill;
            int ciderAfter = this.cider + ciderFill;
            int welchsAfter = this.welchs + welchsFill;
            int vita500After = this.vita500 + vita500Fill;
        }
        showAllRemain();
    }


}
