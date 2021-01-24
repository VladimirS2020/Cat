// внешний класс
public class OuterClass {

    // переменная во внешнем классе
    public int num = 175;

    public class Inner_Class{
        public int display(){
            System.out.println("Вы в методе внутреннего класса");
            return num;
        }
    }

    public static void main(String[] args) {
        // создаем объект внешнего класса
        OuterClass outer = new OuterClass();

        // создаем объект внутреннего класса
        OuterClass.Inner_Class inner = outer.new Inner_Class();

        System.out.println(inner.display());
    }

}
