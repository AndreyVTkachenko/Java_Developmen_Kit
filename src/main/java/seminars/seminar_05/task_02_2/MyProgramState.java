package seminars.seminar_05.task_02_2;

public class MyProgramState {
    private volatile boolean switcher;
    private volatile boolean finish;

    public boolean isSwitcher() {
        return switcher;
    }

    public void setSwitcher(boolean switcher) {
        this.switcher = switcher;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
