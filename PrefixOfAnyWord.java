/*
1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
Difficulty: Easy
Link: https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/
 */
public class PrefixOfAnyWord {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int i=0;
        for(String str:words){
            i++;
            if(str.startsWith(searchWord))
                return i;
        }
        return -1;
    }
}
