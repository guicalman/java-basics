package anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramDelegate {

    public String[] getAnagrams(String input, String[] words){

        List<String> foundAnagrams = new ArrayList();

        for(String word: words){
           if(isAnagram(input, word)){
              foundAnagrams.add(word);
           }
        }
        return foundAnagrams.toArray(new String[0]);
    }

    private boolean isAnagram(String input, String word){
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
}
