package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
class Calculator {

    String calculate(String[] expression) {
        System.out.println(expression[0]);
        System.out.println(expression[1]);
        System.out.println(expression[2]);
        int a = Integer.parseInt(expression[0]);
        int b = Integer.parseInt(expression[2]);
        int result;
        switch (expression[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            default:
                return "ERROR";
        }
        if (expression.length < 4) {
            return String.valueOf(result);
        }
        int c = Integer.parseInt(expression[4]);
        switch (expression[3]) {
            case "+":
                result = result + c;
                break;
            case "-":
                result = result - c;
                break;
            default:
                return "ERROR";
        }
        return String.valueOf(result);
    }

}
