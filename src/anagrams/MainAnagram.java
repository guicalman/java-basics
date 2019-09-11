package anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class MainAnagram {

    final static String[] words = {"abed","bade","bead","abet","beat","beta","abets","baste","betas","beast","beats","abut","tabu","tuba","acme","came","mace","acre","care","race","acres","cares","races","scare","actors","costar","castor","actress","casters","recasts","airmen","marine","remain","alert","alter","later","alerted","altered","related","treadle","ales","leas","sale","seal","aligned","dealing","leading","allergy","gallery","largely","regally","amen","mane","mean","name","anew","wane","wean","angel","angle","glean","antler","learnt","rental","apt","pat","tap","arches","chaser","search","are","ear","era","arm","mar","ram","arrest","rarest","raters","starer","artist","strait","traits","arts","rats","star","tars","arcs","cars","scar","ascent","secant","stance","ascot","coats","coast","tacos","asleep","elapse","please","asp","pas","sap","spa","aspired","despair","diapers","praised","asps","pass","saps","spas","assert","asters","stares","aster","rates","stare","taser","tears","ate","eat","eta","tea","aridest","astride","staider","tardies","tirades","auctioned","cautioned","education","awls","laws","slaw","baker","brake","break","bard","brad","drab","bared","beard","bread","debar","barely","barley","bleary","bats","stab","tabs","begin","being","binge","below","bowel","elbow","bleats","stable","tables","bluest","bluets","bustle","sublet","subtle","bores","robes","sober","brag","garb","grab","calipers","replicas","spiracle","caller","cellar","recall","canter","nectar","recant","trance","canters","nectars","recants","scanter","trances","capes","paces","space","caret","cater","crate","trace","carets","caters","caster","crates","reacts","recast","traces","catered","created","reacted","cider","cried","dicer","claimed","decimal","declaim","medical"};
    final static AnagramDelegate anagramDelegate = new AnagramDelegate();

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the word to find its anagrams: ");
        String input = scanner.nextLine();
        String[] foundAnagrams = anagramDelegate.getAnagrams(input, words);
        System.out.println("Anagrams found for word " + input);
        System.out.println(Arrays.toString(foundAnagrams));
    }
}
