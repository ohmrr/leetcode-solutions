class ListNode {
    public int key;
    public ListNode next;

    public ListNode(int key, ListNode next) {
        this.key = key;
        this.next = next;
    }

    public ListNode(int key) {
        this.key = key;
        this.next = null;
    }
}

class MyHashSet {
    public int size = ((int) Math.pow(10, 4));
    public ListNode[] set;

    public MyHashSet() {
        this.set = new ListNode[size];
    }
    
    public void add(int key) {
        int index = hash(key);
        ListNode curr = set[index];

        if (curr == null) {
            set[index] = new ListNode(key);
            return;
        }

        while (true) {
            if (curr.key == key) {
                return;
            }

            if (curr.next == null) {
                curr.next = new ListNode(key);
                return;
            }

            curr = curr.next;
        }
    }
    
    public void remove(int key) {
        int index = hash(key);
        ListNode curr = set[index];
        ListNode prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    set[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }

                return;
            }

            prev = curr;
            curr = curr.next;
        }
    }
    
    public boolean contains(int key) {
        int index = hash(key);
        ListNode curr = set[index];

        if (curr == null) {
            return false;
        }

        while (curr != null) {
            if (curr.key == key) {
                return true;
            }

            curr = curr.next;
        }

        return false;
    }

    public int hash(int key) {
        return key % this.size;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
