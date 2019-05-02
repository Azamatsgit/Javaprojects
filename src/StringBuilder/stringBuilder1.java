package StringBuilder;

public class stringBuilder1 {
    public static void main(String[] args) {
        StringBuilder stb1 = new StringBuilder("Halloween");
        // stb1+ stb2 +== operators will not work with String Builder;

        stb1.append(", sql, "+"php, ").append("Html");
        System.out.println(stb1);

        StringBuilder listBuilder = new StringBuilder("Wooden Spoon");
        listBuilder.append(", Iron Spoon");
        listBuilder.append('|');
        listBuilder.append(100);
        StringBuilder letters = new StringBuilder("ABCDEFGHIJKLMNOPQURSTUVWXY");

        letters.append("XXX WWW");

        System.out.println(letters);
        letters.delete(0,4);
        letters.delete(5,100);
        System.out.println(letters);
        StringBuilder sentence = new StringBuilder("Java is fun");
        sentence.reverse();
        System.out.println(sentence);
        sentence.deleteCharAt(0);
        System.out.println(sentence.deleteCharAt(sentence.length()-1));

        StringBuilder str =new StringBuilder("SeleniumAutomation");
        str.insert(8," test ");

        str.insert(9,1);
        System.out.println(str);
        StringBuilder stb = new StringBuilder("keyboard");
        stb.replace(0,3,"cutting");
        stb.insert(7,"-");
        System.out.println(stb);









        System.out.println(listBuilder);
    }
}
