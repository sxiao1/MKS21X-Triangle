public class Triangle{
  Point v1;
  Point v2;
  Point v3;
  public Point Triangle(Point a, Point b, Point c){
    v1 = new Point(a);
    v2 = new Point(b);
    v3 = new Point(c);
  }
  Point [] ary = {v1, v2, v3};
  public Point Triangle(double a, double b, double c, double d, double e, double f){
    v1 = new Point(a,b);
    v2 = new Point(c,d);
    v3 = new Point(e,f);
  }
  public double getPerimeter(){
    double perimeter = 0;
    perimeter += Point.distance(v1,v2);
    perimeter += Point.distance(v2,v3);
    perimeter += Point.distance(v1, v3);
    return perimeter;
  }
  public Point getVertex(int index){
    if (index < 3 && index >= 0){
      return ary[index];
    }
  }
  public static void setVertex(int index, Point newP){
    if (index < 3 && index >= 0){
      if( index == 0){
        Point v1 = newP;
      }
      if (index == 1){
        Point v2 = newP;
      }
      if (index == 2){
        Point v3 = newP;
      }
    }
  }
  public String toString(){
    return "Triangle:" + "A" + v1 + "B" + v2+ "C" + v3;
  }
}
