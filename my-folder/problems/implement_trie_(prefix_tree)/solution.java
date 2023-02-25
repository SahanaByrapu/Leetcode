class Trie {

    boolean isWord;
    Trie[] children;
    public Trie() {
        children=new Trie[26];
        isWord=false;
    }
    
    public void insert(String word) {
        
        insert(word,0);
    }
    
    public void insert(String word, int i)
    {
        if(i==word.length())
        {
            isWord=true;
            return;
        }

        char c= word.charAt(i);
        if(children[c-'a']==null)
           children[c-'a']=new Trie();

        children[c-'a'].insert(word,i+1);

    }
    public boolean search(String word) {
        
            return search(word,0);
    }

    public boolean search(String word, int i) 
    {
        if(i==word.length())
          return isWord;

        char ch=word.charAt(i);

        if(children[ch-'a']==null)
            return false;

        return children[ch-'a'].search(word,i+1);

    }
    
    public boolean startsWith(String prefix) {
        
        return startsWith(prefix,0);
    }


    public boolean startsWith(String prefix,int i) {
        
        if(prefix.length()==i)
           return true;

        char ch=prefix.charAt(i);

        if(children[ch-'a']==null)
                return false;

        return children[ch-'a'].startsWith(prefix,i+1);

    }



}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */