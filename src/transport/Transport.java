package transport;

import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String countryOfManufacture;
    private String colorBody;
    private int maximumMovementSpeed;

    public Transport(String brand, String model, int year,
                     String countryOfManufacture, String colorBody,
                     int maximumMovementSpeed) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (countryOfManufacture == null || countryOfManufacture.isBlank() || countryOfManufacture.isEmpty()) {
            this.countryOfManufacture = "default";
        } else {
            this.countryOfManufacture = countryOfManufacture;
        }

        setColorBody(colorBody);
        setMaximumMovementSpeed(maximumMovementSpeed);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public String getColorBody() {
        return colorBody;
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setColorBody(String colorBody) {
        if (colorBody == null || colorBody.isEmpty() || colorBody.isBlank()) {
            this.colorBody = "default";
        } else  {
            this.colorBody = colorBody;
        }
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        if (maximumMovementSpeed < 0) {
            this.maximumMovementSpeed = 0;
        } else {
            this.maximumMovementSpeed = maximumMovementSpeed;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return year == transport.year && maximumMovementSpeed == transport.maximumMovementSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(countryOfManufacture, transport.countryOfManufacture) && Objects.equals(colorBody, transport.colorBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, countryOfManufacture, colorBody, maximumMovementSpeed);
    }

    @Override
    public String toString() {
        return  brand +
                " " + model +
                ". Год выпуска: " + year +
                ". Страна производства: " + countryOfManufacture +
                ". Цвет: " + colorBody +
                ". Максимальная скорость передвижения: " + maximumMovementSpeed;
    }
}
