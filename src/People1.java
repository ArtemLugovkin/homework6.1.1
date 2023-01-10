import java.sql.SQLOutput;

public class People1 {

    String name1;
    int age1;
    String city1;
    String post;



    People1(String name1, int age1, String city1, String post) {
        this.name1 = name1;
        this.age1 = age1;
        this.city1 = city1;
        this.post = post;
    }

    void say1() {
        System.out.println("Привет! Меня зовут" + name1 + " Я из города " + city1 + "Мне " + age1 + " лет. Я работаю на должности" + post + " Будем знакомы!");
    }
}

