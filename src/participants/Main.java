package participants;

import participants.competitors.Cat;
import participants.competitors.Droid;
import participants.competitors.Human;
import participants.competitors.Skills;
import participants.obstacles.Obstacle;
import participants.obstacles.Treadmill;
import participants.obstacles.Wall;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> competitors = new ArrayList<Object>(15);
        competitors.add(new Cat("Кот", "Василий", 1000,2));
        competitors.add(new Cat("Кот", "Семен", 500,1));
        competitors.add(new Cat("Кот", "Петя", 1500,2));
        competitors.add(new Cat("Кот", "Сеня", 1000,2));
        competitors.add(new Cat("Кот", "Инакентий", 1000,2));
        competitors.add(new Human("Человек", "Игорь", 9000,1.5));
        competitors.add(new Human("Человек", "Андрей", 10000,3));
        competitors.add(new Human("Человек", "Евгений", 8000, 5));
        competitors.add(new Human("Человек", "Илья", 1000,2));
        competitors.add(new Human("Человек", "Вадим", 7000,2));
        competitors.add(new Droid("Робот" , "Джо", 12000, 6));
        competitors.add(new Droid("Робот" , "Джей", 12000, 6));
        competitors.add(new Droid("Робот" , "Кей", 12000, 6));
        competitors.add(new Droid("Робот" , "Си", 22000, 12));
        competitors.add(new Droid("Робот" , "Ди", 13000, 7));

        ArrayList<Obstacle> obstacles = new ArrayList<Obstacle>();
        obstacles.add(new Treadmill(1000));
        obstacles.add(new Wall(1.5));
        System.out.println("Участники! Готовы: ");
        remainingCompetitors(competitors);

        System.out.println("Уровень 1");
        goGo(competitors, obstacles);
        removeCouldNot(competitors);
        System.out.println("Остались участники:");
        remainingCompetitors(competitors);
        System.out.println("-------------");

        System.out.println("Уровень 2");
        ArrayList<Obstacle> obstacles2 = new ArrayList<Obstacle>();
        obstacles2.add(new Treadmill(5000));
        obstacles2.add(new Wall(1.5));
        goGo(competitors, obstacles2);
        removeCouldNot(competitors);
        System.out.println("Остались участники:");
        remainingCompetitors(competitors);
        System.out.println("-------------");

        System.out.println("Уровень 3");
        ArrayList<Obstacle> obstacles3 = new ArrayList<Obstacle>();
        obstacles3.add(new Treadmill(10000));
        obstacles3.add(new Wall(5.0));
        goGo(competitors, obstacles3);
        removeCouldNot(competitors);
        System.out.println("Остались участники:");
        remainingCompetitors(competitors);
        System.out.println("-------------");


    }

    private static void remainingCompetitors(ArrayList<Object> competitors) {
        for (Object competitor : competitors) {
            System.out.println(competitor);
        }
    }

    private static void removeCouldNot(ArrayList<Object> competitors) {
//        private static void removeCouldNot(ArrayList<Object> competitors) {
//            for (Object competitor : competitors) {
//                if (!((Skills) competitor).isOnDistance()){
//                    competitors.remove(competitor);
//                }
//            }
//        }
        competitors.removeIf(competitor -> !((Skills) competitor).isOnDistance());
    }

    private static void goGo(ArrayList<Object> competitors, ArrayList<Obstacle> obstacles) {
        for (Object competitor : competitors) {
            for (Obstacle obstacle : obstacles) {
                obstacle.goGo((Skills) competitor);
                if (!((Skills) competitor).isOnDistance()) {
//                    competitors.remove(competitor);
                    break;
                }
            }

        }
    }
}
