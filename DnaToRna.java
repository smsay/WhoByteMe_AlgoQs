public class DnaToRna {

    public static void main(String[] args) {
        System.out.println(dnaToRna("TTCCTTCC"));
    }
    public static String dnaToRna(String dna) {
        return dna.replaceAll("T", "U");
    }
}
