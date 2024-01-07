package Homework3;

public class ToanTu {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        boolean checkValue1 = (a < b) && (b < c);
        boolean checkValue2 = (a > c) || (a < b);
        boolean checkValue3 = (a > b) || (b > c);

        System.out.println(checkValue1);
        System.out.println(checkValue2);
        System.out.println(checkValue3);

        String expectedText = "Google Drive";
        String actualText = "Good Docs";

        String expectedButton = "Click";
        String actualButton = "Click";
        System.out.println(expectedText == actualText);
        System.out.println((expectedButton == actualButton) || (expectedText == actualText));

    }
}
