import java.util.HashMap;

class ValidAnagram {

  public boolean isAnagram(String s, String t) {
    HashMap<Character, Integer> hash = new HashMap();
    HashMap<Character, Integer> hash1 = new HashMap();
    int slen = s.length();
    int tlen = t.length();

    if (slen != tlen) {
      return false;
    }

    for (int i = 0; i < slen; i++) {
      if (hash.containsKey(s.charAt(i))) {
        hash.put(s.charAt(i), hash.get(s.charAt(i)) + 1);
      } else {
        hash.put(s.charAt(i), 1);
      }
    }
    for (int i = 0; i < tlen; i++) {
      if (hash1.containsKey(t.charAt(i))) {
        hash1.put(t.charAt(i), hash1.get(t.charAt(i)) + 1);
      } else {
        hash1.put(t.charAt(i), 1);
      }
    }

    for (int i = 0; i < slen; i++) {
      if (hash.get(s.charAt(i)) != hash1.get(s.charAt(i))) {
        return false;
      }
    }

    return true;
  }
}
