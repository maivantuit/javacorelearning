package Cop35_toString;


import java.util.Scanner;

public class Example4{
    private int sodc;
    private String tendc;// 44 Nguyen Thanh Binh
    // Alt + Insert.
    public Example4() {
    }

    public Example4(int sodc, String tendc) {
        this.sodc = sodc;
        this.tendc = tendc;
    }

    public int getSodc() {
        return sodc;
    }

    public String getTendc() {
        return tendc;
    }

    public void setSodc(int sodc) {
        this.sodc = sodc;
    }

    public void setTendc(String tendc) {
        this.tendc = tendc;
    }
    public String toString(){
        return sodc+" "+tendc+" ";
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số địa chỉ: ");
//        sodc = sc.nextInt();
        sodc= Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên địa chỉ: ");
//        tendc =sc.nextLine();// xu ly enter.
        tendc= sc.nextLine();
        
    }
    public static void main(String[] args) {// psvm + table nhe
        Example4 e = new Example4();
        e.nhap();
        System.out.println(e.toString());        
    }
    // Shift + F6
}