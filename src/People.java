import java.sql.SQLOutput;

public class People {

    String name;
    int age;
    String city;


    People(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    void say() {
        System.out.println("Привет! Меня зовут" + name + " Я из города " + city + "Мне " + age + " лет. Будем знакомы!");
    }
}

