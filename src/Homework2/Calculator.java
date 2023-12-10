package Homework2;

public class Calculator {

    public static int Tong2SoNguyen(int number1, int number2){
        return number1 + number2;
    }

    public static float Tong2SoThuc(float number1, float number2){
        return number1 + number2;
    }


    public static void main(String[] args) {

        System.out.println("Tổng 2 số nguyên là: " + Tong2SoNguyen(10,21));
        System.out.println("Tổng 2 số thuc là: "+ Tong2SoThuc(3.5F, 4.5F));

    }
}
