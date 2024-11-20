import java.util.HashMap;

class ValidAnagram {

  public boolean isAnagram(String s, String t) {
    HashMap<Character,Integer> hash = new HashMap();
    HashMap<Character,Integer> hash1 = new HashMap();
    int slen =s.length();
    int tlen =t.length();

    if(slen!=tlen){
      return false;
    }

    for(int i=0;i<slen;i++){
      hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i),0)+1);
      hash1.put(t.charAt(i), hash1.getOrDefault(t.charAt(i),0)+1);
    }



    return hash.equals(hash1);
  }
}
