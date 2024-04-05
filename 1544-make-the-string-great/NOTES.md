Solution 1: TC O(n)->best case
TC : O(n2) --> Worst case
​
```
class Solution {
public String makeGood(String s) {
while(true){
int res=isGoodString(s);
if(res==-1)
{
return s;
}else{
s=s.substring(0,res)+s.substring(res+2,s.length());
}
}
}
public int isGoodString(String s){
for(int i=0;i<s.length()-1;i++){
int val1=(int)s.charAt(i);
int val2=(int)s.charAt(i+1);
val1=val1-val2;
if(Math.abs(val1)==32){
return i;
}
}
return -1;
}
}
```
​
Solution 2 : Optimal : TC : O(n) and SC O(1)
```
class Solution {
public String makeGood(String s) {
int i=0;
while(i<s.length()-1){
int val1=(int)s.charAt(i);
int val2=(int)s.charAt(i+1);
if(Math.abs(val1-val2)==32){
s=s.substring(0,i)+s.substring(i+2,s.length());
if(i>0){
i--;
}else{
i=0;
}
continue;
}
i++;
}
return s;
}
}
```
​