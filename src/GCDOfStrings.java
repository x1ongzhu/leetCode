public class GCDOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    public int gcd(int a, int b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }

    public static void main(String[] args) {
        GCDOfStrings gcdOfStrings = new GCDOfStrings();
        System.out.println(gcdOfStrings.gcdOfStrings("ABCABCABC", "ABCABC"));
    }
}
