package homeworks.homework_01;

public class Main {
    public static void main(String[] args) {
        ServerWindow serverWindow = new ServerWindow();
        new ClientGUI(serverWindow, "Фаина Раневская");
        new ClientGUI(serverWindow, "Аркадий Райкин");
        System.out.println("Method main() is over");
    }
}
