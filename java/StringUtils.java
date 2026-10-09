public class StringUtils {

    // Reverse string with a backwards loop
    public static String reverseWithLoop(String s){

        String result = "";
        for (int i = s.length() - 1; i >= 0; i--){
            result += s.charAt(i);
        }
        return result;
    }

    //Reverse string with StringBuilder
    public static String reverseWithBuilder(String s){

        return new StringBuilder(s).reverse().toString();

    }
}
