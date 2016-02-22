package laba2.laba2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//считывание
public class Text {
	public String FirstStr;

	Text() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Текст:");
		FirstStr = reader.readLine();
	}
}
