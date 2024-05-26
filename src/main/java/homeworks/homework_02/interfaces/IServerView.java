package homeworks.homework_02.interfaces;

public interface IServerView {
    void showMessage(String message);
    void setController(IServerController controller);
    void enableStopButton(boolean enable);
}
