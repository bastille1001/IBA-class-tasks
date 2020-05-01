package hackerRank;

public class CloudsApp {
    static int calc(int[] clouds) {
        final int SAFE = 0;
        int len = clouds.length;
        int count = 0;
        int idx = 0;
        while (idx < len - 1) {
            if (idx + 2 < len && clouds[idx + 2] == SAFE) {
                count++;
                idx += 2;
                continue;
            }
            if (idx + 1 < len && clouds[idx + 1] == SAFE) {
                count++;
                idx += 1;
                continue;
            }
            throw new RuntimeException("no way");
        }
        return count;
    }

    public static void main(String[] args) {
        int[] clouds = {0, 0, 0, 1, 0, 1, 0};
        System.out.println(calc(clouds));
    }
}