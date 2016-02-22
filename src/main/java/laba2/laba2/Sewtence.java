package laba2.laba2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sewtence {
	public static String replace;
	public static int numb;
	public static String[] NewStr;

	Sewtence() throws IOException {
		BufferedReader ReadInt = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader ReadSmb = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Номер символа:");
		numb = Integer.parseInt(ReadInt.readLine());
		System.out.println("Cимвол для замены:");
		replace = ReadSmb.readLine();
	}

	public String[] replace(String ArrWords[]) {
		NewStr = new String[ArrWords.length];

		for (int NumbWords = 0; NumbWords < ArrWords.length; NumbWords++) {
			if (ArrWords[NumbWords].length() < numb) {
				NewStr[NumbWords] = ArrWords[NumbWords];
			} else {
				NewStr[NumbWords] = new String(
						ArrWords[NumbWords].substring(0, numb - 1) + replace + ArrWords[NumbWords].substring(numb));
			}

		}
		return NewStr;
	}

	public static String slit(String ArrWords[]) {

		String str = "";
		for (int NumbWords = 0; NumbWords < ArrWords.length; NumbWords++) {
			str += ArrWords[NumbWords] + " ";
		}
		return str;
	}

}
