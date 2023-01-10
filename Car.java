public class Car {
  int modelYear;
    String modelcolor;
    String modelName;
    public Car(int year, String name, String color) {
      modelcolor = color;
      modelName = name;
      modelYear=year;
    }
  
    public static void main(String[] args) {
      Car myCar = new Car(1999, "BMW", "brown");        //this is called constructor
      System.out.println(myCar.modelYear + " Name is" + myCar.modelName+"color is"+myCar.modelcolor);
    }
  }