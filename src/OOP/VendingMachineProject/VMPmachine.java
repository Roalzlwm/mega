package OOP.VendingMachineProject;

public class VMPmachine {

    String [] beverages = {"POCARI","COKE","CIDER","WELCHS","VITA500"};
    int[] stocks = new int[]{15,15,15,15,15};

    void consume(int idx, int demand){
        if(stocks[idx] < demand) System.out.println(beverages[idx]+" is not enough");
        else stocks[idx] -= demand;
    }

    void fill(int idx, int qunatity){
        if(stocks[idx]+qunatity > 30) System.out.println(beverages[idx]+" is full");
        else stocks[idx] += qunatity;
    }

    void showBeverage(){
        for(int i:stocks) System.out.print(i);
    }

}
