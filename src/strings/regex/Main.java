package strings.regex;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        firstTask("What is Lorem Ipsum?\n" +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged." +
                " It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
    }

    private static void firstTask(String text){
        Pattern pattern = Pattern.compile("[\n]");
        String[] paragraphs = pattern.split(text);
        int countSentence;
        for(String paragraph : paragraphs){
            countSentence = 0;
            for(String sentence : paragraph.split("[.?!]")){
                countSentence++;
                System.out.println(sentence);

            }
        }
    }
}
