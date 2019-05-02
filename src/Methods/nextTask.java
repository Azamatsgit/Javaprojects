package Methods;

import java.util.Scanner;

public class nextTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String word= scanner.nextLine();
        String res= "";

        int found = str.indexOf(word);
        for (int i=0; i < str.length(); i++){
            if (i == found){
                res +=word;
                found = str.indexOf(word, found+ word.length());
                i+=word.length()-1;
            }else {
                res+= "+";
            }
            System.out.print(res);
        }




    }

}
