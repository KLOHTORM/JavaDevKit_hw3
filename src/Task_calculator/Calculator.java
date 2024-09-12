package Task_calculator;

public class Calculator {
    public static <T extends Number> Number sum(T firstNum, T secondNum) {
        return firstNum.doubleValue() + secondNum.doubleValue();
    }


    public static <T extends Number> Number multiply(T firstNum, T secondNum) {
        return firstNum.doubleValue() * secondNum.doubleValue();

    }

    public static <T extends Number> Number devide(T firstNum, T secondNum) {
        return firstNum.doubleValue() / secondNum.doubleValue();

    }

    public static <T extends Number> Number substract(T firstNum, T secondNum) {
        return firstNum.doubleValue() - secondNum.doubleValue();

    }

    public static void main(String[] args) {
        System.out.println("Calculator.sum(9.1, 3.6) = " + Calculator.sum(9.1, 3.6));
        System.out.println("Calculator.multiply(32, 8) = " + Calculator.multiply(32, 8));
        System.out.println("Calculator.devide(3.4, 4) = " + Calculator.devide(3.4, 4));
        System.out.println("Calculator.substract(2, 100) = " + Calculator.substract(2, 100));
    }
}

/*
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
над которыми должна быть произведена операция. Методы должны возвращать результат своей
работы.
 */