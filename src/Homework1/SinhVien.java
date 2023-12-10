package Homework1;

public class SinhVien {

    public void Country(){
        String n = "Việt Nam";
        System.out.println("Country = " + n);
    }
    public String name = "Bùi Khánh Tường";
    public static int age = 23;
    public static int district = 3;
    public static String note = "VIP";



    public static void main(String[] args) {

        SinhVien SVcountry = new SinhVien();
        SVcountry.Country();

        SinhVien SVname = new SinhVien();
        System.out.println("Tên: " + SVname.name);

        System.out.println(age);
    }
}
