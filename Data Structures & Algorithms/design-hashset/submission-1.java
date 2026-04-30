class MyHashSet {

    private int[] set;
    int end = 0;

    public MyHashSet() {
        set = new int[10000];
    }
    
    public void add(int key) {
        boolean exists = false;
        for(int i = 0; i < end; i++){
            if(key == 0){
                break;
            }
            if(key == set[i]){
                exists = true;
                break;
            }
        }
        if(!exists) {
            set[end] = key;
            end++;
        }
    }
    
    public void remove(int key) {
        int del = end;
        boolean isDel = false;
        for(int i = 0; i<end; i++){
            if(set[i] == key){
                del = i + 1;
                isDel = true;
            }
        }
        if(isDel){
            for(int i = del; i < end; i++){
                set[i-1] = set[i];
            }
            end--;
        }
    }
    
    public boolean contains(int key) {
        for(int i=0; i<end; i++){
            if(set[i] == key) {
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