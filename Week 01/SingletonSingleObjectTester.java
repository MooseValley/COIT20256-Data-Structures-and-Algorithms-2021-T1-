/*
In SingletonSingleObjectTester:
*/
public class SingletonSingleObjectTester {
    public static void main(String[] args) {
      // Get the only object available
      SingletonSingleObject object1 = SingletonSingleObject.getInstance("Moose");

      SingletonSingleObject object2 = SingletonSingleObject.getInstance("Frankie");

      // Show the message
      object1.showMessage();
      object2.showMessage();

      object1.setName ("Bella");
      object1.showMessage();
    }

}

