import java.util.Iterator;
import java.util.LinkedList;

public class no4 {

    public static void uts_no4(){
        Mahasiswa Usep = new Mahasiswa("Usep", "Tadika Mesra", 6666,11);
        Mahasiswa tatang = new Mahasiswa("tatang", "Informatika", 6969, 12);
        Mahasiswa jangkrik = new Mahasiswa("jangkrik", "Multimedia", 100, 1);
        Mahasiswa asep = new Mahasiswa("asep", "Seni Rupa", 100, 30);
        Mahasiswa kardun = new Mahasiswa("Kardun","Suling Bambu", 555, 22);

        LinkedList<Mahasiswa> list = new LinkedList<>();
        list.addFirst(Usep);
        list.addFirst(tatang);
        list.addFirst(jangkrik);
        list.addFirst(asep);
        list.addFirst(kardun);

        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.print("<=>");
        }

        System.out.println("null");

        list.addLast(kardun);
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.removeLast();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        //for(Mahasiswa mahasiswa: list) {
        //System.out.println(employee);
        // }
    }


}
