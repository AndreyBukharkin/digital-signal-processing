package labDop;

import java.awt.*;
import javax.swing.*;

public class Graphic extends JPanel {

    public void paintComponent (Graphics g){
        double distance = 100000;
        double h = 0.1;
        double t = 5;
        int nPoints = (int) ( Math.round(distance / h));
        double[] x = new double[nPoints];
        double[] y = new double[x.length];
        int []  xCoordinate = new int[x.length];
        int []  yCoordinate = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = (h * i);
            y[i] = (-5+Math.random()+Math.random()+Math.random()+Math.random()+Math.random()+Math.random()+Math.random()+Math.random()+Math.random()+Math.random()+Math.random()) ;
            x[i] = (x[i] * 50) + 30;
            y[i] = (y[i] * 100) + 400;
            xCoordinate[i] = (int)(Math.round(x[i]));
            yCoordinate[i] = (int)(Math.round(y[i]));
        }

        this.setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawString("Задача 3 доп. задание", 15, 15);
        g.drawLine(30, 400, 770, 400);
        g.drawLine(30, 30, 30, 770);
        g.drawString("Y", 20, 37);
        g.drawString("X", 760, 415);
        g.setColor(Color.CYAN);
        g.drawPolyline(xCoordinate, yCoordinate, nPoints);
        g.setColor(Color.RED);
    }
}