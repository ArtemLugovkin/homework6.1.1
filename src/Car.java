public class Car {

    String mark;

    String model;

    String engineСapacity;

    String bodyСolor;

    String yearOfProduction;

    String countryOfAssembly;

    Car(String mark, String model, String engineСapacity, String bodyСolor, String yearOfProduction, String countryOfAssembly) {
        this.mark = mark;
        this.model = model;
        this.engineСapacity = engineСapacity;
        this.bodyСolor = bodyСolor;
        this.yearOfProduction = yearOfProduction;
        this.countryOfAssembly = countryOfAssembly;
    }
    void carInformation() {
        System.out.println( mark + " " + model + ", " + yearOfProduction + " год выпуска, " + " сборка в " + engineСapacity  + ", " + bodyСolor + " цвета," + " обьем двигателя" + countryOfAssembly);

    }

}
