class Solution {
    public boolean canChange(String start, String target) {
        if(start.length() != target.length()){
            return false;
        }

        int src_index = 0;
        int tar_index = 0;

        while(src_index < start.length() || tar_index < target.length()){
            while(src_index < start.length() && start.charAt(src_index) == '_'){
                src_index++;
            }
            while(tar_index < target.length() && target.charAt(tar_index) == '_'){
                tar_index++;
            }

            if(tar_index == target.length() && src_index == start.length()){
                return true;
            }

            if(tar_index == target.length() || src_index == start.length() || start.charAt(src_index) != target.charAt(tar_index)){
                return false;
            }

            if(src_index < start.length() && tar_index < target.length()){
                if(target.charAt(tar_index) == 'L' && src_index < tar_index){
                    return false;
                }
                if(target.charAt(tar_index) == 'R' && src_index > tar_index){
                    return false;
                }
            }
            src_index++;
            tar_index++;
        }  
        return true;  
    }
}