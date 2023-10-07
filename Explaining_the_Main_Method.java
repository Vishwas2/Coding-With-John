public class Explaining_the_Main_Method {
    public static void main(String[] args) {
    }
}
// public -> This method has to be callable by something outside of this class. If this method was private or protected,
//           JRE wouldn't have the access to call it, so it has to be public

// static -> a method that can be called on a class without needing an instance of that class to run it. JRE won't create
//           an object of main method, it's just going to run the main method directly on the class.

// void -> it is the return type of the main method since it is not returning anything.

// main -> it just is. The main method has to be called main, it cannot be called anything else.

// String[] args -> array of string called args(arguments). You can take an argument and use it in your program.
