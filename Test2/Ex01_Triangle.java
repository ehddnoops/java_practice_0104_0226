

public class Ex01_Triangle {
   
   int width, height;
   
   public Ex01_Triangle(){}
   public Ex01_Triangle(int width, int height) {
      this.width = width;
      this.height = height;
   }
   double calcArea() {
      return width * height / 2.0;
   }
   void output() {
      System.out.println("너비 : " + width); 
      System.out.println("높이 : " + height); 
      System.out.println("크기 : " + calcArea()); 
   }

}