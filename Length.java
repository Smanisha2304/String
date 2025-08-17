class Solution {
    public int lengthOfLastWord(String s) {
        s= s.trim();
        String[] parts = s.split(" ");
        // System.out.println(parts[0]);
        String lastword = parts[parts.length-1];
        int count = lastword.length();
        return count;    
    }
}