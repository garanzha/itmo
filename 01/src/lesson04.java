package com.itmo;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by User on 06.11.2016.
 */
public class lesson04{

    public static class Circle{
        private double x;
        private double y;
        private double R;

        /*1) Создайте в классе Circle метод, вычисляющий длину окружности.*/
        private void lengthOfCircle() {
            System.out.println("Длина окружности "+this.toString()+": "+ (2 * Math.PI * this.R));
        }

        /*2) Создайте в классе Circle метод, перемещающий центр круга в случайную точку квадрата координатной плоскости
        с диагональю от [-99;-99] до [99;99]. Обратите внимание на то, что требуется создать обычный метод, применимый
        к уже существующему объекту, а не конструктор создающий новый объект.*/
        private void moveCentre() {
            System.out.print("Центр окружности"+this.toString()+" передвинут из точки "+this.getCenterOfCircle()+" в точку ");
            this.x = (Math.random() * 198.0) - 99.0;
            this.y = (Math.random() * 198.0) - 99.0;
            System.out.println(this.getCenterOfCircle()+".");
        }

        /*3) Измените в классе Circle конструктор по умолчанию так, чтобы в момент создания объекта с его помощью,
        координаты центра и радиус окружности пользователь вводил с клавиатуры.*/
        private Circle() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите координату X центра окружности: ");
            this.x = scanner.nextDouble();
            System.out.print("Введите координату Y центра окружности: ");
            this.y = scanner.nextDouble();
            System.out.print("Введите радиус R окружности: ");
            this.R = scanner.nextDouble();
            System.out.println("Создана ноавая окружность "+this.toString()+" с параметрами: x="+this.x+"; y="+this.y+"; R="+this.R);
        }

        /*4) Создайте в классе Circle метод, вычисляющий расстояние между центрами двух окружностей.*/
        private double distanceBtwCircles(Circle c2) {
            return Math.sqrt(Math.pow(this.x - c2.x, 2) + Math.pow(this.y - c2.y, 2));
        }

        /*5) Создайте в классе Circle метод, проверяющий, касаются ли окружности в одной точке. Учтите, что возможен
        вариант, когда одна окружность содержится внутри другой и при этом всё равно возможно касание в одной точке.*/
        private void touchingCircle(Circle c2) {
            if (Math.abs(this.R - c2.R) == this.distanceBtwCircles(c2))
                System.out.println("Окружности касаются друг друга");
            else
                System.out.println("Окружности не касаются друг друга");
        }

        /*доп.метод, возвращающий центр окружности как пару координат*/
        private String getCenterOfCircle(){
            return "("+this.x+";"+this.y+")";
        }
    }

    public static void main(String[] args) {
        Circle circle01=new Circle();       //!!выполнение задачи 3
        circle01.lengthOfCircle();          //!!выполнение задачи 1
        circle01.moveCentre();              //!!выполнение задачи 2
        Circle circle02=new Circle();
        System.out.println("Расстояние между двумя окружностями равно: "+circle01.distanceBtwCircles(circle02)); //выполнение задачи 4
        circle01.touchingCircle(circle02); //выполнение задачи 5
    }
}