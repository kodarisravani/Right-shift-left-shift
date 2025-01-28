public class RightshiftaAndLeftshift{
        public static void main(String[] args) {
            int number = 15; // 15 = 000111 (binary)
    
            // Left Shift Operator
            int leftShift = number << 2; // 00011 << 2 = 00110 (binary)
            System.out.println("Left Shift (15 << 2): " + leftShift);
    
            // Right Shift Operator
            int rightShift = number >> 2; // 00011 >> 2 = 00011 (binary)
            System.out.println("Right Shift (15 >> 2): " + rightShift);
    
            // Unsigned Right Shift Operator
            int unsignedRightShift = number >>> 2; // 000111 >>> 2 = 000011 (binary)
            System.out.println("Unsigned Right Shift (15 >>> 2): " + unsignedRightShift);
        }
    }
    
