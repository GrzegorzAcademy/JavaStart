package customer.calculator;

public class CalcServis {

  public  double calculate(double x, double y, String operator) {
       double result = 0;
        switch (operator) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            default:
                System.out.println("podano nieznany operator");
        }
return result;
    }

}
