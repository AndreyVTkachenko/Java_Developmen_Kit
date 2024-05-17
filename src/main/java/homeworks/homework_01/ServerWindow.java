package homeworks.homework_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends JFrame {
    private static final int POS_X = 500;
    private static final int POS_Y = 550;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private final JButton btnStart = new JButton("Start");
    private final JButton btnStop = new JButton("Stop");
    private final JTextArea log = new JTextArea();
    private boolean isServerWorking;

    public ServerWindow() {
        isServerWorking = false;
        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isServerWorking) {
                    log.append("The server has already stopped\n");
            } else {
                    log.append("Server stopped\n");
                    isServerWorking = false;
                }
            }
        });

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isServerWorking) {
                    log.append("The server is already running\n");
                } else {
                    log.append("Server started\n");
                    isServerWorking = true;
                }
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat server");
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
}
