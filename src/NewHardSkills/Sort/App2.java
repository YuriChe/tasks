/*
package NewHardSkills.hw3;

import java.util.*;


public class App2 {
    public static void main(String[] args) {

        CreateArray createArray = new CreateArray();

int[] stackBase = {1, 2, 3, 4, 5};
        Stack<Integer> stack1 = new Stack<>();
        for (int i = 1; i < 6; i++) {
            stack1.push(i);
        }
        while (!stack1.empty()) {
            System.out.print(stack1.pop() + "\t");
        }



        String[] str = {"apple", "banana", "pear", "cherry", "pineapple", "raspberry", "grape", "kiwi", "lemon"};
        Queue<String> fruits = new LinkedList<>();
        fruits.element()
        for (int i = 0; i < 9; i++) {
            fruits.offer(str[i]);
        }
        Queue<String> fruits2 = new LinkedList<>();
        String vowelStr = "eyuioa";
        char[] charAr;
        int count;
        for (String strCh :
                fruits) {
            charAr = strCh.toCharArray();
            count = 0;
            for (char ch :
                    charAr) {
                if (vowelStr.indexOf(ch) != -1) {
                    count++;
                }
            }
            if (count > 2) {
                fruits2.offer(strCh);
            }
        }

        for (String str1 :
                fruits2) {
            System.out.println(str1);
        }
for (int i = 0; i < 8; i++) {
            try {
                if (!fruits.offer(str[i])) {
                    throw new RuntimeException();

                }
                fruits.offer(str[++i]);
                fruits.offer(str[++i]);
                int count = 0;
                while (count < 10) {
                    count++;
                    System.out.print(fruits.poll() + "\t");
                    System.out.println(fruits.size() + " " + count);
                }

            } catch (NoSuchElementException e) {
                e.printStackTrace();
                e.printStackTrace();
                e.toString();




                System.out.print("Элементы закончились " + Arrays.toString(e.getStackTrace()));
                System.out.println();
            } catch (RuntimeException e) {
                System.out.println(e.fillInStackTrace() + "Ошибка очереди");
            } finally {

            }

        Stack<Integer> randomNum = new Stack<>();
        for (int i = 0; i < 9; i++) {
            randomNum.push(i * 2);

        }
        while (!randomNum.empty()) {
//
            System.out.println(randomNum.pop());
            randomNum.pop();
        }


    }
}
*/
