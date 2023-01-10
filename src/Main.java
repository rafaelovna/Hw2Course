import transport.Bus;
import transport.Car;
public class Main {
    public static void main(String[] args) {
        Car lada = new Car(
                "Lada",
                "Granta", 2015,"Россия", "желтый",
                220,1.7, "механика",
                "хечбек", "B675NB65", 5,
                false, true, true,
                true);
        System.out.println(lada);


        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                2020,"Германия", "черный",
                250, 3.0  , "автомат", "хечбек",
                "G675NB65", 5, true, false,
                false, true);
        System.out.println(audi);


        Car bmv = new Car(
                "BMW",
                "Z8",
                2021 , "Германия","черный",280,
                3.0, "механика",
                 "хечбек","Т654МИ63", 5, false,
                true, true,true);
        System.out.println(bmv);


        Car kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2018,"Южная Корея", "красный",220,1.8,
                "автомат", "хечбек", "К454МИ63",
                5, false, true, true,true);
        System.out.println(kia);


        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                2016,"Южная Корея","оранжевый",250, 1.6,
                "механика", "хечбек", "Д454МИ63",
                5, false, true, true, true);
        System.out.println(hyundai);


        Bus liaz = new Bus("ЛиАЗ", "529267", 2022, "Китай",
                "белый", 269);
        System.out.println(liaz);


        Bus higer = new Bus("Higer", "KLQ 6129", 2019, "Китай",
                "белый", 383);
        System.out.println(higer);


        Bus paz = new Bus("ПАЗ", "320405-04", 2022, "Россия",
                "белый", 169);
        System.out.println(paz);
    }
}