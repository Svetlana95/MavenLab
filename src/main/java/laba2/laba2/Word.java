package laba2.laba2;

import java.io.IOException;

public class Word {
	String[] mywords;

	Word(String FirstStr) throws IOException {
		mywords = FirstStr.split(" ");// разбивает строку на фрагменты
	}
}

