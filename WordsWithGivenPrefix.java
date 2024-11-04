/*
2185. Counting Words With a Given Prefix
Difficulty: Easy
Link: https://leetcode.com/problems/counting-words-with-a-given-prefix/description/
 */
public class WordsWithGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String str:words){
            if(str.startsWith(pref))
                count++;
        }
        return count;
    }
}
