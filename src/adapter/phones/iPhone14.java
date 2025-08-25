package adapter.phones;

import adapter.chargers.Lightening_Charger;

public class iPhone14 implements Lightening_Charger {

    @Override
    public void chargeWithLightening() {
        System.out.println("Charging iPhone14 with Lightening Charger");
    }
}
