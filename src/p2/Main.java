package p2;

/*
 * Created by emailman on 3/1/2016
 * Create a custom exception handler
 */

public class Main {
    public static void main(String[] args) {
        Balloon b1 = buildBalloon(-10, "yellow");

        Balloon b2 = buildBalloon(10, "yellow");

        Balloon b3 = buildBalloon(-8, "yellow");

        Balloon b4 = buildBalloon(8, "yellow");
    }

    static Balloon buildBalloon(double arg1, String arg2) {
        try {
            Balloon b = new Balloon(arg1, arg2);
            System.out.println(b);
            return b;
        } catch (InvalidDiameterException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println
                    ("number of balloons = " + Balloon.getNumberOfBalloons());
        }
        return null;
    }
}

class Balloon {

    private double diameter;
    private String color;
    private static int numberOfBalloons = 0;

    public Balloon(double arg1, String arg2) throws InvalidDiameterException {
        if (arg1 > 0)
            diameter = arg1;
        else
            throw new InvalidDiameterException(arg1);

        color = arg2;
        numberOfBalloons++;
    }

    public static int getNumberOfBalloons() {
        return numberOfBalloons;
    }

    @Override
    public String toString() {
        return "Balloon{" +
                "diameter=" + diameter +
                ", color='" + color + '\'' +
                '}';
    }
}

// Define a custom exception
class InvalidDiameterException extends Exception {
    // Construct the exception
    public InvalidDiameterException(double e) {
        super("Invalid diameter: " + e);
    }
}
