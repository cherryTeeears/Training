package strings.stringAsStingObject;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        calculateCountSentence("What is Lorem Ipsum?\n" +
                "Lorem Ipsum is simply dummy text of the printing and " +
                "typesetting industry. Lorem Ipsum has been the industry's " +
                "standard dummy text ever since the 1500s, when an unknown printer" +
                " took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic " +
                "typesetting, remaining essentially unchanged. It was popularised in the " +
                "1960s with the release of Letraset sheets containing Lorem Ipsum passages," +
                " and more recently with desktop publishing software like Aldus PageMaker " +
                "including versions of Lorem Ipsum.");
    }

    private static void findMaxCountSpaces() {
        String string = "saf  afaff     b   ";
        int maxCountSpaces = 0, countSpaces = 0;
        for (char symbol : string.toCharArray()) {
            if (symbol == ' ') {
                countSpaces++;
                if (countSpaces > maxCountSpaces) maxCountSpaces = countSpaces;
            } else countSpaces = 0;
        }
        System.out.println(maxCountSpaces);
    }

    private static void insertSymbols(){
        String string = "aHello, everyone. My names is Alex";
        string = string.replace("a", "ab");
        System.out.println(string);
    }

    private static void  isPalindrome(String str){
        boolean flag = false;
        if(str.equals(new StringBuilder(str).reverse().toString())){
            flag = true;
        } else
        {
            flag = false;
        }
        System.out.println(flag);
    }

    private static void createWordFromInformatika(){
        String word = "информатика";
        char[] array = new char[4];

        word.getChars(7,8,array,0);
        word.getChars(3,4,array,1);
        word.getChars(4,5,array,2);
        word.getChars(7,8,array,3);

        word.concat(array.toString());
        System.out.println(array);
    }

    private static void calculateCountAInString(String string){
        int count = 0;
        for (char symb: string.toCharArray()) {
            if(symb=='a'){
                count++;
            }
        }

        System.out.println("Count of 'a' is " + count);
    }

    private static void createDoubleString(String string){
        char[] array = string.toCharArray();
        int countRepeats = 2;
        String newStr="";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < countRepeats; j++) {

                newStr+=array[i];

            }
        }
        System.out.println(newStr);
    }

    private static void deleteRepeatSymbolsAndSpace(String str){

        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for( char symb : str.toCharArray()){
            if(!set.contains(symb)){
                set.add(symb);
                sb.append(symb);
            }
        }
        String result = sb.toString();
        result = result.replaceAll("\\s+","");
        System.out.println(result);
    }

    private static void findTheLargestWordInString(String str){

        int maxLength = 0;
        String maxWord = "";
        String[] words = str.split("\\s");
        for(String word : words){
            if(word.length() > maxLength){

                maxLength = word.length();
                maxWord = word;
            }
        }
        System.out.println(maxWord);

    }

    private static void findCountLowerCaseAndUpperCaseLetters(String str){
        // only English letters!!!
        int countLowerCase = 0;
        int countUpperCase = 0;
        for( char symb : str.toCharArray()){
            if(symb >=65 && symb <=90){
                countUpperCase++;
            } else if(symb >=97 && symb <=122){
                countLowerCase++;
            }
        }

        System.out.println("UpperCase - " + countUpperCase + "\nLowerCase - " + countLowerCase);
    }

    private static void calculateCountSentence(String str){
        int countSentence = 0;
        for(char symb : str.toCharArray()){
            if( symb == '!' || symb == '.' || symb == '?'){
                countSentence++;
            }
        }
        System.out.println("Count sentence - " + countSentence);
    }
}

