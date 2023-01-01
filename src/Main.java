import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(
                "Lada",
                "Granta", 1.7, "желтый",
                2015, "Россия", "механика",
                "хечбек", "B675NB65", 5,
                false, true, true,
                true);
        System.out.println(lada);


        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0, "черный",
                2020, "Германия", "автомат", "хечбек",
                "G675NB65", 5, true, false,
                false, true);
        System.out.println(audi);


        Car bmv = new Car(
                "BMW",
                "Z8",
                3.0,"черный",2021, "Германия", "механика",
                 "хечбек","Т654МИ63", 5, false, true,
                true,true);
        System.out.println(bmv);


        Car kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4,"красный",2018,"Южная Корея",
                "автомат", "хечбек", "К454МИ63",
                5, false, true, true,true);
        System.out.println(kia);


        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,"оранжевый",2016,"Южная Корея",
                "механика", "хечбек", "Д454МИ63",
                5, false, true, true, true);
        System.out.println(hyundai);

    }
}