public class sahamDemo
{
    public static void main(String[] args) {
        Saham saham1 = new Saham("PT. widya wicara", 1500.0);
        Saham saham2 = new Saham("PT. widya wicara", 1500.0);
        System.out.println(saham1);  
        
        if(saham1.equals(saham2))
        {
            System.out.println("sama");
            System.out.println(saham2);
        }
    }
}