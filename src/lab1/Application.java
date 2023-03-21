package lab1;

import java.util.Arrays;
import javax.swing.*;

public class Application{
    public static void main(String[] args) {
        Results results = new Results();

        double[] o1 = {12, 34, 61, 45, 11};
        double o2 = 34;

        System.out.println("Задача 2");
        double[] res1 = results.div(o1,o2);
        System.out.println("1) Результат деления о1 на о2: " + Arrays.toString(res1));

        double[] res2 = results.mul(o1, res1);
        System.out.println("2) Результат умножения о1 на предыдущий результат: " + Arrays.toString(res2));
        double[] res3 = results.add(res2, o2);
        System.out.println("3) Результат сложения предыдущего результата с о2: " + Arrays.toString(res3));
        System.out.println("4) Результат возведения о1 в 3 степень: " + Arrays.toString(results.pow(o1)));

        JFrame frame = new JFrame("Задача 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Graph graph = new Graph();
        frame.add(graph);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }
}
