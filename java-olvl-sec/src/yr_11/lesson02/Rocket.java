package yr_11.lesson02;

public class Rocket {
    // ---- Data ----------------------------------
    double gas;

    int occupancy;

    String stage;

    double miles;

    String[] colours;

    double currentSpeed;

    int numberOfWindows;

    // ---- Actions -------------------------------
    public void accelerate() {
        currentSpeed = currentSpeed + 1;
    }

    public void decelerate() {
        currentSpeed = currentSpeed - 1;
    }

    public void launch() {
        stage = "LIFT-OFF";
    }
}
