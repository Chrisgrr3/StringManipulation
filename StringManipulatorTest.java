public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator changeString = new StringManipulator();
        // Here, we make a new instance of our StringManipulator class.
        String str = changeString.trimAndConcat("  Hello  ", "  World  ");
        // Within the instance of the StringManipulator class, we can access our predefined method and pass in arguments.
        System.out.println(str);
        // Finally, we display the returned statement from the utilizied method.
        Integer index = changeString.getIndexOrNull("Hello", 'e');
        System.out.println(index);

        Integer position = changeString.getIndexOrNull("TacoBell", "Bell");
        System.out.println(position);

        String newStr = changeString.concatSubstring("Hello", 2, 4, "World");
        System.out.println(newStr);
    }
}