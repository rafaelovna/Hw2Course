package transport;

import java.util.Objects;

public class Bus extends Transport {
    private String typeBus;
    private double engineVolume;
    private String transmission;

    public Bus(String brand, String model, int year, String countryOfManufacture,
               String colorBody, int maximumMovementSpeed, String typeBus, double engineVolume, String transmission) {
        super(brand, model, year, countryOfManufacture, colorBody, maximumMovementSpeed);
        setTypeBus(typeBus);
        setTransmission(transmission);
        setEngineVolume(engineVolume);
    }

    public String getTypeBus() {
        return typeBus;
    }

    public void setTypeBus(String typeBus) {
        if (typeBus == null && typeBus.isBlank() && typeBus.isEmpty()) {
            this.typeBus = "default";
        } else {
            this.typeBus = typeBus;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null && transmission.isEmpty() && transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return Double.compare(bus.engineVolume, engineVolume) == 0 && Objects.equals(typeBus, bus.typeBus) && Objects.equals(transmission, bus.transmission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeBus, engineVolume, transmission);
    }

        @Override
    public String toString() {
        return "Автобус: " + super.toString() +
                ". Тип автобуса: " + typeBus +
                ". Двигатель: " + engineVolume +
                ". Коробка передач: " + transmission;
    }
}
