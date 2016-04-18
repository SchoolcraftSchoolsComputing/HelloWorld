public class Main {

    public static void main(String[] args) {
        // iterate through numbers 1-100
       for (int i = 1; i <= 100; i++) {
           //You must check if it meets both criteria first.
           //Otherwise it will always print fizz or buzz but
           // but it will never get to both
           if (i % 3 == 0 && i % 5 == 0) {
               System.out.println("FizzBuzz");
           } else if (i % 3 == 0) {
               System.out.println("Fizz");
           } else if (i % 5 == 0) {
               System.out.println("Buzz");
           } else {
               System.out.println(i);
           }
       }
    }

}
