import java.util.function.UnaryOperator;

public class Main {
    static String PREFIX = "__prefix__";  // CAN ONLY BE USED IN UNARYOPERATOR IF IT IS DESIGNED AS STATIC, NOT INSTANCE VARIABLE
    static String SUFFIX = "__suffix__";  // CAN ONLY BE USED IN UNARYOPERATOR IF IT IS DESIGNED AS STATIC, NOT INSTANCE VARIABLE
	// fix the operator code
    public static UnaryOperator<String> operator = str -> {   // UNARYOPERATOR IS A PREDEFINED INTERFACE, OUTPUTS SAME TYPE AS INPUT
        String trimmedString = str.replaceAll("\\s","");
        return (PREFIX + trimmedString + SUFFIX);
    };

    public static void main(String[] args) {
        String res = operator.apply("  hello My name is conner ");
        System.out.println(res); // __prefix__hello__suffix__
    }
}
