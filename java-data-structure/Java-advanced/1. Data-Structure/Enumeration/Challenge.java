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
        for(int i = 0; i < data.length; i++)
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
                    break;
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