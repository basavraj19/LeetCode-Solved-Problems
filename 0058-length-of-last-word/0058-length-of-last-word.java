class Solution {
    public int lengthOfLastWord(String s) {
        String result= s.trim();
        String res[]=result.split(" ");
        return res[res.length-1].length();
    }
}