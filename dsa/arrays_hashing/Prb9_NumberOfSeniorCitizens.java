package dsa.arrays_hashing;

public class Prb9_NumberOfSeniorCitizens {
    public static int countSeniors(String[] details) {
        int count = 0;
        for(String elem: details){
            int age = (elem.charAt(11)-'0')*10 + (elem.charAt(12)-'0');
            if(age>60)
                count++;
        }
        return count;
    }
    public static void main(String[] agrs){
        System.out.println(countSeniors(new String[] {"7868190130M7522","9273338290F4010"}));
    }
}
