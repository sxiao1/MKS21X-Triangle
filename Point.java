public class Point{
  private double x;
  private double y;

  public Point(double a, double b) {
    x = a;
    y = b;
    }
  public Point(Point a){
    x = a.x;
    y = a.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public static double distance(Point a, Point b){
    System.out.println((Math.pow((a.y - b.y), 2)));
    return (Math.sqrt(Math.abs(Math.pow((a.x - b.x), 2)- (Math.pow((a.y - b.y), 2)))));
  }
  public double distanceTo(Point a){
    return (Math.sqrt(Math.abs(Math.pow((this.x - a.x), 2)- (Math.pow((this.y - a.y), 2)))));
  }
  public String toString(){
    return"(" + x + "," + y+ ")";
  }
}
