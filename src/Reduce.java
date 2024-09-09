public class Reduce {
    static int k;
    public static void main(String[] args) {
        int i = 100;
        while(i>=1) {
            if (i % 2 == 0) {
                k++;
                i = i / 2;
            } else {
                i = i - 1;
                k++;
            }
        }
        System.out.println(k);
        }
    }

