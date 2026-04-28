class MyHashSet {

    ArrayList <Integer> set = new ArrayList<>();

    public MyHashSet() {
        
    }
    
    public void add(int key) {
        boolean exists = false;
        for(int i : set){
            if(i == key) {
                exists = true;
                break;
            }
        }
        if(!exists) set.add(key);
    }
    
    public void remove(int key) {
        for(int i = 0; i<set.size(); i++){
            if(set.get(i) == key){
                set.remove(i);
            }
        }
    }
    
    public boolean contains(int key) {
        boolean exists = false;
        for(int i : set){
            if(i == key) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */