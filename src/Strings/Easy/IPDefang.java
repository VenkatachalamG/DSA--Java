// https://leetcode.com/problems/defanging-an-ip-address/description/

package Strings.Easy;

public class IPDefang {
    public static void main(String[] args) {
        String ipAddress = "255.100.50.0";
        String ans = ipDefang(ipAddress);
        System.out.println(ans);
    }

    private static String ipDefang(String ipAddress) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < ipAddress.length(); i++) {
            if (ipAddress.charAt(i) == '.') {
                ans.append("[.]");
            }
            else {
                ans.append(ipAddress.charAt(i));
            }
        }
        return ans.toString();
    }
}
