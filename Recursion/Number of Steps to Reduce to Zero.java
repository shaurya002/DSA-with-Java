class Solution {
    public int numberOfSteps(int num) {
        int step = 0;
        int res = helper(step, num);
        return res;
    }

    public int helper(int step, int num){
        if(num==0){
            return step;
        }
        if(num%2==0){
            num/=2;
            step++;
            return helper(step, num);
        }else{
            num-=1;
            step++;
            return helper(step, num);
        }
    }
}
