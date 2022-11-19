import java.util.ArrayList;
import java.util.List;

public class no3 {
  public static void uts_no3(){


      List<Mahasiswa> MahasiswaList = new ArrayList<>();
      MahasiswaList.add(new Mahasiswa ("Usep","Tadika Mesra", 6666, 11));
      MahasiswaList.add(new Mahasiswa ("tatang", "Informatika", 6969, 12));
      MahasiswaList.add(new Mahasiswa ("jangkrik", "Multimedia", 999, 1));
      MahasiswaList.add(new Mahasiswa ("asep", "Seni Rupa", 100, 30));
      MahasiswaList.add(new Mahasiswa ("kardun", "Suling Bambu", 555, 22));

      //MahasiswaList.forEach(Mahasiswa -> System.out.println(mahasiswa));
      //
      //System.out.println(MahasiswaList.get(1));
      //
      //System.out.println(MahasiswaList.isEmpty());

      MahasiswaList.remove(0);
      MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa));
      System.out.println("banyak data = " + MahasiswaList.size());


  }

}
