package com.itmo;

import java.util.*;
import java.io.*;

/**
 * Created by User on 20.11.2016.
 */
public class lesson10 {
    private static HashMap<String, Integer> map = new HashMap<String, Integer>();

    static class ValueComparator implements Comparator<String> {
        Map<String, Integer> base;

        public ValueComparator(Map<String, Integer> base) {
            this.base = base;
        }

        public int compare(String a, String b) {
            return (base.get(a) >= base.get(b)) ? -1 : 1;
        }
    }

    public static void main(String[] args) {
/*Проверка валидности скобок в выражении*/
        Scanner scanner = new Scanner(System.in);
        char[] cArray = scanner.nextLine().toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for (char c : cArray) {
            if ("([{<".contains(Character.toString(c)))
                stack.push(c);
            if (")]}>".contains(Character.toString(c))) {
                if ("([{<".indexOf(stack.peek()) == ")]}>".indexOf(c))
                    stack.pop();
                else
                    break;
            }
        }
        System.out.println("Скобки в выражении " + ((stack.isEmpty()) ? "валидны" : "НЕ валидны"));


/*топ100 слов в романе "Война и Мир"*/
        try {
            Scanner scannerF = new Scanner(new File("C:\\itmo\\wp.txt"));
            while (scannerF.hasNext()) {
                String s = scannerF.next();
                s = s.replace(".", "").replace(",", "").replace("!", "").replace("?", "");
                map.put(s, (map.containsKey(s)) ? (map.get(s) + 1) : 1);
            }
            scannerF.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        ValueComparator cmp = new ValueComparator(map);
        TreeMap<String, Integer> ordered = new TreeMap<String, Integer>(cmp);
        ordered.putAll(map);

        int i = 0;
        for (String key : ordered.keySet()) {
            if (++i > 100)
                break;
            int val = map.get(key);
            System.out.println(key + ": " + val);
        }
    }
}
