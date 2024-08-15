class Solution {
    public String reorganizeString(String s) {
        int len=s.length(),midlen=0,max=Integer.MIN_VALUE,idx=0;
        char cha='\0';
       
      
            midlen=(len+1)/2;
        

       int arr[]=new int[26];

       for(char c:s.toCharArray()){
          int cal= ++arr[c-'a'];
          if(cal>max){
            max=cal;
            cha=c;
          }
       }
if(max>midlen){
    return "";
}

char[]res=new char[len];
while(arr[cha-'a']-- >0){
    res[idx]=cha;
    idx+=2;
}

for(int i=0;i<26;i++){
    while(arr[i]-- >0){
        if(idx>=len) idx=1;
        res[idx]=(char)(i+'a');
        idx+=2;
    }
}
     return String.valueOf(res);  
       
    }
}