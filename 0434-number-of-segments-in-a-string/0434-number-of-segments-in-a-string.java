class Solution {
    public int countSegments(String s) {
        String st[] = s.split("\\s+");
        if (s.equals("")) { return 0; }
        if (st.length == 0) { return 0; }   // <-- fix here
        return st[0].equals("") ? st.length - 1 : st.length;
    }
}