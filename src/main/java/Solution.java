class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int y = 0;
        for (char ch : customers.toCharArray()) {
            if (ch == 'Y') {
                y++;
            }
        }
        int res = 0;
        int min = y;
        int cur = y;
        for (int i = 0; i < n; i++) {
            char ch = customers.charAt(i);
            if (ch == 'Y') {
                cur--;
            } else {
                cur++;
            }
            if (cur < min) {
                min = cur;
                res = i + 1;
            }
        }

        return res;
    }
}