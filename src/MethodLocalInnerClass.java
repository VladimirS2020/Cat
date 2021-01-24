public class MethodLocalInnerClass {

    // метод внешнего класса
    void method() {
        int num = 23;

        // начало внутреннего класса внутри метода
        class MethodInner_Demo {
            public void print() {
                System.out.println("Это внутренний класс внутри метода, а также число num: " + num);
            }
        } // конец внутреннего класса внутри метода

        // продолжение внешнего класса
        MethodInner_Demo inner = new MethodInner_Demo();
        inner.print();
    }
}
