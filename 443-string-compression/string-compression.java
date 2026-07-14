class Solution {
    public int compress(char[] chars) {
     int read = 0;
     int write = 0;
     while(read < chars.length){
        char curr = chars[read];
        int count = 0;
        while(read < chars.length && chars[read] == curr){
            read++;
            count++;
        }
        chars[write] = curr;
        write++;
        if(count > 1){
            String countstr = String.valueOf(count);
            for(int i = 0;i < countstr.length(); i++){
                chars[write] = countstr.charAt(i);
                write++; 
            }
        }
     }
     return write;
    }
}