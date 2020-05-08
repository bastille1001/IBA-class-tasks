package hackerRank;

public class ACMICPC {
    static int[] acmTeamV1(String[] topic) {
        //my code
        int max=0;
        int count=0;

        for(int i=0; i < topic.length - 1; i++){
            for(int j=i+1; j < topic.length; j++){
                char[] line1 = topic[i].toCharArray();
                char[] line2 = topic[j].toCharArray();
                int temp=0;

                for(int k=0; k < line1.length; k++){
                    if (line1[k] == '1') temp++;
                    else if (line2[k] == '1') temp++;
                }
                if (temp > max){
                    max = temp;
                    count = 1;
                }
                else if (temp == max) count++;
            }
        }
        return new int[]{max, count};
    }



}
