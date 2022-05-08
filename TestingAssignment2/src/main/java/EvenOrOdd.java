public class oddOrEven {
    public static boolean evenCheck(int a)
    {
        if(a>=0) {
            if (a % 2 == 0)
               return true;
            else
                return false;
        }
        else
            return false;
    }
    public static boolean oddCheck(int a)
    {
        if(a>=0) {
            if (a % 2 == 0)
                return false;
            else
                return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        oddOrEven n = new oddOrEven();
        System.out.print(n.evenCheck(-7));
    }
}
