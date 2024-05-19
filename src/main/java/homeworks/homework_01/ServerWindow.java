package homeworks.homework_01;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ServerWindow extends JFrame {
    private static final int POS_X = 500;
    private static final int POS_Y = 550;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private final JButton btnStart = new JButton("Старт");
    private final JButton btnStop = new JButton("Стоп");
    private final JTextArea log = new JTextArea();
    private boolean isServerWorking;
    private boolean isServerStopped;
    private final List<ClientGUI> connectedClients = new ArrayList<>();

    public ServerWindow() {
        isServerWorking = false;
        isServerStopped = false;

        btnStop.addActionListener(e -> {
            if (!isServerWorking) {
                log.append("Сервер уже остановлен\n");
            } else {
                stopServer();
            }
        });

        btnStart.addActionListener(e -> {
            if (isServerWorking) {
                log.append("Сервер уже запущен\n");
            } else {
                startServer();
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Чат");
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.add(btnStart);
        topPanel.add(btnStop);
        add(topPanel, BorderLayout.NORTH);

        log.setEditable(true);
        JScrollPane scrollLog = new JScrollPane(log);
        add(scrollLog, BorderLayout.CENTER);

        setVisible(true);
    }

    public boolean isServerRunning() {
        return isServerWorking;
    }

    public boolean isServerStopped() {
        return isServerStopped;
    }

    public void logMessage(String message) {
        log.append(message + "\n");
    }

    public void startServer() {
        isServerStopped = false;
        log.append("Сервер запущен\n");
        isServerWorking = true;
    }

    public void stopServer() {
        isServerStopped = true;
        for (ClientGUI client : connectedClients) {
            client.disconnect();
        }
        log.append("Сервер остановлен. Все клиенты отключены\n");
        isServerWorking = false;
    }

    public void addClient(ClientGUI client) {
        connectedClients.add(client);
    }

    public void removeClient(ClientGUI client) {
        connectedClients.remove(client);
    }

    public void broadcastMessage(String message, ClientGUI sender) {
        if (!isServerStopped) {
            log.append(message + "\n");
            for (ClientGUI client : connectedClients) {
                if (client != sender) {
                    client.receiveMessage(message);
                }
            }
        }
    }
}
