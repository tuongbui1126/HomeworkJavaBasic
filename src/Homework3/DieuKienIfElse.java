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

        DieuKienIfElse.GiaTri(50);

        DieuKienIfElse.GiaTri(200);

        DieuKienIfElse.GiaTri(100);
    }

}


