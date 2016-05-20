package org.javacourse.part3;

public class Robocode {

    public class Robot {

        Direction direction;

        public Direction getDirection() {
            // текущее направление взгляда
            return direction;
        }

        public int getX() {
            // текущая координата X
            return 1;
        }

        public int getY() {
            // текущая координата Y
            return 1;
        }

        public void turnLeft() {
            // повернуться на 90 градусов против часовой стрелки
        }

        public void turnRight() {
            // повернуться на 90 градусов по часовой стрелке
        }

        public void stepForward() {
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            lookForLeft(robot);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (robot.getX() < toX) {
            lookForRight(robot);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() > toY) {
            lookForDown(robot);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (robot.getY() < toY) {
            lookForUp(robot);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    public static void lookForLeft(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                break;
            case LEFT:
                break;
            case DOWN:
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
                robot.turnLeft();
                break;
        }
    }

    public static void lookForUp(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                break;
            case LEFT:
                robot.turnRight();
                break;
            case DOWN:
                robot.turnRight();
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
                break;
        }
    }
    public static void lookForRight(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnRight();
                break;
            case LEFT:
                robot.turnRight();
                robot.turnRight();
                break;
            case DOWN:
                robot.turnLeft();
                break;
            case RIGHT:
                break;
        }
    }
    public static void lookForDown(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnLeft();
                break;
            case DOWN:
                break;
            case RIGHT:
                robot.turnRight();
                break;
        }
    }


}
