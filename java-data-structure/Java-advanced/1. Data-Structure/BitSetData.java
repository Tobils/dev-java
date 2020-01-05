import java.util.BitSet;

public class BitSetData
{
    BitSet bits1;
    BitSet bits2;
    
    public BitSetData(BitSet bitSet1, BitSet bitSet2)
    {
        this.bits1 = bitSet1;
        this.bits2 = bitSet2;
    }

    public void showResult()
    {
        System.out.println("data 1 : " + bits1);
        System.out.println("data 2 : " + bits2);
        

        System.out.println("AND");
        bits2.and(bits1);
        System.out.println("Bitset2 and Bitset2");
        System.out.println(bits2);
        System.out.println();

        System.out.println("OR");
        bits2.or(bits1);
        System.out.println("Bitset2 or Bitset2");
        System.out.println(bits2);

        System.out.println();
        System.out.println("XOR");
        bits2.xor(bits1);
        System.out.println("Bitset2 xor Bitset2");
        System.out.println(bits2);
    }

}