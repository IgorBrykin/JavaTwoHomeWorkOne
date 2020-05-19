package participants.obstacles;

import participants.competitors.Skills;

public class Wall extends Obstacle {
    private double height;

    public Wall(double height) {
        this.height = height;
    }


    @Override
    public void goGo(Skills competitor) {
        competitor.jump(height);
    }
}
