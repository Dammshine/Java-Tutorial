import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringClass {
    public static void main(String[] args) {
        // string is always a class
        // Declare a string alkways is an instace of a class
        // and '' is revered for character, so C++ 
        String x = "david\n";
        
        System.out.println(x.charAt(0));
        System.out.println(String.format("hello %32s", x));
        System.out.println(x.length());
        System.out.println(x);

        for (int i = 0; i < x.length(); i++) {
            System.out.println(x.charAt(i));
        }
        
        String xx = "my oh my chicken hot pie";
        /* 
        xx = xx.concat(".\nNow with 20% more chieckn");
        System.out.println(xx);
        System.out.println(xx.contains("chicken"));
        System.out.println(xx.indexOf("my"));
        System.out.println(xx.indexOf("my", 3));
        System.out.println(xx.indexOf("my", xx.indexOf("my") + 1));

        System.out.println(xx.lastIndexOf("my"));
        System.out.println(xx.lastIndexOf("my", xx.lastIndexOf("my") - 1));
        System.out.println(xx.indexOf('c')); */


        // Check out some regex feature
        Pattern pattern = Pattern.compile("my", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(xx);
        if (matcher.find()) {
            System.out.println("Found ");
        } else {
            System.out.println("Not found");
        }

        String b = "  dsa  ";
        // Use regex method
        System.out.println(b.replaceAll(" ", ""));

        b = " \n\t dsa  ";
        System.out.println(b.strip());
        System.out.println(b.strip().toUpperCase());

        b = "abc no gfood";
        System.out.println(b.substring(1, 3));
        // Inclusive for begin, exclusive for end
        System.out.println(b.substring(1));
        System.out.println(b.repeat(99));
        System.out.println(b.equals("Helo"));
        System.out.println(b.equals("abc no gfood"));
    }
}
