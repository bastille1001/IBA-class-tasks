package hackerRank;

public class KangarooApp {
    static boolean check(int x1, int v1, int x2, int v2){
        return x1<x2 && v1<v2;
    }

    static boolean result(int x1, int v1, int x2, int v2){
        return v1 != v2 && (x2-x1)%(v1-v2) == 0;
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (check(x1, v1, x2, v2)) return "NO";

        if (result(x1, v1, x2, v2)) return "YES";
        else return "NO";


//        String res = "";
//        if((x1<x2) && (v1<v2))
//            res = "NO";
//        else{
//            if((v1!=v2) && ((x2-x1)%(v1-v2))==0)
//                res = "YES";
//            else
//                res = "NO";
//        }
//        return res;
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(0,3,4,2));
    }
}
