package part2;

public class Main {

    public static void main(String[] args) {
        char[] alphabet = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        String source =
                "no sunshine, lots of rain" + "\n" +
                "no warm days, snow again!" + "\n" +
                "no bugs or bees" + "\n" +
                "no leaves on trees." + "\n" +
                "you must remember" + "\n" +
                "this is november!";

        System.out.println("Source text:");
        System.out.println(source);
        System.out.println();

        String encoded = encode(source, alphabet);
        System.out.println("Encoded text:");
        System.out.println(encoded);
        System.out.println();

        String decoded = decode(encoded, alphabet);
        System.out.println("Decoded text:");
        System.out.println(decoded);
        System.out.println();
    }

    private static String encode(String source, char[] alphabet) {
        StringBuilder encoded = new StringBuilder();
        String[] sourceText = source.split("\n");
        for (int i = 0; i < sourceText.length; i++) {
            String oldLine = sourceText[i].toLowerCase();

            for (char letter : oldLine.toCharArray()) {
                boolean contains = false;
                for (int j = 0; j < alphabet.length; j++) {
                    if (letter == alphabet[j]) {
                        int position = j + i + 1;
                        if (position > alphabet.length - 1) {
                            position = position - alphabet.length;
                        }
                        encoded.append(alphabet[position]);
                        contains = true;
                        break;
                    }
                }
                if (!contains) {
                    encoded.append(letter);
                }
            }
            encoded.append("\n");
        }
        return encoded.toString();
    }

    private static String decode(String encoded,  char[] alphabet) {
        StringBuilder decoded = new StringBuilder();
        String[] encodedText = encoded.split("\n");
        for (int i = 0; i < encodedText.length; i++) {
            String oldLine = encodedText[i].toLowerCase();

            for (char letter : oldLine.toCharArray()) {
                boolean contains = false;
                for (int j = 0; j < alphabet.length; j++) {
                    if (letter == alphabet[j]) {
                        int position = j - i - 1;
                        if (position < 0) {
                            position = alphabet.length + position;
                        }
                        decoded.append(alphabet[position]);
                        contains = true;
                        break;
                    }
                }
                if (!contains) {
                    decoded.append(letter);
                }
            }
            decoded.append("\n");
        }
        return decoded.toString();
    }
}
