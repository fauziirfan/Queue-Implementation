import java.util.*;
public class QueueImplementation {
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();

        //Masukan nama dalam antrian

        antrian.add("Irfan");
        antrian.add("Fauzi");

        System.out.println("Antrian: "+antrian);

        //Tambahkan nama dalam antrian

        antrian.add("Bro");
        antrian.add("Buffon");

        System.out.println("Antrian setelah ditambah: "+antrian);

        //Menghapus antrian paling depan

        antrian.poll();

        System.out.println("Antrian setelah dihapus :"+antrian);

        //Melihat data paling depan

        System.out.println("Antrian paling depan: "+antrian.peek());

        //Melihat jumlah atau size

        System.out.println("Jumlah antrian: "+antrian.size());

        System.out.println("Antrian: "+antrian);

        //Menghapus seluruh antrian

        antrian.clear();

        System.out.println("Antrian: "+antrian);

    }
}
