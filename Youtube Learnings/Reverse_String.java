public class Reverse_String {
    public static void main(String[] args) {
        StringBuilder reverse = new StringBuilder("krishna");

        for (int i = 0; i<reverse.length()/2; i++) {

            int front = i;
            int back = reverse.length() - 1 - i;

            char frontCharacter = reverse.charAt(front);
            char backCharacter = reverse.charAt(back);

            reverse.setCharAt(front,backCharacter);
            reverse.setCharAt(back,frontCharacter);

            System.out.println(reverse);

        }

    }
}