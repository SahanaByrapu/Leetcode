class WordDictionary {

    WordDictionary []children;
    boolean isEndOfword;
    public WordDictionary() {

      children= new WordDictionary[26];
       isEndOfword=false;
    }
    
    public void addWord(String word) {
        
        WordDictionary curr=this;
        for(char c: word.toCharArray())
        {
            if(curr.children[c-'a']==null)
              curr.children[c-'a']=new WordDictionary();

            curr=curr.children[c-'a'];
        }

        curr.isEndOfword=true;
    }
    
    public boolean search(String word) {

       WordDictionary curr=this;
        for(int i=0;i<word.length();i++)
        {
            char c= word.charAt(i);

            if(c=='.') 
            {
                for(WordDictionary wd:curr.children)
                    if(wd!=null && wd.search(word.substring(i+1)))
                        return true;
                return false;

            }
            if(curr.children[c-'a']==null) return false;

            curr=curr.children[c-'a'];
            
        }

        return  curr!=null && curr.isEndOfword;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */