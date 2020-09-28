public class StringExample {
    public static void stringReverse(String s){
        // Method = 1
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb.toString());
        System.out.println("Time taken = "+ (System.currentTimeMillis() - startTime)+ " ms");
        // Method = 2
        startTime = System.currentTimeMillis();
        char ca[] = s.toCharArray();
        int caLength = ca.length;
        StringBuffer sbr = new StringBuffer();
        for(int i = caLength-1; i < caLength; i--){
            sbr.append(ca[i]);
            if(i == 0) break;
        }
        System.out.println("Time taken = "+ (System.currentTimeMillis() - startTime)+ " ms");
        System.out.println(sbr);


    }

    public static void palindromeChecker(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        String reverse = sb.toString();
        if(reverse.equals(str)){
            System.out.println(str + " = is palindrome");
        }else{
            System.out.println(str + " = not palindrome");
        }
    }

    public static void capitalizWords(String str){
        String capitalized = "";
        String [] arrayOfString = str.split(" ");
        for(String element : arrayOfString){
            String firstChar = ""+element.charAt(0);
            firstChar = firstChar.toUpperCase();
            String nextChars = element.substring(1);
            capitalized += firstChar + nextChars + " ";
        }
        System.out.println(capitalized);
    }

    public static void reverseEachWords(String str){
        String reversed = "";
        String [] arrayOfString = str.split(" ");
        for(String element : arrayOfString){
            StringBuilder sb = new StringBuilder(element);
            sb.reverse();
            String word = sb.toString();
            reversed += word + " ";
        }

        System.out.println(reversed);
    }

    public static void main(String[] args) {
//        reverseEachWords("hello dhaka");
//        capitalizWords("hello world");
//        capitalizWords("hello world from bangladesh");
//        palindromeChecker("nitins");
//        stringReverse("bangladesh");

    }
}
