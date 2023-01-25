//Write the distance of two points
class Sample10
  {
    public static void main(String args[]) {
      int x1, y1, x2, y2;
      x1=2;
      x2=4;
      y1=6;
      y2=8;
      double dis;
      dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
      System.out.println("Distance of two points is "+dis);
    }
  }