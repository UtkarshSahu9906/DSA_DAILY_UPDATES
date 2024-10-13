public class MajorityElement {
    public static void main(String[] args) {
        int nums[]={1,1,2,2,3,4,5,6,3,3,3,3,3,3,3};

        System.out.println(majorityElement(nums));
        
    }

    static int majorityElement(int[] nums){
        int freq = 0;
        int out = 1;

        for (int i = 0; i < nums.length; i++) {

            if (freq == 0) {
                out = nums[i];
            }
            if (out == nums[i]) {
                freq++;
            } else {
                freq--;
            }

        }
        return out;

        
    }
    
    }

