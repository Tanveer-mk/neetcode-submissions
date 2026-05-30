class Solution {
    public String simplifyPath(String path) {
        Deque<String> st = new ArrayDeque<>();
        String res = "";

        for (String s : path.split("/")) {
            if (s.length() > 0){
                if (s.equals("..")) {
                    if (st.size() > 0)
                        st.pop();
                } else if (s.equals("."))
                    continue;
                else
                    st.push(s);
            }
        }

        int n = st.size();

        for(int i = 0; i<n; i++){
            res = "/" + st.pop() + res;
        }

        return res.length() > 0 ? res : "/";
    }
}