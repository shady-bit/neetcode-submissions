class MyHashSet {
    ArrayList<Integer> arr;

    public MyHashSet() {
        arr = new ArrayList<>();
    }

    public void add(int key) {
        if (!arr.contains(key)) {
            arr.add(key);
        }
    }

    public void remove(int key) {
        int index = arr.indexOf(key);
        if (index != -1) {
            arr.remove(index);
        }
    }

    public boolean contains(int key) {
        return arr.contains(key);
    }
}