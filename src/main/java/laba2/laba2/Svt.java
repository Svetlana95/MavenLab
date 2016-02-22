package laba2.laba2;
import java.io.IOException;

public class Svt {

	public static void main(String[] args) throws IOException {
		Text InputStr = new Text();
		String stroka = InputStr.FirstStr;
		Word ArrWord = new Word(stroka);
		Sewtence Condit = new Sewtence();
		Condit.replace(ArrWord.mywords);
		System.out.println(Sewtence.slit(Sewtence.NewStr));

	}

}
