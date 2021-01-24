public class StaticNestedClass {

    static class Nested_Demo {
        public void my_method() {
            System.out.println("Это метод из статического вложенного класса");
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.Nested_Demo nested = new StaticNestedClass.Nested_Demo();
        nested.my_method();
    }
}
