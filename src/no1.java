public class no1 {
    public static void uts_no1(){
        int random_array[] = {61,6,8,9,23,17,2,8,5,29,87,96,45,88,65};
        for(int i = 0; i < random_array.length; i++) {
            if(random_array[i] % 2 == 0) {
                System.out.println(random_array[i] + " --> Bilangan Genap");
            }else{
                System.out.println(random_array[i] + " --> Bilangan Ganjil");
            }
        }
        return;
    }
}
