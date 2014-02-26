// Bluej project: plurals
public class Word
{
    private String letters;
    private int x;
    private int y;

    public Word(String letters)
    {
        this.letters = letters.toLowerCase();
	x = letters.length() - 1;
	y = letters.length() - 2;
    }

    /**
        Forms the plural of this word.
        @return the plural, using the rules for regular nouns
    */
    public String getPluralForm()
    {
        // TODO: Complete this method
        // If the word ends in y preceded by a consonant you take away the y and add ies.
        // If the word ends in y preceded by a vowel, you just add an s.
        // You add an es when a word ends in o, or s, or sh, or ch.
        // In all the other case just add an s.
        // you can use the
        //  isVowel
        //  isConsonant
        //  is
        // methods from below.
        if (is(x,"y")) {
		if (isVowel(y)) {
	                letters = letters + "s";
        	} else {
	                letters = letters.substring(0,letters.length() -1) + "ies";
		}
	} else if (is(x,"o")
		|| is(x,"s")
		|| (is(x,"h")
		&& (is(y,"s")
		|| is(y,"c")))) {
		letters = letters + "es";
        } else {
		letters = letters + "s";
	}
	return letters;
    }

    /**
       Tests whether the ith letter is a vowel.
       @param i the index of the letter to test
       @return true if the ith letter is a vowel
    */
    public boolean isVowel(int x)
    {
        return is(x, "a")
               || is(x, "e")
               || is(x, "i")
               || is(x, "o")
               || is(x, "u");
    }

    /**
       Tests whether the ith letter is a consonant.
       @param i the index of the letter to test
       @return true if the ith letter is a consonant
    */
    public boolean isConsonant(int x)
    {
        return !isVowel(x);
    }

    /**
     * Checks what letter is in position i
     * @return true when the the letter of letters is the given letter.
     *         false otherwise.
     * @param i index in letters
     * @param letter the letter to match with. must be one character long.
     */
    public boolean is(int x, String letter)
    {
        return letters.substring(x, x + 1).equals(letter);
    }
}

