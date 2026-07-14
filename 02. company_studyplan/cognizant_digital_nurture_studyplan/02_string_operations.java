import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        String name = "Krishnaa";
        // 1. length()
        System.out.println("1. length(): " + name.length());
        // 2. charAt()
        System.out.println("2. charAt(0): " + name.charAt(0));
        // 3. substring(start)
        System.out.println("3. substring(2): " + name.substring(2));
        // 4. substring(start, end)
        System.out.println("4. substring(2,5): " + name.substring(2, 5));
        // 5. toUpperCase()
        System.out.println("5. toUpperCase(): " + name.toUpperCase());
        // 6. toLowerCase()
        System.out.println("6. toLowerCase(): " + name.toLowerCase());
        // 7. equals()
        System.out.println("7. equals(): " + name.equals("Krishnaa"));
        // 8. equalsIgnoreCase()
        System.out.println("8. equalsIgnoreCase(): " + name.equalsIgnoreCase("krishnaa"));
        // 9. contains()
        System.out.println("9. contains(\"ish\"): " + name.contains("ish"));
        // 10. startsWith()
        System.out.println("10. startsWith(\"K\"): " + name.startsWith("K"));
        // 11. endsWith()
        System.out.println("11. endsWith(\"aa\"): " + name.endsWith("aa"));
        // 12. indexOf()
        System.out.println("12. indexOf('a'): " + name.indexOf('a'));
        // 13. lastIndexOf()
        System.out.println("13. lastIndexOf('a'): " + name.lastIndexOf('a'));
        // 14. replace()
        System.out.println("14. replace('a','x'): " + name.replace('a', 'x'));
        // 15. replaceAll()
        System.out.println("15. replaceAll(): " + "abc123".replaceAll("[0-9]", "*"));
        // 16. trim()
        System.out.println("16. trim(): " + "   Hello   ".trim());
        // 17. isEmpty()
        System.out.println("17. isEmpty(): " + "".isEmpty());
        // 18. split()
        String[] words = "Java Python C".split(" ");
        System.out.println("18. split(): " + Arrays.toString(words));
        // 19. concat()
        System.out.println("19. concat(): " + "Hello".concat(" World"));
        // 20. compareTo()
        System.out.println("20. compareTo(): " + "apple".compareTo("banana"));
        // 21. compareToIgnoreCase()
        System.out.println("21. compareToIgnoreCase(): " + "JAVA".compareToIgnoreCase("java"));
        // 22. toCharArray()
        char[] chars = name.toCharArray();
        System.out.println("22. toCharArray(): " + Arrays.toString(chars));
        // 23. valueOf()
        System.out.println("23. valueOf(): " + String.valueOf(123));
        // 24. String.join()
        System.out.println("24. String.join(): " + String.join("-", "Java", "Python", "C"));
        // 25. repeat()
        System.out.println("25. repeat(): " + "Hi ".repeat(3));
        // 26. matches()
        System.out.println("26. matches(): " + "12345".matches("[0-9]+"));
        // 27. isBlank()
        System.out.println("27. isBlank(): " + "   ".isBlank());
    }
}