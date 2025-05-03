package week12.lectures.exceptions;

public class InvalidStudentDataException extends Exception{
    public InvalidStudentDataException(String message){
        super(message);
    }
}
