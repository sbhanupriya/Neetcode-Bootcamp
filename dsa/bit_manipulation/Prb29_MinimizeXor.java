package dsa.bit_manipulation;


/*

Time O(logN)
 */
public class Prb29_MinimizeXor {
    public int minimizeXor(int num1, int num2) {
        int bitCount = 0;
        while(num2!=0){
            bitCount += (num2&1);
            num2 = num2>>1;
        }
        //System.out.println(bitCount);
        int xor = 0;
        for(int i=30;i>=0&&bitCount>0;i--){
            if((num1&(1<<i))!=0){
                bitCount--;
                xor = xor | (1<<i);
            }
        }
        //System.out.println(bitCount + " " + xor);
        int index=0;
        for(int i=0;i<31 && bitCount>0;i++){
            if((xor&(1<<i))==0){
                bitCount--;
                xor = xor | (1<<i);
            }
        }
        return xor;
    }
}
