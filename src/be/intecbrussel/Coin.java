package be.intecbrussel;

import javax.management.monitor.MonitorSettingException;
import java.util.concurrent.locks.Lock;
import java.util.function.Predicate;

public enum Coin {
    ONE_CENT(1, "one cent", false), // Coin ONE_CENT = new Coin(1, "one cent", false);
    TWO_CENT(2, "two cent", false),
    FIVE_CENT(5, "five cent", true),
    TEN_CENT(10, "ten cent", true),
    TWENTY_CENT(20, "twenty cent", true),
    FIFTY_CENT(50, "fifty cent", true),
    ONE_EURO(100, "one euro", true),
    TWO_EURO(200, "two euro", true);

    private int value;
    private final String textRepresentation;
    private boolean isActive;

    private Coin(int value, String textRepresentation, boolean isActive) {
        this.value = value;
        this.textRepresentation = textRepresentation;
        this.isActive = isActive;
    }

    public int getValue() {
        return value;
    }

    public String getTextRepresentation() {
        return textRepresentation;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "value=" + value +
                ", textRepresentation='" + textRepresentation + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
