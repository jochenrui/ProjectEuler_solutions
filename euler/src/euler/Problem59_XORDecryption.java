package euler;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * decrypt msg and find sum of ASCII values in original text
 * https://projecteuler.net/problem=59
 */

public class Problem59_XORDecryption {

	public static void main(String[] args) {
		//C:\Users\joche\Desktop\GitHub\ProjectEuler_solutions\ressources
		String path = "";
		String content = readFile(path, StandardCharsets.US_ASCII);
	}
	
	static String readFile(String path, Charset encoding) throws IOException {
	  byte[] encoded = Files.readAllBytes(Paths.get(path));
	  return new String(encoded, encoding);
	}
}
