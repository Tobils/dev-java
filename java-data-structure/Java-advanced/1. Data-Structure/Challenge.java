public class Challenge
{
    public int data[];
    public int k;
    public int total = 0;

    public Challenge(int data[], int k)
    {
        this.k = k;
        this.data = data;
    }

    public int getTotal()
    {
        for(int dt : data)
        {
            System.out.print(dt + " ");
        }
        for(int i = 0; i < data.length-1; i++)
        {
            int tmp = 0;
            int j = i;
            do 
            {
                tmp += data[j] + data[j+1];
                System.out.println(tmp);
                if(tmp == k)
                {
                    addTotal();
                }
                j++;
            }while(j < (data.length-1));
        }
        return total;
    }

    
    public void addTotal()
    {
        total += 1;
    }
}