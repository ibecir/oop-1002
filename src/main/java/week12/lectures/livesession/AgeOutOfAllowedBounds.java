package week12.lectures.livesession;

import java.security.InvalidParameterException;

class AgeOutOfAllowedBounds extends InvalidParameterException {
  AgeOutOfAllowedBounds(String message) {
    super(message);
  }
  AgeOutOfAllowedBounds(Throwable cause) {
    super(cause);
  }

  AgeOutOfAllowedBounds(String message, Throwable cause) {
    super(message, cause);
  }
}

class MainRun {
  public static void main(String[] args) {
    int age = -15;


  }

  public static boolean checkAge(int age) {
    if(age < 0 || age > 116)
      throw new AgeOutOfAllowedBounds("Age is not in the allowed bounds", new StackOverflowError());

    return true;
  }
}

