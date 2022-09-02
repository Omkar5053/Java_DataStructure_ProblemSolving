package BitManipulation;

public class UpdateitBit {
    public static void main(String[] args)
    {
        int num = 10;
        int i = 2;
        int setBit = 1;

        System.out.println(updateithBit(num, i, setBit));
    }
    private static int updateithBit(int num, int i, int setBit)
    {
//        if(setBit == 0){
//            clearithBit(num, i);
//        } else{
//            setithBit(num, i);
//        }
        //first i will clear the ith bit
        int bitMask = ~(1<<i);
        //it will clear the ith bit in original num means set 0 at the ith position
        int clearNum = num & bitMask;
        //here we shiffting the setBit till ith position if setBit will 0 then at ith position 0 will set
        //if 1 then at ith position 1 will set to the original num because we are doing OR with clearNum;
        int newBitMas = setBit << i;
        return clearNum | newBitMas;
    }
}
