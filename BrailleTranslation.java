import java.util.HashMap;

public class BrailleTranslation {
    public static void main(String[] args) {

        String myStr = "The quick brown fox jumps over the lazy dog";
        String expectedBraille = "000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110";
        System.out.println(BrailleTranslation.solution(myStr).equals(expectedBraille));
    }

    private static String solution(String s) {
        HashMap<String, String> lhm = new HashMap<String, String>();

        lhm.put("a", "100000");
        lhm.put("b", "110000");
        lhm.put("c", "100100");
        lhm.put("d", "100110");
        lhm.put("e", "100010");
        lhm.put("f", "110100");
        lhm.put("g", "110110");
        lhm.put("h", "110010");
        lhm.put("i", "010100");
        lhm.put("j", "010110");
        lhm.put("k", "101000");
        lhm.put("l", "111000");
        lhm.put("m", "101100");
        lhm.put("n", "101110");
        lhm.put("o", "101010");
        lhm.put("p", "111100");
        lhm.put("q", "111110");
        lhm.put("r", "111010");
        lhm.put("s", "011100");
        lhm.put("t", "011110");
        lhm.put("u", "101001");
        lhm.put("v", "111001");
        lhm.put("w", "010111");
        lhm.put("x", "101101");
        lhm.put("y", "101111");
        lhm.put("z", "101011");
        lhm.put(" ", "000000");
        lhm.put("upperCase", "000001");

        String[] chars = s.split("");
        StringBuilder newStr = new StringBuilder();
        for (String myChr : chars) {
            if (!myChr.equals(" ") && myChr.equals(myChr.toUpperCase())) {
                newStr.append(lhm.get("upperCase"));
                myChr = myChr.toLowerCase();
            }
            newStr.append(lhm.get(myChr));
        }
        return newStr.toString();
    }
}