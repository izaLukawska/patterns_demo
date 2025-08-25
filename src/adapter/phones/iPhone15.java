package adapter.phones;

import adapter.chargers.UsbC_Charger;

public class iPhone15 implements UsbC_Charger {

    @Override
    public void chargeWithUsbC() {
        System.out.println("Charging iPhone15 with USB-C Charger");
    }
}
