class Solution {
    public int romanToInt(String s) {
        Map <String ,Integer> map = new HashMap<>();
         map.put("I",1);
         map.put("V",5);
         map.put("X",10);
         map.put("L",50);
         map.put("C",100);
         map.put("D",500);
         map.put("M",1000);
         int sum=0;
       String[] chars = s.split("");
        for(int i=0;i<=chars.length-1;i++){

            if ((i+1)<chars.length && ((map.get(chars[i]))<(map.get(chars[i+1]))) ){
                // sum=sum-map.get(chars[i-1]);
                sum-=map.get(chars[i]);
                
            }
            else{
                 sum+=map.get(chars[i]);
            }       
        }

        return sum;

    }
}