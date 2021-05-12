public class InvalidImageException extends Exception
{
    private int row;
    private int column;
    private String message;

    public InvalidImageException(int r, int c){
        super();
        row = r;
        column = c;
        message = "Invalid pixel at ("+row+","+column+")";
    }

    public int rowNumber() {
        return row;
    }

    public int columnNumber() {
        return row;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Invalid pixel at ("+row+","+column+")";
    }

} // public class InvalidImageException
