/*
        Products            Updates                 Number of Products updated      Execution time
        ------------------------------------------------------------------------------------------
        data1000.txt        update1000.txt          112                             ?
        data1000.txt        update1000000.txt       998                             ?
        data1000000.txt     update1000.txt          554                             ?
        data1000000.txt     update1000000.txt       ?                               ?
 */

package lab10_3;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage("data/data1000000.txt");

//        System.out.println("---------------");
//        System.out.println(" Before update ");
//        System.out.println("---------------");
//        storage.printProducts();

        storage.update("data/update1000000.txt");

//        System.out.println("---------------");
//        System.out.println("  After update ");
//        System.out.println("---------------\n");
//        storage.printProducts();
    }
}
