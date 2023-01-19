package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        String quadrant;
        if (x < 0) {
            if (y < 0) {
                quadrant = "third";
            } else {
                quadrant = "second";
            }
        } else if (x > 0) {
            if (y < 0) {
                quadrant = "fourth";
            } else {
                quadrant = "first";
            }
        } else {
            quadrant = "zero";
        }
        System.out.println(quadrant);
    }
}
