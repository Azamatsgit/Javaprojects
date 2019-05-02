package StringBuilderTasks;

public class task1 {
    public static void main(String[] args) {
        String [] str = {"a","b","c"};
        System.out.println(buildFrom(str));
        StringBuilder stb=new StringBuilder();
        stb.append("true");
        stb.append("false");
        stb.insert(0,"false");
        stb.delete(2,3);
        System.out.println(toBe(stb));
        String[] str1= {"abc","foo bar","123"};
        System.out.println(trim_post(str1,5));


    }
    public static StringBuilder buildFrom(String[]arr){
        StringBuilder stb = new StringBuilder();

        for (String str: arr){
            stb.append(str);
        }
        return stb;
    }
    public static boolean toBe(StringBuilder stb){
        String str = stb.toString();
        String[] arr = str.split(",");
        boolean result= false;
        for (int i=0; i<arr.length; i++){
            if (arr[i].contains("true")){
                result=true;

            }else {
                result= false;
            }
        }
        return result;
    }
    public static StringBuilder trim_post(String[] arr, int size){
        StringBuilder text = new StringBuilder();

        for (String word: arr){
            if (word.length()<=size){
                text.append("<"+word+">");

            }else {
                continue;
            }
        }
        return text;
    }
}
