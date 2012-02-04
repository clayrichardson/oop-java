
import java.io.*;
import java.util.*;

class Example {

    static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number: ");
        int integer = readInt();
        System.out.println(integer);
    }

    static String readString() throws Exception {
        while (!st.hasMoreTokens()) {
            st = new StringTokenizer(stdin.readLine());
        }
        return st.nextToken();
    }

    static int readInt() throws Exception {
        return Integer.parseInt(readString());
    }

    static double readDouble() throws Exception {
        return Double.parseDouble(readString());
    }
}

