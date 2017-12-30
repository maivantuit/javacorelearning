package Cop42_TongHopArrayArrayListVectorHasMap;
import java.util.*;

public class HashMapClass {
   public static void main(String args[]) {
  
      // Tao mot hash map
      HashMap h = new HashMap();
      // Dat cac phan tu vao map
      h.put("Zara", new Double(3434.34));
      h.put("Mahnaz", new Double(123.22));
      h.put("Ayan", new Double(1378.00));
      h.put("Daisy", new Double(99.22));
      h.put("Qadir", new Double(-19.08));
      
      // Lay mot tap hop cac entry
      Set set = h.entrySet();
      // Lay mot iterator
      Iterator i = set.iterator();
      // Hien thi cac phan tu
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println(h.toString());
      // Gui 1000 vao trong tai khoan cua Zara
      double balance = ((Double)h.get("Zara")).doubleValue();
      h.put("Zara", new Double(balance + 1000));
      System.out.println("Balance hien tai cua Zara la: " +
      h.get("Zara"));
   }
}
// trong hashmap duyet mang k phải la for và foreach. mà là iterator
