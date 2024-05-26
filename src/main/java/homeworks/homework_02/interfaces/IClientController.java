package homeworks.homework_02.interfaces;

public interface IClientController {
    void connect();
    void sendMessage(String message);
    void receiveMessage(String message);
    void disconnect();
}
