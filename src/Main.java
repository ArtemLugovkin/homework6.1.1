public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    private static void task1() {
        System.out.println("Часть 1. Задание 1");

        People maksim = new People(" Максим. ", 35, "Минск. ");
        People any = new People("Аня. ", 29, "Москва. ");
        People kate = new People("Катя. ", 28, "Калининград. ");
        People artem = new People("Артём. ", 27, "Москва. ");

        maksim.say();
        any.say();
        kate.say();
        artem.say();
    }

    private static void task2() {
        System.out.println("Часть 1. Задание 2");

        People1 maksim = new People1(" Максим. ", 35, "Минск "," бренд-менеджер.");
        People1 any = new People1("Аня. ", 29, "Москва. ", " методист образовательных программ.");
        People1 kate = new People1("Катя. ", 28, "Калининград. ", " продакт-менеджер.");
        People1 artem = new People1("Артём. ", 27, "Москва. ", " директор по развитию бизнеса.");

        maksim.say1();
        any.say1();
        kate.say1();
        artem.say1();
    }

    private static void task3() {
        System.out.println("Часть 1. Задание 3");

        Car ladaGrande = new Car( "Lada", " Grande ", " в России", " желтого ", " 2015", " 1.7.");
        Car audiA8 = new Car("Auda", "A8", " в Германии", "черного ", "2020", " 3.0");
        Car bMWZ8 = new Car("BMW", "Z8", " в Германии", "черного", "2021", " 3.0");
        Car kiaSportage4 = new Car("Kia", "Sportage4", " в Южной Корее", "красного", "2018", " 2.4");
        Car hyundaiAvante = new Car("Hyundai", "Avante", "в Южной Корее", "оранжевого", "2016", " 1.6");

        ladaGrande.carInformation();
        audiA8.carInformation();
        bMWZ8.carInformation();
        kiaSportage4.carInformation();
        hyundaiAvante.carInformation();
    }
}