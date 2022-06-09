import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GenericTutorial {

    public static void main(String[] args) {
        List<Integer> intList = new LinkedList<Integer>();
        intList.add(0);
        Integer x = (Integer) intList.iterator().next();

        printCollectionOldJava(intList);
    }

    public static void printCollectionOldJava(Collection c){
        Iterator i = c.iterator();
        for (int j = 0; j < c.size(); j++) {
            System.out.println(i.next());
        }
    }

    public static void printCollection(Collection<?> c) {
        for (Object o : c) {
            System.out.println(o);
        }
    }

    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o); // Correct
        }
    }
}
