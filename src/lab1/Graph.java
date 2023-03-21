package lab1;

import java.awt.*;
import javax.swing.*;

public class Graph extends JPanel {

    public void paintComponent (Graphics g){
        double a = -2 * Math.PI;
        double b =  2 * Math.PI;
        double distance = Math.abs(a) + Math.abs(b);
        double h = Math.PI / 20;
        int nPoints = (int) ( Math.round(distance / h));
        double[] x = new double[nPoints];
        double[] y = new double[x.length];
        double[] z = new double[x.length];
        int []  xCoordinate = new int[x.length];
        int []  yCoordinate = new int[x.length];
        int []  zCoordinate = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = (a + h * i);
            y[i] = ((Math.pow(x[i], 3) - 2) / 15);
            z[i] = (5 * Math.cos(x[i]));
            x[i] = (-x[i] * 22) + 400;
            y[i] = (y[i] * 22) + 403;
            z[i] = (z[i] * 22) + 403;
            xCoordinate[i] = (int)(Math.round(x[i]));
            yCoordinate[i] = (int)(Math.round(y[i]));
            zCoordinate[i] = (int)(Math.round(z[i]));
        }

        this.setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawString("Задача 3", 30, 30);
        g.drawLine(30, 400, 770, 400);
        g.drawLine(400, 30, 400, 770);
        g.drawString("Y", 385, 37);
        g.drawString("X", 760, 415);
        g.setColor(Color.CYAN);
        g.drawPolyline(xCoordinate, yCoordinate, nPoints);
        g.setColor(Color.RED);
        g.drawPolyline(xCoordinate, zCoordinate, nPoints);
    }
}