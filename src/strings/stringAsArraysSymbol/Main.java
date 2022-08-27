package strings.stringAsArraysSymbol;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String [] args){
        deleteSpaces();
    }

    private static void replaceInSnakeCase(){
        String[] words = {"newWord", "sadBoy", "newArray", "goodDay"};

        Pattern pattern = Pattern.compile("\\B([A-Z])");
        for (int i = 0; i < words.length;i++){
            Matcher matcher = pattern.matcher(words[i]);
            StringBuffer stringBuffer = new StringBuffer();
            while(matcher.find()){
                matcher.appendReplacement(stringBuffer, "_$0");
            }
            matcher.appendTail(stringBuffer);

            words[i] = stringBuffer.toString().toLowerCase();
        }

        System.out.println("New array:");
        for (String word:words) {
            System.out.print(word + " ");
        }
    }

    private static void replaceWordOnLetter(){
        String string = "everyone calls the word differently, " +
                "the word carries a very important meaning.\n" +
                "The word was invented from ancient times.";


        System.out.println(string.replace("word", "letter"));
    }

    private static void findCountDigitsInString(){
        String string = "Hello123, rr31,4,ser5,cherry0";


        int countDigits = 0;
        Pattern pattern = Pattern.compile("\\d");

        Matcher matcher = pattern.matcher(string);
        while (matcher.find()){
            countDigits++;
        }

        System.out.println("Count digits: " + countDigits);
    }

    private static void findCountNumbersInString(){
        String string = "Hello123, rr31,4,ser5,cherry0";


        int countNumbers = 0;
        Pattern pattern = Pattern.compile("\\d+");

        Matcher matcher = pattern.matcher(string);
        while (matcher.find()){
            countNumbers++;
        }

        System.out.println("Count numbers: " + countNumbers);
    }

    private static void deleteSpaces(){
        String string = "  ada   ad d w e  e d f   ";

        String str = string.trim();
        str = str.replaceAll("\\s{2,}", " ");

        System.out.println(str);
    }



}
