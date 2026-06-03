class LRUCache {

   private class Node {
        private int key;
        private int val;
        Node next;
        Node prev;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private Map<Integer, Node> cache;
    private int cap;

    public LRUCache(int cap) {
        this.cap = cap;
        this.cache = new HashMap<>();

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = cache.get(key);

        if (node == null) {
            return -1;
        }

        moveToHead(node);
        return node.val;
    }

    public void put(int key, int value) {
        Node node = cache.get(key);

        if (node != null) {
            node.val = value;
            moveToHead(node);
        } else {
            Node newNode = new Node(key, value);

            cache.put(key, newNode);
            addToHead(newNode);

            if (cache.size() > cap) {
                Node lru = tail.prev;
                removeNode(lru);
                cache.remove(lru.key);
            }
        }
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }
}
