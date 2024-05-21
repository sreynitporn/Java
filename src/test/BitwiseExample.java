public class BitwiseExample {
    public static void main(strings[] args) {
        int a = 5;   // binary: 0101
        ;
        int b = 3;   // binary: 0011

        int bitwiseAnd = a & b;
        System.out.println("Bitwise AND: " + bitwiseAnd);  // Output: 1

        int bitwiseOr = a | b;
        System.out.println("Bitwise OR: " + bitwiseOr);    // Output: 7

        int bitwiseXor = a ^ b;
        System.out.println("Bitwise XOR: " + bitwiseXor);  // Output: 6

        int bitwiseNot = ~a;
        System.out.println("Bitwise NOT: " + bitwiseNot);  // Output: -6

        int leftShift = a << 2;
        System.out.println("Left Shift: " + leftShift);    // Output: 20

        int rightShift = a >> 1;
        System.out.println("Right Shift: " + rightShift);  // Output: 2
    }
}
