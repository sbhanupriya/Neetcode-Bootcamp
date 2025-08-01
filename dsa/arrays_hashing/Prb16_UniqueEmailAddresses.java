package dsa.arrays_hashing;

import java.util.HashSet;

public class Prb16_UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hashset = new HashSet<>();

        for(int i=0;i<emails.length;i++){
            String email = emails[i];
            StringBuilder localName = new StringBuilder();
            int index = 0;
            boolean ignore = false;
            while(index<email.length() && email.charAt(index)!='@'){
                if(email.charAt(index)=='+'){
                    ignore = true;
                } else if(ignore==false && email.charAt(index)!='.'){
                    localName.append(email.charAt(index));
                }
                index++;
            }
            localName.append(email.substring(index, email.length()));
            hashset.add(localName.toString());
        }

        return hashset.size();
    }
}
