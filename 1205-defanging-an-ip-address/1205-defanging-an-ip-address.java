class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sc=new StringBuilder();
        String ar[]=address.split("\\.");
        for(int i=0;i<ar.length;i++){

           if(i!=ar.length-1)
               { sc.append(ar[i]+"[.]");}
               else   {sc.append(ar[i]);}
        }
        return sc.toString();
        
    }}