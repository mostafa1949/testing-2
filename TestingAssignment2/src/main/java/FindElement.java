public class FindElement {
    public static int maxfind(int [] arr)
    {
        if(arr.length>0) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++)
                if (arr[i] > max)
                    max = arr[i];
                return max;
        }
        else return -1;
    }
    public static int minfind(int [] arr)
    {
        if(arr.length>0)
        {
            int min = arr[0];
            for(int i = 1 ; i < arr.length; i++)
                if(arr[i] < min)
                    min = arr[i];
                return min;
        }
        else return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,-1,4,5,68,2};
        System.out.print(minfind(arr));
    }
}
