package Cop26_ClassNangCao_Constructor_ThamSoPhuongThuc;
public class ThamBien{
    int x[];
    void Tinh(int []x){
        for(int i=0;i<x.length;i++){
            x[0]=x[0]+5;
            System.out.println("Tổng: "+x[0]);
        }                
    }
    public static void main(String[] args) {
         ThamBien tb = new ThamBien();
         tb.Tinh(new int[]{3});
    }
}