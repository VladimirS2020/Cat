public class Cat {
    //Ниже идут поля класса
    public double weight;
    public String name;
    public int age;
    public String color;
    private static int catCount;

    //Ниже идут методы
    public void meow() {
        System.out.println("Meow");
    }

    public void pee() {
        weight -= 20;
    }

    public void eat() {
        weight += 50;
    }


    //Конструктор по умолчанию
    public Cat() {
        weight = 3000;
        name = "Barsik";
        age = 1;
        color = "Grey";
    }

    //Конструктор, принимающий параметры
    public Cat(double weight1, String name1, int age1, String color1) {
        weight = weight1;
        name = name1;
        age = age1;
        color = color1;
        catCount++;
    }
}
