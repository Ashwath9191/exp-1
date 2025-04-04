public class NullPointerExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // Null reference
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }
    }
}
