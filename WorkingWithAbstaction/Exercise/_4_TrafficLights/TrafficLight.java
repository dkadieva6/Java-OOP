package OOP.WorkingWithAbstaction.Exercise._4_TrafficLights;

public enum TrafficLight {
    RED,
    GREEN,
    YELLOW;

    public TrafficLight next() {
        return values()[(this.ordinal() + 1) % values().length];
    }
}
