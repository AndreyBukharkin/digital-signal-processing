package labDop;

import labDop.Graphic;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Задача ужас");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Graphic graph = new Graphic();
        frame.add(graph);
        frame.setSize(1920, 1080);
        frame.setVisible(true);
    }
}
