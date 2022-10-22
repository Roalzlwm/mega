package OOP.VendingMachineProject;

public class VMPapp {
    public static void main(String[] args) {

        VMPsystem vmPsystem = new VMPsystem();
        VMPui vmPui = new VMPui();
        VMPmachine vmPmachine = new VMPmachine();

        // 0 - main // 1 - buyer //2 - manager // 3 - exit
        do{
            switch (vmPsystem.location){
                case 0: vmPui.entry();vmPsystem.locate();break;
                case 1: {
                    vmPui.showMachine();
                    vmPsystem.setBuyerBeverage();
                    vmPui.howManyBeverage();
                    vmPsystem.setBuyerBeverageQuantity();
                    vmPmachine.consume(VMPsystem.buyerBeverage,VMPsystem.buyerBeverageQuantity);
                    vmPmachine.showBeverage();
                    vmPsystem.initlocate();
                }break;
                case 2: break;
                case 3: break;
            }
        }while(VMPsystem.location!=3);

        vmPui.bye();
    }
}
