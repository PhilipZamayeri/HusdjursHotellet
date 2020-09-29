/**
 * Created by Philip Zamayeri
 * Date: 2020-09-28
 * Time: 12:41
 * Project: HusdjursHotellet
 * Copyright: MIT
 */
public enum Guest {
    SIXTEN("Sixten"),
    DOGGE("Dogge"),
    VENUS("Venus"),
    OVE("Ove"),
    HYPNO("Hypno");

    private final String eString;

    Guest(String string) {
        this.eString = string;
    }

    @Override
    public String toString(){
        return eString;
    }
}

