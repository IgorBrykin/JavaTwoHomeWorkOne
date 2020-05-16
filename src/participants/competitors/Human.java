package participants.competitors;

public class Human implements Skills {
    private String type;
    private String name;

    private int maxRunDistance;
    private double maxJumpHeight;

    private boolean onDistance;

    public Human(String type, String name, int maxRunDistance, double maxJumpHeight) {
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
        System.out.println(type + " " + name + " " +
                (onDistance ? " на дистанции" : " выбыл из соревнований"));
    }

    @Override
    public String toString() {
        return "Human{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", maxRunDistance=" + maxRunDistance +
                ", maxJumpHeight=" + maxJumpHeight +
                ", onDistance=" + onDistance +
                '}';
    }
}
