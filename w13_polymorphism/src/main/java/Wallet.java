import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private ArrayList<IChargeable> chargeables;
    private IChargeable selectedChargeable;

    public Wallet() {
        chargeables = new ArrayList<>();
        selectedChargeable = null;
    }

    public ArrayList<IChargeable> getChargeables(){
        return this.chargeables;
    }

    public IChargeable getSelectedChargeable(){
        return selectedChargeable;
    }

    public void addChargeable(IChargeable chargeable) {
        chargeables.add(chargeable);
    }

    public void selectChargeable(IChargeable chargeable) {
        selectedChargeable = chargeable;
    }

    public void pay(double purchaseAmount) {
        if (selectedChargeable != null) {
            selectedChargeable.charge(purchaseAmount);
        }
    }
}
