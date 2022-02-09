public class Check{
    public static void check(float num) throws myException{
        if (num <= 0) {
            throw new myException();
        }
    }
}
