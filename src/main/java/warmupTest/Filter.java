package warmupTest;

public class Filter {
    public String filter(String origin) {
        String vowels = "aeiou";
        for (int i = 0; i < origin.length(); i++) {
            if (vowels.contains(String.valueOf(origin.charAt(i)).toLowerCase())){
                String remove = String.valueOf(origin.charAt(i));
                origin = String.valueOf(origin.replaceAll(remove,"-").toLowerCase());
            }
        }
        return origin.replaceAll("-","").toLowerCase();
    }

    public static void main(String[] args) {
        Filter fl = new Filter();
        System.out.println(fl.filter("qWeRuiopl")) ;
    }
}
