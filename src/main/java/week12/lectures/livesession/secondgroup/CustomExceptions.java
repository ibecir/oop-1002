package week12.lectures.livesession.secondgroup;

import java.security.InvalidParameterException;

class InvalidAgeRangeException extends InvalidParameterException {
  InvalidAgeRangeException(String message) {
    super(message);
  }
  InvalidAgeRangeException(Throwable cause) {
    super(cause);
  }
  InvalidAgeRangeException(String message, Throwable cause) {
    super(message, cause);
  }
}

class MainRun {
  public static void main(String[] args) {
    int age = -15;
    if(validateAge(age))
      System.out.println(age);
  }

  public static boolean validateAge(int age) {
    if(age < 0 || age > 120)
      throw new InvalidAgeRangeException("Becir was guilty", new ClassNotFoundException("A mess happened"));
    return true;
  }
}
