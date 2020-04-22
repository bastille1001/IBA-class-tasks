package hackerRank;

import java.util.Arrays;
import java.util.List;

public class BirthdayChocolateApp {


    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1,1,1,1,1,1);
        System.out.println(birthdayChocolate(data,3,2));
    }

    static int birthdayChocolate(List<Integer> s, int d, int m) {
        int result = 0;
        int sum=0;
        for(int i=0;i<s.size()-(m-1);i++){
            for(int j=i;j<i+(m);j++){
                sum+=s.get(j);
            }
            if(sum==d ){
                result++;
            }
            sum=0;
        }
        return result;
    }
}
