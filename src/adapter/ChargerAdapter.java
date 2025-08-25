package adapter;

import adapter.chargers.UsbC_Charger;
import adapter.phones.iPhone14;

public class ChargerAdapter implements UsbC_Charger {

    private final iPhone14 iPhone14;

    public ChargerAdapter(iPhone14 iPhone14) {
        this.iPhone14 = iPhone14;
    }

    @Override
    public void chargeWithUsbC() {
        this.iPhone14.chargeWithLightening();
        System.out.println("Charging lightening iPhone by USB C.");
    }
}
