class Solution {
    public int maximumStrongPairXor(int[] nums) {
        List<List<Integer>> strongPairs = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    strongPairs.add(temp);
                }
            }
        }
        int max_xor = 0;
        for(int i=0;i<strongPairs.size();i++){
            max_xor = Math.max(max_xor,strongPairs.get(i).get(0) ^ strongPairs.get(i).get(1));
        }
        return max_xor;
    }
}