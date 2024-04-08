class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count[]=new int[2];
        for(int i=0;i<students.length;i++){
            count[students[i]]++;
        }
        int remain=sandwiches.length;
        for(int i=0;i<students.length;i++){
            if(count[sandwiches[i]]==0) break;
            if(remain==0) break;
            count[sandwiches[i]]--;
            remain--;
        }
        return remain;
    }
}