public class functions {
    public static void main(String[] args) {
        // * Functions take some input, process some code, and returns some output
        // * Functions are stored in a stack
        functions fn = new functions();
        float c = fn.add(34, 67);
        System.out.println(c);
        fn.printMyName("Priyanshu");
    }

    float add(float a, float b) { // * Arguments
        return a + b;
    }

    void printMyName(String name) {
        System.out.println(name);
    }
}
