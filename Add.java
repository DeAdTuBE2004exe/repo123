public class Add {
    public void addition(int a, int b) {
        System.out.printf("a + b: %d\n", (a+b));
    }

    public static void main(String[] args) {
        Add obj = new Add();
        obj.addition(2,4);
    }
}
