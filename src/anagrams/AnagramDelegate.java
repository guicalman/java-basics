package anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramDelegate {

    public String[] getAnagramsByLetterCounts(String input, String[] words){

        List<String> foundAnagrams = new ArrayList();

        for(String word: words){
            if(isAnagramByLetterCount(input, word)){
                foundAnagrams.add(word);
            }
        }
        return foundAnagrams.toArray(new String[0]);
    }

    public String[] getAnagramsByOrderingChars(String input, String[] words){

        List<String> foundAnagrams = new ArrayList();

        for(String word: words){
           if(isAnagramByOrdering(input, word)){
              foundAnagrams.add(word);
           }
        }
        return foundAnagrams.toArray(new String[0]);
    }

    private boolean isAnagramByOrdering(String input, String word){
        boolean isAnagram = false;
        if(input.length() == word.length()){
            char[] inputCharArray = input.toCharArray();
            char[] wordCharArray = word.toCharArray();
            Arrays.sort(inputCharArray);
            Arrays.sort(wordCharArray);
            isAnagram = Arrays.equals(inputCharArray, wordCharArray) ? true : false;
        }
        return isAnagram;
    }

    private boolean isAnagramByLetterCount(String input, String word){
        HashMap<Character, Integer> inputLetterCount = getLetterCount(input);
        HashMap<Character, Integer> wordLetterCount = getLetterCount(word);
        return inputLetterCount.equals(wordLetterCount);
    }

    private HashMap<Character, Integer> getLetterCount(String word){
        HashMap<Character, Integer> letterCount = new HashMap<Character, Integer>();
        for(char letter : word.toCharArray()){
            if(letterCount.get(letter) == null){
                letterCount.put(letter, 1);
            }else{
                int count = letterCount.get(letter);
                letterCount.put(letter, count++);
            }
        }
        return letterCount;
    }
}
