package participants.competitors;

public class Droid implements Skills {

    private String type;
    private String name;

    private int maxRunDistance;
    private double maxJumpHeight;

    private boolean onDistance;

    public Droid(String type, String name, int maxRunDistance, double maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }


    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " успешно пробежал " + dist + " метров");
        } else {
            System.out.println(type + " " + name + " не смог пробежать " + dist + " метров");
            onDistance = false;
        }
    }


    @Override
    public void jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " успешно перепрыгнул " + height + " метров");
        } else {
            System.out.println(type + " " + name + " не может " + height + " метров прыгнуть");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {

    }

    @Override
    public String toString() {
        return "Droid{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", maxRunDistance=" + maxRunDistance +
                ", maxJumpHeight=" + maxJumpHeight +
                ", onDistance=" + onDistance +
                '}';
    }
}


