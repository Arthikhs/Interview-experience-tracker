class Solution {
    public List<String> buildArray(int[] target, int n) {

        List<String> result = new ArrayList<>();

        int index = 0;

        for (int num = 1; num <= n && index < target.length; num++) {

            // Every number from the stream is pushed
            result.add("Push");

            if (num == target[index]) {
                // We need this number
                index++;
            } else {
                // We don't need this number
                result.add("Pop");
            }
        }

        return result;
    }
}