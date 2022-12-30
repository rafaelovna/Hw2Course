public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int year;
    public String country;


    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        if (brand == null) {
            brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            model = "default";
        } else {
            this.model = model;
        }
        if (year <= 0) {
            year = 2000;
        } else {
            this.year = year;
        }
        if (country == null) {
            country = "default";
        } else {
            this.country = country;
        }
        if (color == null) {
            color = "белый";
        } else {
            this.color = color;
        }
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }


    void object() {
        System.out.println(
                brand + " " + model + ", " + year +
                        " год выпуска, сборка " + country +
                        ", цвет кузова - " + color + ", объём двигателя - "
                        + engineVolume + ".");
    }
}

        // НО ЛУЧШЕ ТАК (ВТОРОЙ СПОСОБ)
    /*public String getBrand() {
        if (brand == null) {
            brand = "default";
        }
        return brand;
    }

    public String getModel() {
        if (model == null) {
            model = "default";
        }
        return model;
    }

    public String getCountry() {
        if (country == null) {
            country = "default";
        }
        return country;
    }

    public double getEngineVolume() {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        return engineVolume;
    }

    public String getColor() {
        if (color == null) {
            color = "белый";
        }
        return color;
    }

    public int getYear() {
        if (year <= 0) {
            year = 2000;
        }
        return year;
    }

    void object() {
        System.out.println(getBrand()+" "+getModel()+", "+getYear()+" год выпуска, сборка "+getCountry()+", цвет кузова - "+getColor()+", объём двигателя - "+getEngineVolume()+".");
    }*/


