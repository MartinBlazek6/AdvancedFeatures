package exceptions;

public class Divide {
    public static void main(String[] args) {
        Divide divide = new Divide();

        try {
            double result = divide.divide(10.0, 0.0);
            System.out.println("Result: " + result);
        } catch (CannotDivideByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    double divide(double a, double b) throws CannotDivideByZeroException {
        if (b==0){
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }

    public class CannotDivideByZeroException extends Exception {
        public CannotDivideByZeroException() {
            super("You can't divide by zero");
        }
    }
}
