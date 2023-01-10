public class Localvariable {
    public void pupAge() {
        int age = 0;                            //This is local variable
        age = age + 7;
        System.out.println("Puppy age is : " + age);
     }
     public static void main(String args[]) {
        Test test = new Test();                 //Creation of object
        test.pupAge();
     }
  }
    

