import java.util.ArrayList;
import java.util.Collection;

public class CommonCollectionMethods {
    public static void main(String[] args) {
        // all method of collection in java
         Collection<String> coll=new ArrayList<>();
         coll.add("sam");
         coll.add("sara");
         coll.add("mohamed");
         System.out.println(coll.remove("sara"));     // true
         System.out.println(coll);                       // [sam]
         System.out.println(coll.isEmpty());             // false
         System.out.println(coll.size());                // 1
         System.out.println(coll.contains("sam"));       // true
         System.out.println(coll.removeIf(s->s.startsWith("s"))); //true
         coll.forEach( name-> System.out.println(name));   // [mohamed]
         coll.clear();
         coll.forEach(System.out::println);  // nothing

    }
}
