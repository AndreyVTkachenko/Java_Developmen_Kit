package homeworks.homework_02.interfaces;

public interface IServerController {
    void startServer();
    void stopServer();
    boolean isServerRunning();
    boolean isServerStopped();
    void broadcastMessage(String message, IClientController sender);
    void logMessage(String message);
    void addClient(IClientController client);
    void removeClient(IClientController client);
}
