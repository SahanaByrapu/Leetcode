class Solution {
public:
    int repeatedStringMatch(string a, string b) {
        string cur;
        int res = 0;
        
        while (cur.size() < b.size()) {
            cur += a;
            ++res;
        }
        
        if (cur.find(b) != -1) return res;
        
        cur += a;
        ++res;
        
        if (cur.find(b) != -1) return res;
        return -1;
    }
};