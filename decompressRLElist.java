    
    # 1313.
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> decompressed = new ArrayList<>();
        
        for(int i =0; i < nums.length; i=i+2) {    
            for(int j =0; j < nums[i]; j++){
                decompressed.add(nums[i+1]);
            }
        }
        
        int[] ret = new int[decompressed.size()];
        for (int i=0; i < ret.length; i++) {
            ret[i] = decompressed.get(i).intValue();
        }
        return ret;
    }
