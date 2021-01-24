interface Message{
    String greet();
}

public class AnonymousInnerClassAsArgument{
    public void displayMessage(Message m){
        System.out.println(m.greet() + ", это метод из вложенного анонимного класса");
    }

    public static void main(String[] args) {
        AnonymousInnerClassAsArgument obj = new AnonymousInnerClassAsArgument();
        obj.displayMessage(new Message(){
            public String greet(){
                return "Привет";
            }
        });
    }

}