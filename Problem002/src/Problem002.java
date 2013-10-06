public class Problem002 {
    public static void main(String[] args) {
        long sum = 0;
        long f1 = 1, f2 = 1;

        while (f2 < 4 * 1000000L) {
            long aux = f2 + f1;
            f1 = f2;
            f2 = aux;

            if (f2 % 2 == 0) sum += f2;
            System.out.println(f2);
        }

        System.out.println(sum);
    }
}
