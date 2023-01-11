package transport;

import java.util.Objects;

public class Bus extends Transport {

    public Bus(String brand, String model, int year, String countryOfManufacture,
               String colorBody, int maximumMovementSpeed) {
        super(brand, model, year, countryOfManufacture, colorBody, maximumMovementSpeed);

    }

    @Override
    public String toString() {
        return "Автобус: " + super.toString();
    }
}
