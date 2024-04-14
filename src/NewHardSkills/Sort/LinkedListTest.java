package NewHardSkills.Sort;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        LinkedList<Integer> listFr = new LinkedList<>();

        int ran;
        for (int i = 0; i < x; i++) {
            ran = (int) (Math.random() * 89 + 10);
            listFr.add(ran);
        }
        /*LinkedList<Integer> listFr2 = new LinkedList<>(listFr);
        for (Integer x1 :
                listFr2) {
            if (x1 < 20) {
                listFr2.remove(x1);
            }
        for (Integer x2 :
                listFr2) {
            System.out.print(x2 + " ");
        }*/
        LinkedList<Integer> listFr2 = new LinkedList<>();
        for (Integer x1 :
                listFr) {
            if (x1 % 3 == 0 || x1 % 5 == 0) {
                listFr2.add(x1);
            }
            for (Integer x2 :
                    listFr2) {
                System.out.print(x2 + " ");
            }
            System.out.println();
        }
    }
}
