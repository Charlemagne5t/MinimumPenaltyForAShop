public class Solution {
    public int bestClosingTime(String customers) {
        char[] customersPresent = customers.toCharArray();
        int yCount = 0;
        for (int i = 0; i < customersPresent.length; i++) {
            if(customersPresent[i] == 'Y'){
                yCount++;
            }
        }
        int currentMinPenalty = yCount;
        int minPenaltyHour = 0;
        int globalMinCount = yCount;

        for (int i = 1; i < customersPresent.length + 1; i++) {
            if(customersPresent[i - 1] == 'Y'){
                currentMinPenalty--;
                if(currentMinPenalty < globalMinCount){
                    globalMinCount = currentMinPenalty;
                    minPenaltyHour = i;
                }
            }else {
                currentMinPenalty++;
            }
        }

        return minPenaltyHour;
    }
}
