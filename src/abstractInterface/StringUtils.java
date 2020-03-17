package abstractInterface;

public interface StringUtils {
  static  String reversString(String source){
        return new  StringBuilder(source).reverse().toString();
    }

}
