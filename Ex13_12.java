public class Ex13_12 {
    public static void main(String args[]) {
        double radius = 10.0;
        double x1 = 5.3;
        double y1 = 6.8;
        double x2 = 0.2;
        double y2 = 9.5;
        double dist = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        try {
            if (dist <= radius) {
                throw new CenterException(x1, y1, x2, y2, radius);
            }
            else if (dist > radius) {
                throw new OutException(x1, y1, x2, y2, radius);
            } 
            else {
                throw new InException(x1, y1, x2, y2, radius);
            }
        } 
        catch (CenterException e) {
            System.out.println(e.getMessage());
        } 
        catch (OutException e) {
            System.out.println(e.getMessage());
        } 
        catch (InException e) {
            System.out.println(e.getMessage());
        }
    }
}

class CenterException extends Exception {
    public CenterException(double x1, double y1, double x2, double y2, double radius) {
        super("(" + x1 + "," + y1 + ")在半徑" + radius + "圖心(" + x2 + "," + y2 + ")的圓心上");
    }
}

class OutException extends Exception {
    public OutException(double x1, double y1, double x2, double y2, double radius) {
        super("(" + x1 + "," + y1 + ")不在半徑" + radius + ",圆心(" + x2 + "," + y2 + ")的圓內");
    }
}

class InException extends Exception {
    public InException(double x1, double y1, double x2, double y2, double radius) {
        super("(" + x1 + "," + y1 + ")在半徑" + radius + ", 圓心(" + x2 + "," + y2 + ")的圓內");
    }
}
