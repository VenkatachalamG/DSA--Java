// https://www.hackerrank.com/challenges/java-regex/problem

package Strings;

class IPAddress {

    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//
//        }
        String IP = "23.45.12.56";
        System.out.println(IP.matches(new MyRegex().pattern));

    }
}

    //Write your code here
class MyRegex {
    String pattern = "^((25[0-5]|2[0-4]\\d|1\\d{2}|0\\d{2}|\\d{1,2})\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|0\\d{2}|\\d{1,2})$";
}
