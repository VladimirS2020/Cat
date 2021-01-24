public class Main {
    public static void main(String[] args) {
        Cat bigCat = new Cat(5500, "Murka_Second commit", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya_Second commit", 1, "White");
        bigCat.weight += 100;
        smallCat.weight += 1000;
        System.out.println("Вес большой кошки = " + bigCat.weight);
        System.out.println("Вес маленькой кошки = " + smallCat.weight);
    }
}
