package transport;

import java.util.Objects;

public class Car extends Transport {

    class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;


        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Удаленный запуск двигателя: " +
                    remoteEngineStart +
                    ". Бесключевой доступ: " + keylessAccess;
        }
    }

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTire;
    private boolean winterTire;
    private Key key;

    public Car(String brand, String model, int year, String countryOfManufacture,
               String colorBody, int maximumMovementSpeed, double engineVolume,
               String transmission, String bodyType, String registrationNumber,
               int numberOfSeats, boolean summerTire, boolean winterTire, boolean remoteEngineStart, boolean keyLessAccess) {
        super(brand, model, year, countryOfManufacture, colorBody, maximumMovementSpeed);

        if (bodyType == null && bodyType.isEmpty() && bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        if (numberOfSeats <= 0) {
            this.numberOfSeats = 1;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setEngineVolume(engineVolume);
        setSummerTire(summerTire);
        setWinterTire(winterTire);
        setKey(remoteEngineStart, keyLessAccess);
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
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

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null && registrationNumber.isEmpty() && registrationNumber.isBlank()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean isSummerTire() {
        return summerTire;
    }

    public void setSummerTire(boolean summerTire) {
            this.summerTire = summerTire;
    }

    public boolean isWinterTire() {
        return winterTire;
    }

    public void setWinterTire(boolean winterTire) {
        this.winterTire = winterTire;
    }

    //    Метод «сменить шины на сезонные».

    public void changeTireSign(int month) {
        if (month >= 4 && month <= 10) {
            setSummerTire(true);
        } else {
            setWinterTire(true);
        }
    }

    public void setKey(boolean remoteEngineStart, boolean keyLessAccess) {
        this.key = new Key(remoteEngineStart, keyLessAccess);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && numberOfSeats == car.numberOfSeats && summerTire == car.summerTire && winterTire == car.winterTire && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(key, car.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineVolume, transmission, bodyType, registrationNumber, numberOfSeats, summerTire, winterTire, key);
    }



    @Override
    public String toString() {
        return "Автомобиль: " + super.toString() + ". Объем двигателя: " + engineVolume +
                ". Коробка передач: " + transmission +
                ". Тип кузова: " + bodyType +
                ". Регистрационный номер: " + registrationNumber +
                ". Количество мест: " + numberOfSeats +
                ". Летняя резина: " + summerTire +
                ". Зимняя резина: " + winterTire + ". " + key;

    }
}
