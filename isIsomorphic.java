class Solution {
    public boolean isIsomorphic(String s, String t) {
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();
       if (s.length() != t.length()) return false;
        Map<Character, Character> se = new HashMap<>();
        Set<Character> te = new HashSet<>();
        for(int i =0;i<a.length;i++)
        {
            char ch = a[i];
            char ch1 = b[i];
            if(se.containsKey(ch))
            {
                if(se.get(ch)!=ch1)
                {
                    return false;
                }
            }
            else{
                if(te.contains(ch1))
                {
                    return false;
                }
            
            se.put(ch,ch1);
            te.add(ch1);
            }

        }

    return true;
    }
}