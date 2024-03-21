package java_Basics;

import java.util.*;
public class Regex_IP {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while (in.hasNext()) {
                String IP = in.next();
                System.out.println(IP.matches(MyRegex.pattern));
            }
        }
    }

    class MyRegex {
        private static String REG = "(\\b(?:[0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])\\b)";
        public static String pattern = REG + "\\." + REG + "\\." + REG + "\\." + REG;
    }


