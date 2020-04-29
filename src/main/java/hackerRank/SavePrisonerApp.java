package hackerRank;

public class SavePrisonerApp {
    static int saveThePrisoner(int n, int m, int s) {
        int ans = (m+s-1)%n;
        return ans==0 ? n : ans;
    }

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(7,19,2));
        System.out.println(saveThePrisoner(3,7,3));
    }
}
