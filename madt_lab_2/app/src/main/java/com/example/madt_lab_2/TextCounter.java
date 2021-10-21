package com.example.madt_lab_2;

public class TextCounter {
    public static int getCharsCount (String text){
        return text.length();
    }

    public static int getWordsCount (String text) {

        int count = 0;

        boolean isWord = false;
        int endOfLine = text.length() - 1;
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i]) && i != endOfLine) {
                isWord = true;
            } else if (!Character.isLetter(chars[i]) && isWord) {
                count++;
                isWord = false;
            } else if (Character.isLetter(chars[i]) && i == endOfLine) {
                count++;
            }

        }
        return count;
    }

    public static boolean checkEmpty (String text){
        if (text.length() == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
