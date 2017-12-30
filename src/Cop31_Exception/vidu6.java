package Cop31_Exception;


public class vidu6 {

    static void demoProC() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Bên trong xữ lý ngoại lệ demoPro");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoProC();// gọi lại hàm demoProC vì static
        } catch (Exception e) {
            System.out.println("Trong main, tiếp tục xữ lý ngoại lệ");
        }
    }
}
