class FileSystem {
   HashMap<String,Integer> filesystem;
    public FileSystem() {
       filesystem=new HashMap<>();
    }
    
    public boolean createPath(String path, int value) {
        
        if(path.isEmpty()|| (path.length()==1 && path.equals("/") ||
        filesystem.containsKey(path)) )
            return false;
        
        int delimIndex=path.lastIndexOf("/");
        String parent=path.substring(0,delimIndex);

        if(parent.length()>1 && !filesystem.containsKey(parent))
          return false;
       
       filesystem.put(path,value);
       return true;
 
    }
    
    public int get(String path) {     
       
         return filesystem.getOrDefault(path,-1);
    }
}

/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * boolean param_1 = obj.createPath(path,value);
 * int param_2 = obj.get(path);
 */