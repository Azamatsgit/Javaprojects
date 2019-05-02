package stringManupilation;

public class theEnd {
    public static void main(String[] args) {
        System.out.println(theEnd("hello",true));
        System.out.println(extraEnd("blueTimes"));


    }
    public static String theEnd(String str, boolean front){
        if (front==true){
            return str.substring(0,1);

        }
        return str.substring(str.length()-1);
    }
    public static String seeColor(String str){
       if (str.startsWith("red")) {
           return "red";
       }
           if (str.startsWith("blue")){
               return "blue";
           }

       return "";
    }
    public static String extraFront( String str){

        if (str.length() >=2){
            return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
        }
        return str+str+str;
    }
    public static String startWord(String str, String word){


            int lenStr = str.length();

            int lenWord = word.length();

            if (lenStr == 0)

            return "";
            if (lenWord > lenStr)

            return "";



            if (word.length() == 1)

            return str.substring(0,1);

  else if (str.substring(1,lenWord).equals(word.substring(1,lenWord)))

            return str.substring(0,lenWord);

  else

            return "";

        }
        public static String extraEnd(String str){
        return str.substring(str.length()-2,1);
        }



}


