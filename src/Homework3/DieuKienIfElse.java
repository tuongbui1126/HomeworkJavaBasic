package Homework3;

public class DieuKienIfElse {
    public static void GiaTri(int n) {

        int number = 100;

        if (n == number){
            System.out.println("Thỏa điều kiện 1");
        } else if (n < number) {
            System.out.println("Thỏa điều kiện 2");
        } else if (n > number){
            System.out.println("Thỏa điều kiện 3");
        } else {
            System.out.println("Không thỏa điều kiện nào cả");
        }

    }
    public static void main(String[] args) {

        int n = 50;
        GiaTri(n);

        int n1 = 200;
        GiaTri(n1);

        int n3 = 100;
        GiaTri(n3);
    }

}


