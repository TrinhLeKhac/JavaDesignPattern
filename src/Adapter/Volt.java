package Adapter;

/**
 * Adapter design pattern
 *
 * Real life example:
 * Mobile battery need 3 volt to charge but the normal socket produces either 110V or 220V
 * Mobile charger works as an adapter between mobile charging socket and the wall socket
 * */

public class Volt {

    private int volts;

    public Volt(int v) {
        this.volts = v;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}
