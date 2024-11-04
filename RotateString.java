/*
796. Rotate String
Difficulty: Easy
Link: https://leetcode.com/problems/rotate-string/description/
 */
class RotateString {
    public boolean rotateString(String s, String goal) {
        String s1="";
        if(goal.length()!=s.length())
            return false;
        for(int i=0;i<goal.length();i++){
            if(goal.charAt(i)==s.charAt(0)){
                if((s1=goal.substring(i, s.length())+goal.substring(0, i)).equals(s))
                    return true;
                //System.out.println(s1);
            }
        }
        return false;
    }
}