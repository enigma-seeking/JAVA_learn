public class chapter1 {
    public static void main(String[] args) {
        String greeting = "hello";
        int n = greeting.length();
        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println(cpCount);

    }

}
