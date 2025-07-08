package dsa.two_pointers;

public class Prb4_ValidWordAbbreviation {

    public boolean validWordAbbreviation(String word, String abbr) {
        int wordIndex = 0;
        int abbrIndex = 0;
        int skipCount = 0;

        while (wordIndex < word.length() && abbrIndex < abbr.length()) {

            if (abbr.charAt(abbrIndex) == '0') {
                return false;
            }

            while (abbrIndex < abbr.length() && Character.isDigit(abbr.charAt(abbrIndex))) {
                skipCount = skipCount * 10 + (abbr.charAt(abbrIndex) - '0');
                abbrIndex++;
            }

            wordIndex += skipCount;
            skipCount = 0;

            if (abbrIndex < abbr.length() && wordIndex < word.length()) {
                if (word.charAt(wordIndex) != abbr.charAt(abbrIndex)) {
                    return false;
                }
                wordIndex++;
                abbrIndex++;
            }
        }

        return wordIndex == word.length() && abbrIndex == abbr.length();
    }
}
