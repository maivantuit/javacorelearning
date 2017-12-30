/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop24_Inherit.Homework3_SinhVienPol;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





import java.util.Scanner;

public class ChuongTrinhQuanLySinhVienPoly {
    private String tieude;
    private String[] mChon;
    private int cm;
    public ChuongTrinhQuanLySinhVienPoly(){}
    public ChuongTrinhQuanLySinhVienPoly(String tieude,String []mChon){
        this.tieude=tieude;
        this.mChon=mChon;
    }
//------------------------------------------------
    public  void display()throws Exception{
       System.out.println(tieude);
       for(int i=0;i<mChon.length;i++)
           System.out.println((i+1)+"."+mChon[i]);
       System.out.println("-----------------------------------------------------");   
    }
//-----------------------------------------------    
    public int getselected() throws Exception{
        display();
        Scanner sc=new Scanner(System.in);
        System.out.print("\nMời chọn: ");
        return cm=sc.nextInt();
    }
//-----------------------------------------------    
    public void execute(int cm) throws Exception{
        switch(cm){
            case 1:
                    
                    break;
            case 2: 
                    
                    break;
           
            case 3: System.exit(0);
                    break;
        }
    }
    public void run () throws Exception{
        while (true){
            int mc=getselected();
            execute(cm);
        }
    }
    
    //---------------------------------------------------    
    public static void main(String[] a) throws Exception{        
        String tieude = ("Chương trình quản lý ");
        String[] mChon = {"Nhập danh sách sinh viên","Xuất thông tin danh sách sinh viên","Xuất danh sách sinh iên có học lực giỏi","Sắp xếp danh sách sinh viên theo điểm","Kết Thúc"};
        System.out.println("-----------------------------------------------------");
        ChuongTrinhQuanLySinhVienPoly menu=new ChuongTrinhQuanLySinhVienPoly(tieude,mChon);
        menu.run();
}
}
