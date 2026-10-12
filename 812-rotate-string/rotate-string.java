class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }

        String ch = s+s;
        return ch.contains(goal);
    }
}