public class Double {
    public static void main(String[] args) {

        // Crating an object with valueOf() method
        Integer intValue = Integer.valueOf("15");
        java.lang.Double duoValue = java.lang.Double.valueOf("14.56");
        Float flValue = Float.valueOf("3.15343524");
        Long lngValue = Long.valueOf(124252553);
        Short shValue = Short.valueOf("2");
        Byte btValue = Byte.valueOf("3");

        // Converting String value to double using parseDouble() method
        String strValue = "2.9846";
        double parsedValue = java.lang.Double.parseDouble(strValue);

        // Converting double literal to string
        String d = java.lang.Double.toString(3.14);
        System.out.println();
        System.out.println("String representation of double " + d);

        // Convert to primitive types
        int convIntValue = intValue.intValue();
        double convDuoValue = duoValue.doubleValue();
        float convFlValue = flValue.floatValue();
        long convLngValue = lngValue.longValue();
        short convShValue = shValue.shortValue();
        byte convBtValue = btValue.byteValue();

        // Output
        System.out.println("Parsed double value is: " + parsedValue);
        System.out.println("Double value is: " + convDuoValue);
        System.out.println("Float value is: " + convFlValue);
        System.out.println("Long value is: " + convLngValue);
        System.out.println("Short value is: " + convShValue);
        System.out.println("Byt value is: " + convBtValue);
    }
}