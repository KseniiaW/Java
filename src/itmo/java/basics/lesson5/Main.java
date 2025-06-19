package itmo.java.basics.lesson5;

public class Main {
    public static void main(String[] args) {
        // Тестирование метода поиска самого длинного слова
        String text1 = "Бегемот пошел прогуляться по пляжу";
        System.out.println("Самое длинное слово: " + findWord(text1));

        // Тестирование метода проверки палиндрома
        String word1 = "заказ";
        String word2 = "слово";
        System.out.println(word1 +" " + isPalindrome(word1));
        System.out.println(word2 + " " + isPalindrome(word2));

        // Тестирование метода цензуры
        String text2 = "бяка, не бяка";
        String wordToCens = "бяка";
        String wordToReplace = "[вырезано цензурой]";
        System.out.println(cens(text2, wordToCens, wordToReplace));

        // Тестирование метода поиска подстроки
        String mainText = "Это строка, в которой нужно найти количество вхождений подстроки";
        String subText = "в";
        System.out.println("Количество вхождений '" + subText + "': " + countSubstring(mainText, subText));

        // Тестирование метода инвертирования слов
        String input = "This is a test string";
        System.out.printf("The given string is: %s\n", input);
        System.out.println("The string reversed word by word is:");
        System.out.println(reverseWords(input));
    }

    // Задание 1. Метод для поиска самого длинного слова в тексте
    public static String findWord(String text) {
        String[] words = text.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    //Задание 2. Метод проверки является ли слово палиндромом

    public static boolean isPalindrome(String word) {
        String text = word.replaceAll("[^а-яА-Яa-zA-Z]", "").toLowerCase();
        return new StringBuilder(text).reverse().toString().equals(text);
    }

    //Задание 3. Метод замены слова "бяка" на "[вырезано цензурой]"

    public static String cens(String text, String wordToCens, String wordToReplace) {
        return text.replaceAll(wordToCens, wordToReplace);
    }

    // Задание 4. Метод поиска количества вхождений подстроки

    public static int countSubstring(String mainText, String subText) {
        int count = 0;
        int position = mainText.indexOf(subText);

        while (position != -1) {
            count++;
            position = mainText.indexOf(subText, position + 1);
        }

        return count;
    }

    //Задание 5. Метод для инвертирования слов в строке

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse())
                    .append(" ");
        }

        return result.toString().trim();
    }
}
