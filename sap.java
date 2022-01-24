public class sap {
    public static void main(String args[]) {
        String str = "abc";
        permute(str, "");
    }

    static void permute(String str, String res) {
        int i = 0;
        int len = str.length();
        if (len == 0) {
            System.out.println(res + "");
            return;
        }
        while (i < len) {
            char ch = str.charAt(i);
            String temp = str.substring(0, i) + str.substring(i + 1);
            permute(temp, res + ch);
            i++;
        }
    }
}
