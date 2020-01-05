public class ChallengeTest
{
    public static void main(String[] args) {
        int data[] = {3,7,2,1,20};
        int k = 10;

        Challenge test = new Challenge(data, k);

        System.err.println("k : " + k);
        System.out.println("total : " + test.getTotal());
    }
}