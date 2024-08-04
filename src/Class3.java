public class Class3 {
    public static void main(String[] args) {
        int H = 200;
        int N = 50;
        int M = 1;

        System.out.println("количество подъемов: " + numberOfLifts(H, N, M));
    }

    public static int numberOfLifts(int floor, int stepUp, int stepDown) {
        int i = 0;
        int num = 0; //stepUp - stepDown;
        while (num < floor) {
            num = num + stepUp - stepDown;
            i++;
            System.out.println("Вы на этаже : " + num);

        }
        return i;
    }
}

