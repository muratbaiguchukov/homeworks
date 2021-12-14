package com.company.task4;
//Создайте класс Круг с константной переменной ПИ – 3,14 и обычную переменную Радиус.
// Используйте константную переменную ПИ в не статичном методе, который вычисляет
// площадь круга по формуле Площадь = Пи * Радиус*Радиус. Также создайте статичный метод,
// который принимает в качестве параметра значение Радиуса и вычисляет площадь по формуле Площадь = 2 * ПИ * Радиус.
 //Продемонстрируйте работу обоих методов с выводом на консоль значение Площади
public class Circle {
    public final static double PI = 3.14;
    public double Radius;

    public double mult(double PI, double Radius){
        return PI * Radius * Radius;
    }

    public static double sum(double PI, double Radius){
        return 2 * PI * Radius;
    }
}
