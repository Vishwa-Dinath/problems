package bit_manipulation;

public class Demo1 {
    public static void main(String[] args) {
        int number = 22;
        int result = number << 2;
        System.out.println(setBit(0,30));
//        System.out.println(clearBit(6,2));
//        System.out.println(flipBit(102,2));
//        System.out.println(isBitSet(102,5));
    }

    public static int setBit(int x, int position) {
        int mask = 1 << position;
        return x | mask;
    }

    public static int clearBit(int x, int position) {
        int mask = 1 << position;
        return x & ~mask;
    }

    public static int flipBit(int x, int position) {
        int mask = 1 << position;
        return x^mask;
    }

    public static int isBitSet(int x, int position) {
        int shifted = x >> position;
        return shifted & 1;
    }
}
