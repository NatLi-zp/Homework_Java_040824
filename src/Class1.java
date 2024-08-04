public class Class1 {
    public static void main(String[] args) {
        int temperature1 = 101;
        int temperature2 = 70;
        System.out.println(test(temperature1, temperature2));
    }

    public static boolean test(int t1, int t2) {
        return t1 > 100 && t2 < 100 ? true : false;
    }
}
