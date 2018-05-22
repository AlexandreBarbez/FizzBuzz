public class FizzBuzz {

    public static String evaluate(int numberToEvaluate) {
        if (((numberToEvaluate % 3) == 0) && ((numberToEvaluate % 5) == 0)) {
            return "FizzBuzz";
        } else if (numberToEvaluate % 3 == 0) {
            return "Fizz";
        }
        return ((numberToEvaluate % 5) == 0) ? "Buzz" : ("" + numberToEvaluate);
    }

}