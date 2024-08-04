public class Class2 {
    public static void main(String[] args) {
        int sum = 21;
        int numDay = 0;
        int divider;
        while (sum >= 1) {
            numDay++;
            divider = getSum(sum);
            sum = sum - divider;
            System.out.println("Снято = " + divider+", осталось = "+sum);
        }
        System.out.println("Кол-во дней = " + numDay);
    }

    public static int getSum(int sum) {
        if (sum != 1) {
            for (int i = sum - 1; i >= 1; i--) {
                if (sum % i == 0) {
                    return i;
                }
            }
        }
        return 1;
    }
}

