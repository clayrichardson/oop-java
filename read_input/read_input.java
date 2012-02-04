import java.io.*;

class ReadInput {

public static void main(String[] args) {
// enter stuff here
System.out.print("Type some stuff: ");

// open up standard input
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

String stuffEntered = null;

// read the stuff from the command-line; need to use try/catch with the
// readLine() method

try {
    stuffEntered = in.readLine();
} catch (IOException ioe) {
    System.out.println("IO error trying to read your shit!");
    System.exit(1);
}

    System.out.println("Thanks for your shit: " + stuffEntered);

}
}


