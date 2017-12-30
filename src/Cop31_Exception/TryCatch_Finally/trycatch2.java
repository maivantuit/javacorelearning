package Cop31_Exception.TryCatch_Finally;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class trycatch2 {

    public static void main(String[] args) {
        try {
            Thread.sleep(1000);// khi ta sử dụng Thread  nó sẽ báo lỗi(sữa lỗi :chọn try catch hoặc Throw)
            //dừng 1 s.(milisecond 1s =1000), khi sử dụng Thread thì có thể sinh ra lỗi InterruptedException dưới này
            File file = new File("test.txt");
            file.createNewFile();// khi ta sử dụng .createNewFile nó sẽ báo lỗi dưới là IOException(sữa lỗi :chọn try catch hoặc Throw)
        } catch (InterruptedException ex) {
            Logger.getLogger(trycatch2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException e) {

        } catch (IOException e) { // IOException là cha của FileNotFoundException, nên khi đặt FileNotFoundException dưới thì báo lỗi, đặt con trên cha.

        } catch (Exception e) {
            // write log
            //show dialog : show hộp thoại
            // print cm
        }
    }
}
//catch exception
// trong java thì Exception có rất nhiều loại, để lập trình an toàn thì nếu các bạn ghi ngờ đoạn lệnh có thể sinh ra lỗi thì các bạn nên đặt (Exception e) cha, ngoài ra để phân biệt các Exception khác nhau thì đọc cái loại Exception khác nhau, nhưng quanh đi quẩn lại thì có các mình vừa làm ở 2 ví dụ trên.
// phần này quan trọng, (try catch) khi đi làm, cũng như override, overload, Thread.

