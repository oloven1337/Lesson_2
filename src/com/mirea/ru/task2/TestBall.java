package com.mirea.ru.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(150,150);
        System.out.println(ball);
        ball.move(25,40);
        System.out.println(ball);
    }
}
