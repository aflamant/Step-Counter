package fr.aflamant.stepcountertest;

import fr.aflamant.stepcounter.CSVTools;
import fr.aflamant.stepcounter.StepCounter;
import pl.luwi.series.reducer.Point;
import pl.luwi.series.reducer.SeriesReducer;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;



public class Test {

    public static void main(String[] args) throws Exception {

        String input = "/home/aflamant/TC/PIR/code/step_counter/my_sample_data.csv";

        String output = "/home/aflamant/TC/PIR/code/step_counter/output.csv";
        FileWriter writer = new FileWriter(output);

        List<Point> points = CSVTools.parseCSV(input);

        List<Point> reduced = SeriesReducer.reduce(points, 2);

        // System.out.println(points);
        for (Point p : reduced ) {
            CSVTools.writeLine(writer, Arrays.asList(""+p.getX(),""+p.getY()));
        }

        System.out.println("Nombre de pas : " + StepCounter.count(reduced));
        writer.flush();
        writer.close();
    }
}