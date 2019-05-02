package StringBuilder;

public class Stringbuilder3 {
    public static void main(String[] args) {
        char ch = 'A';
        ch++;
        System.out.println(ch);
        StringBuilder alphabet = new StringBuilder();
        for (char chars ='A'; chars <='Z'; chars++){
            alphabet.append(chars);
        }
        System.out.println(alphabet);

    }
}
