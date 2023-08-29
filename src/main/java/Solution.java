public class Solution {
    public int bestClosingTime(String customers) {
        char[] customersPresent = customers.toCharArray();


        int currentMaxScore = 0;
        int maxScoreHour = 0;
        int globalMaxCount = 0;

        for (int i = 1; i < customersPresent.length + 1; i++) {
            if(customersPresent[i - 1] == 'Y'){
                currentMaxScore++;
                if(currentMaxScore > globalMaxCount){
                    globalMaxCount = currentMaxScore;
                    maxScoreHour = i;
                }
            }else {
                currentMaxScore--;
            }
        }

        return maxScoreHour;
    }
}
