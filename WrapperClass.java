//Wrapper classes in java : 
// Boolean, Character, Byte, Short, Integer, Long, Float, Double 
class WrapperClass {
    public static void main(String[] args) {
        // Integer Class methods
        int x = Integer.parseInt("123");                     // Parses a string as int
        Integer x1 = Integer.valueOf("10111", 2);            // Binary to int
        int y1 = x1.intValue();                              // Retrieves int value from Integer object

        Double x2 = Double.valueOf("56.78");                 // String to Double
        double y2 = x2.doubleValue();                        // Retrieves double value from Double object
        
        System.out.println("parseInt: " + x);                // Output: 123
        System.out.println("valueOf with radix 2: " + y1);   // Output: 23 (binary 10111)
        System.out.println("doubleValue: " + y2);            // Output: 56.78

        // More Integer methods
        System.out.println("toString: " + Integer.toString(123)); // int to String
        System.out.println("toBinaryString: " + Integer.toBinaryString(23)); // int to binary
        System.out.println("toHexString: " + Integer.toHexString(255));      // int to hex
        System.out.println("compare: " + Integer.compare(10, 20));           // Comparison of two ints
        System.out.println("max: " + Integer.max(10, 20));                   // Maximum of two ints
        System.out.println("min: " + Integer.min(10, 20));                   // Minimum of two ints
        System.out.println("sum: " + Integer.sum(10, 20));                   // Sum of two ints
        
        // Bitwise methods in Integer
        int bitCount = Integer.bitCount(10);                               // Count of 1s in binary of 10
        int highestBit = Integer.highestOneBit(18);                        // Highest one bit in 18
        int lowestBit = Integer.lowestOneBit(18);                          // Lowest one bit in 18
        System.out.println("bitCount: " + bitCount);                       // Output: 2
        System.out.println("highestOneBit: " + highestBit);                // Output: 16
        System.out.println("lowestOneBit: " + lowestBit);                  // Output: 2
        
        // Leading and trailing zeros
        System.out.println("numberOfLeadingZeros: " + Integer.numberOfLeadingZeros(8)); // Leading 0s in binary
        System.out.println("numberOfTrailingZeros: " + Integer.numberOfTrailingZeros(8)); // Trailing 0s in binary

        // Other conversions and constants in Integer
        System.out.println("MAX_VALUE: " + Integer.MAX_VALUE);             // Maximum int value
        System.out.println("MIN_VALUE: " + Integer.MIN_VALUE);             // Minimum int value
        System.out.println("SIZE: " + Integer.SIZE);                       // Bits in int (32)
        System.out.println("BYTES: " + Integer.BYTES);                     // Bytes in int (4)

        // methods in other Wrapper classes
        System.out.println("Boolean.parseBoolean: " + Boolean.parseBoolean("true"));      // String to boolean
        System.out.println("Character.isDigit: " + Character.isDigit('5'));               // Checks if character is digit
        System.out.println("Character.isLetter: " + Character.isLetter('A'));             // Checks if character is letter
        System.out.println("Double.compare: " + Double.compare(10.5, 20.5));              // Comparison of two doubles
        System.out.println("Double.toHexString: " + Double.toHexString(255.0));           // Double to hex

        // Autoboxing and Unboxing with Wrapper classes
        Integer autoBoxed = 100;                              // Autoboxing int to Integer
        int unBoxed = autoBoxed;                              // Unboxing Integer to int
        System.out.println("Auto-boxed Integer: " + autoBoxed);
        System.out.println("Un-boxed int: " + unBoxed);
    }
}
