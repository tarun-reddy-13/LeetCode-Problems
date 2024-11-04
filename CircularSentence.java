/*
2490. Circular Sentence
Difficulty: Easy
Link: https://leetcode.com/problems/circular-sentence/description/
 */
public class CircularSentence {
    public boolean isCircularSentence(String sentence) {
        boolean flag=false;
        String[] words = sentence.split(" ");
        if(words.length==1){
            if(words[0].charAt(0)==words[0].charAt(sentence.length()-1))
                return true;
            else
                return false;
        }
        else{
            char tem=words[0].charAt(words[0].length()-1);
            for(int i=1, j=0;;i=(i+1)%words.length, j++)
            {
                if(j==words.length)
                    break;
                if(tem!=words[i].charAt(0))
                    return false;
                tem=words[i].charAt(words[i].length()-1);
            }
        }
        return true;
    }
}
