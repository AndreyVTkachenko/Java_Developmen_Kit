package homeworks.homework_02.server;

public interface IServerView {
    void showMessage(String message);
    void setController(IServerController controller);
    void enableStopButton(boolean enable);
}
