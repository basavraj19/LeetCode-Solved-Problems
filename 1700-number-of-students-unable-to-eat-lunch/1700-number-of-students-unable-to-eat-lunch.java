class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int i=0,flag=0;
          while(i<students.length){
            if(students[i]==sandwiches[i]){
                i++;
                flag=0;
            }else{
                students=shuffle(students,i);
                flag++;
                if(flag==students.length-i){
                    return students.length-i;
                }
            }
        }
        return 0;
    }
    
    public int [] shuffle(int student[],int ind){
        for(int i=ind;i<student.length-1;i++){
            int t=student[i];
            student[i]=student[i+1];
            student[i+1]=t;
        }
        return student;
    }
}