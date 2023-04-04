import Interfaces.IValuable;

import java.util.ArrayList;

public class Assets {

    private ArrayList<IValuable> valuables;
    private String owner;

    public Assets(String owner){
        this.owner = owner;
        this.valuables = new ArrayList<>();
    }

    public void addValuable(IValuable valuable){
        this.valuables.add(valuable);
    }

    public int getValuableCount(){
        return this.valuables.size();
    }

    public double getTotalValue() {
        double totalValue = 0;
        for (IValuable valuable : valuables){
            totalValue += valuable.getValue();
        }
        return totalValue;
    }

}
