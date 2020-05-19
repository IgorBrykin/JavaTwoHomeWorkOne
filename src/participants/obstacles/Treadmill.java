package participants.obstacles;

import participants.competitors.Skills;

public class Treadmill extends Obstacle{
    private int dist;

    public Treadmill(int dist) {
        this.dist = dist;
    }

    @Override
    public void goGo(Skills competitor) {
        competitor.run(dist);
    }
}
