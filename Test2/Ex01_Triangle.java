

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
      System.out.println("�ʺ� : " + width); 
      System.out.println("���� : " + height); 
      System.out.println("ũ�� : " + calcArea()); 
   }

}