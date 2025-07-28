package dsa.bit_manipulation;

/*
not allowed to use long
a%b gives same sign as a
check overflow using % and /
 */

public class Prb13_ReverseInteger {
        public int reverse(int x) {
            int result = 0;
            while(x!=0){
                int remainder = x%10;
                x = x/10;

                if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE && remainder>Integer.MAX_VALUE%10))
                    return 0;

                if(result<Integer.MIN_VALUE/10 || (result==Integer.MIN_VALUE && remainder< Integer.MIN_VALUE%10))
                    return 0;

                result = result*10 + remainder;
            }


            return result;
        }
}
