public class Ex13_14 {
    public static void main(String[] args) {
        try {
            triangle(3, 3, 3);
        } 
        catch (NotTriangleException e) {
            System.out.println(e.getMessage());
        } 
        catch (EquilateralTriangleException e) {
            System.out.println(e.getMessage());
        } 
        catch (NotEquilateralTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void triangle(int a, int b, int c) throws NotTriangleException, EquilateralTriangleException, NotEquilateralTriangleException {
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            throw new NotTriangleException("不構成三角形");
        } 
        else if (a == b && a == c && b == c) {
            throw new EquilateralTriangleException("這是正三角形");
        } 
        else {
            throw new NotEquilateralTriangleException("這不是正三角形");
        }
    }
}

class NotTriangleException extends Exception {
    public NotTriangleException(String message) {
        super(message);
    }
}
class EquilateralTriangleException extends Exception {
    public EquilateralTriangleException(String message) {
        super(message);
    }
}
class NotEquilateralTriangleException extends Exception {
    public NotEquilateralTriangleException(String message) {
        super(message);
    }
}
