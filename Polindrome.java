
public class Polindrome {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPolindrome(s))
                System.out.printf("%s is polindrome\n",s);
            else
                System.out.printf("%s is not polindrome\n",s);
        }
    }
    
    public static boolean isPolindrome(String s){
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) { return false;}
        }
        return true;
    }

}
