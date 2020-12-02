public class StringManipulator {
    /* Our class is now accessible from any other class in this directory through 
    creating a new instance of our StringManipulator class.*/
    public String trimAndConcat (String a, String b) {
        // This method is public, will return a string, and takes into two string as parameters.
        String newString = a.trim() + b.trim();
        // Above, we are making a new string that consists of our inputted strings trimmed of any surrounding whitespace.
        return newString;
        // Here, we satisfy our requirement to return a string.
    }
    public Integer getIndexOrNull (String statement, char letter) {
        Integer i = statement.indexOf(letter);
        if (i == -1) {
            return null;
        }
        else {
            return i;
        }
    }
    public Integer getIndexOrNull (String str, String subString) {
        Integer i = str.indexOf(subString);
        if (i == -1) {
            return null;
        }
        else {
            return i;
        }
    }
    public String concatSubstring(String firstStr, int firstI, int secondI, String endStr) {
        String pullString = firstStr.substring(firstI, secondI);
        return pullString + endStr;
    }
}