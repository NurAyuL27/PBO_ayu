import javax.swing.*;

public class SimpleFrame extends JFrame {
    public static void main(String[] args) {
        JFrame frameUtama = new JFrame("Aplikasi GUI Pertama");

        frameUtama.setSize(512, 256);
        frameUtama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelNama = new JLabel("Nama");
        labelNama.setLocation(50, 50);

        JTextField textFieldNama = new JTextField();
        textFieldNama.setSize(200, 10);
        textFieldNama.setLocation(100, 50);

        frameUtama.add(labelNama);
        frameUtama.add(textFieldNama);

        frameUtama.setVisible(true);
        frameUtama.show();
    }
}