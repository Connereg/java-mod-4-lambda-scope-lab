import java.util.function.UnaryOperator;

public class Main {
    static String PREFIX = "__prefix__";
    static String SUFFIX = "__suffix__";
	// fix the operator code
    public static UnaryOperator<String> operator = str -> {
        String trimmedString = str.replaceAll("\\s","");
        return (PREFIX + trimmedString + SUFFIX);
    };

    public static void main(String[] args) {
        String res = operator.apply("  hello My name is conner ");
        System.out.println(res); // __prefix__hello__suffix__
    }
}
