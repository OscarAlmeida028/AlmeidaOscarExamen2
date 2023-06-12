import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();
        interfaz.setVisible(true);
        interfaz.setContentPane(interfaz.getContentPane());
        interfaz.setTitle("");
        interfaz.setBounds(100,100,500,500);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}