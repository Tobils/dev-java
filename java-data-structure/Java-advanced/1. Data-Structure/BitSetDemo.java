import java.util.BitSet;

public class BitSetDemo
{
    public static void main(String[] args) {
        BitSet bts1 = new BitSet();
        BitSet bts2 = new BitSet();

        /**
         * set some bits
         */

         for(int i=0; i<16; i++)
         {
             if( (i%2) == 0) bts1.set(i);
             if( (i%5) != 0) bts2.set(i);
         }

         BitSetData bitset_demo = new BitSetData(bts1, bts2);
         bitset_demo.showResult();
    }
}