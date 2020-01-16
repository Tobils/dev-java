/**
 * Implementation in Java : Using codaddict's algorithm (Maybe slightly different)
 * source : https://stackoverflow.com/questions/4720271/find-a-pair-of-elements-from-an-array-whose-sum-equals-a-given-number
 */

import java.util.*;
public class Challenge
{
   public static void main(String[] args) {
       int data[] = {3,7,2,1,20};
       int k = 10;
       pairSumData(data, k);
   }

   public static void pairSumData(int[] data, int k) 
   {
        Map<Integer, Integer> pairData = new HashMap<Integer, Integer>(); 
        for(int i=0; i<data.length; i++)
        {
            System.out.println(pairData.containsKey(data[i]));

            if(pairData.containsKey(data[i]))
            {
                System.out.println(data[i] + " , " + pairData.get(data[i]) );
            }else
            {
                pairData.put(k-data[i], data[i]);
            }
        }
   }
}