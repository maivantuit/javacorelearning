/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop23_String;

/**
 *
 * @author CỌP
 */
public class StringAPI {

    public static void main(String[] args) {
        String name = "Mai Văn Tú";
        //lấy chuổi con, subtring();
        String first = name.substring(0, 3);
        System.out.println("substring: " + first);//subtring: Mai
        //đổi in thường,toLowerCase();
        String lc = name.toLowerCase();
        System.out.println("toLowerCase: " + lc);//toLowerCase: mai văn tú
        //đổi in hoa.toUpperCase();
        String up = name.toUpperCase();
        System.out.println("toUpperCase: " + up);//toUpperCase: MAI VĂN TÚ
        //cắt các ký tự trắng 2 đầu chuỗi,trim()
        String trim = name.trim();
        System.out.println("Trim: " + trim);//kq:Trim: Mai Văn Tú, không thay đổi
        //lấy độ dài chuỗi,length()
        int x = 0;
        for (int i = 0; i <= name.length(); i++) {
            x = i;
        }
        System.out.println("Length: " + x);//Length: 10
        //lấy độ dài chuỗi 2,kiểu trả về int,length()
        int leg = name.length();
        System.out.println("Length2: " + leg);//Length2: 10
        //lấy chuỗi con,xóa 3 số kí tự đầu,substring();
        String subtr = name.substring(3);
        System.out.println("SubTring: " + subtr);//SubTring: Văn Tú
        //lấy kí tử, kiểu trả về char, get char index= 0,,charAt(index);
        char ca = name.charAt(0);
        System.out.println("CharAt: " + ca);//CharAt: M
        //tìm kiếm và thay thế tất cả,thay thế Chữ Mai thành chữ Cọp,replaceAll(find,replace)
        String rep = name.replaceAll("Mai", "CỌp");
        System.out.println("replaceAll: " + rep);//replaceAll: Cọp Văn Tú
        //tách chuỗi thành mảng, split(separator); separator:tách        
        String[] split = name.split("Tú");
        System.out.println("split: " + split);//kq= 15db9742s
        //QUAN TRỌNG: so sánh bằng có phân biệt hoa/thường,equals(),
        boolean eq = name.equals("Mai Văn Tú");
        System.out.println("equals: " + eq);//equals: true
        //QUAN TRỌNG:so sánh bằng k phân biệt hoa/ thường,
        boolean qc = name.equalsIgnoreCase("mai văn tú");
        System.out.println("equalslgnoreCase: " + qc);//equalslgnoreCase: true
        //kiểm tra có chứa hay không,contains();
        boolean ct = name.contains("Mai");
        System.out.println("contains: " + ct);//contains: true
        //kiểm tra có bắt đầu bởi hay không,startWith()
        boolean sw = name.startsWith("M");
        System.out.println("startWith: " + sw);//startWith: true
        //kiểm tra có kết thúc bởi hay không,endsWith();
        boolean ew = name.endsWith("ú");
        System.out.println("endsWith: " + ew);//endsWith: true
        //so khớp với hay không ?        
        boolean mc = name.matches("Mai Văn Tú");
        System.out.println("matches: " + mc);//matches: true
        //tìm vị trí xuất hiện đầu tiên của chuỗi con,indexOf()
        int io = name.indexOf("V");
        System.out.println("indexOf: " + io);// indexOf: 4
        //tìm vị trí xuất hiện cuối cùng của chuỗi con
        int il = name.lastIndexOf("ú");
        System.out.println("lastindexOf: " + il);//lastindexOf:9

    }
}
