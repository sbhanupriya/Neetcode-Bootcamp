package dsa.arrays_hashing;

public class Prb17_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;

        int[] keyMap = new int[256];
        int[] valueMap = new int[256];
        for(int i=0;i<=255;i++){
            keyMap[i] = 256;
            valueMap[i] = 256;
        }
        for(int i=0;i<s.length();i++){
            int key = s.charAt(i);
            int value = t.charAt(i);
            if(keyMap[key]==256 && valueMap[value]==256){
                keyMap[key] = value;
                valueMap[value] = key;
            }
            else if(value==keyMap[key] && valueMap[value]==key){
                continue;
            } else {
                //System.out.println(i);
                return false;
            }
        }

        return true;
    }
}
