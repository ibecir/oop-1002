package week12.lectures.exceptions;

public class EmptyStudentListException extends RuntimeException {
    public EmptyStudentListException(String message){
        super(message);
    }
}
