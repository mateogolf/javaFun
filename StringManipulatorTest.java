public class StringManipulatorTest{
    public static void main(String args[]){
        StringManipulator manipulator = new StringManipulator();
        //Tests trimAndConcat
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); // HelloWorld 

        //Tests getIndexOrNull
        // char letter = 'o';
        // Integer a = manipulator.getIndexOrNull("Coding", letter);
        // Integer b = manipulator.getIndexOrNull("Hello World", letter);
        // Integer c = manipulator.getIndexOrNull("Hi", letter);
        // System.out.println(a); // 1
        // System.out.println(b); // 4
        // System.out.println(c); // null
        //Test string inside string version of getIndexOrNull
        // String word = "World Hello";
        // String subString = "llo";
        // String notSubString = "worlds";
        // Integer a = manipulator.getIndexOrNull(word, subString);
        // Integer b = manipulator.getIndexOrNull(word, notSubString);
        // System.out.println(subString);
        // System.out.println(a); // 2
        // System.out.println(notSubString);
        // System.out.println(b); // null

        //Test concatSubstring
        String word = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word); // eworld
    }
}