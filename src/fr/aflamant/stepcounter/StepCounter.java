package fr.aflamant.stepcounter;

import pl.luwi.series.reducer.Point;

import java.util.ArrayList;
import java.util.List;


public class StepCounter {

    public static int count(List<Point> dataset) {


        List<Point> peaks = new ArrayList<Point> ();

        for (int i = 1; i<(dataset.size()-1); i++) {
            if (dataset.get(i).getY() > dataset.get(i-1).getY() && dataset.get(i).getY() > dataset.get(i+1).getY()  && dataset.get(i).getY() > 10 ) {
                peaks.add(dataset.get(i));
            }
        }

        System.out.println(peaks);
        return peaks.size();
    }

}
