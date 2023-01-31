public class Recursion {

    public static void main(String[] args) {


        final String fullName = "";

        removeLetter(fullName);
    }

    static void removeLetter(String str) { // Add code here
        String fullName = "Mark Joshua Rivera";
        System.out.println(fullName);
        String replaceString = fullName.replaceAll("[AaEeIiOoUu]", "");
        System.out.println(replaceString);     
    }
}
