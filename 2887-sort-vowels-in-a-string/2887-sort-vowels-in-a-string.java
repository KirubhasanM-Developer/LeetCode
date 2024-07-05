class Solution {
    public String sortVowels(String s) {
        char ch[]=s.toCharArray();
        List<Character>li=new ArrayList<>();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                li.add(ch[i]);
                ch[i]=' ';
            }
}
Collections.sort(li);
for(int i=0;i<ch.length;i++){
    if(ch[i]==' '){
        ch[i]=li.get(0);
        li.remove(0);
    }
}
return new String(ch);

        
    }
}