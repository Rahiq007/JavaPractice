//Author: Rahiq Majeed
//Level: Medium
//Abstract: Group Anagram (Given an array of strings, group the anagrams together. You can return the answer in any order)
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//Difficulty: Medium
import java.util.*;
import java.util.ArrayList;

public class GroupAnagram {
    public static void main(String[] args) {

        int input;

        Scanner scanner =  new Scanner(System.in);
         System.out.print("How many inputs in arraylist? ");
        input = scanner.nextInt();

        String [] InputString = new String[input];

        for (int i = 0; i <input ; i++) {
//            System.out.println("Enter string " + (i+1) + ": ");
            InputString[i] = scanner.next();
        }

     ArrayList<ArrayList<String>> arrayList = new ArrayList<>();

        boolean [] flag = new boolean[InputString.length];

        for (int i = 0; i <InputString.length ; i++) {
            if (flag[i]) {
                continue;
            }

            ArrayList<String> arrayList1 = new ArrayList<>();
            arrayList1.add(InputString[i]);
            flag[i] = true;

            for (int j = i + 1; j <InputString.length ; j++) {

                char [] chars = InputString[i].toCharArray();
                char [] chars1 = InputString[j].toCharArray();

                Arrays.sort(chars);
                Arrays.sort(chars1);

                if (!flag[j] && Arrays.equals(chars, chars1)) {
                    arrayList1.add(InputString[j]);
                    flag[j] = true;
                }
            }

            arrayList.add(arrayList1);
        }

        arrayList.sort(Comparator.comparingInt(ArrayList::size));

            System.out.println(arrayList);

        }
     //   System.out.println(arrayList);
    }
