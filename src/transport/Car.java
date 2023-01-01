package transport;

public class Car {
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
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTire;
    private boolean winterTire;
    private Key key;




//    Конструктор

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats,
               boolean summerTire, boolean winterTire, boolean remoteEngineStart,
               boolean keylessAccess) {


        if (brand == null && brand.isBlank() && brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null && model.isBlank() && model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (country == null && country.isBlank() && country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }

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
        setColor(color);
        setEngineVolume(engineVolume);
        setSummerTire(summerTire);
        setWinterTire(winterTire);
        setKey(remoteEngineStart, keylessAccess);
    }
// Создаем геттеры для неизменяемых полей!




    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

//    Остальные поля изменяться могут, доступ к ним должен
//    осуществляться через геттеры и сеттеры.

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null && color.isEmpty() && color.isBlank()) {
            this.color = "default";
        } else  {
            this.color = color;
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



    public void setKey(Boolean remoteEngineStart, Boolean keyLessAccess) {
            this.key = new Key(remoteEngineStart, keyLessAccess);
    }

    @Override
    public String toString() {
        return "Автомобиль: "+brand +" "+ model +
                ". Объём двигателя: " + engineVolume +
                ". Цвет: " + color +". Год выпуска: "+ year +
                ". Страна сборки: " + country +
                ". Коробка передач: " + transmission +
                ". Тип кузова: " + bodyType +
                ". Регистрационный номер: " + registrationNumber +
                ". Количество мест: " + numberOfSeats +
                ". Летняя резина: " + summerTire +
                ". Зимняя резина: " + winterTire+
                ". Ключ: "+ key;
    }
}
