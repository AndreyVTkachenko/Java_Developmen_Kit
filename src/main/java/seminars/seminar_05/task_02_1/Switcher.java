package seminars.seminar_05.task_02_1;

public class Switcher {

    private volatile boolean switcher = false;

    public boolean getSwitcher() {
        return switcher;
    }

    public void setSwitcher(boolean switcher) {
        this.switcher = switcher;
    }
}
