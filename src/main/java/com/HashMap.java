package com;

public class HashMap<K, V> implements Map<K, V> {

    int size = 0;

    Entry<K, V> table[] = null;

    public HashMap() {
        table = new Entry[16];
    }

    /**
     * key >> hash >> 数组下标内容 >> 当前内容
     *
     * @param k
     * @param v
     * @return
     */
    @Override
    public V put(K k, V v) {
        int index = hash(k);
        int hash = k.hashCode();
        Entry<K, V> entry = table[index];  //张三
        if (entry == null) { //如果没有对象，则next不指向其他对象，存null
            table[index] = new Entry<K, V>(k, v, null, hash);
            size++;
        } else { //如果不为空
            //put李四，entry是张三,next也指向张三，所以next的值可以传入entry
            table[index] = new Entry<K, V>(k, v, entry, hash);
            size++;
        }

        return table[index].getValue();
    }

    private int hash(K k) {
        int index = k.hashCode() % 16;
        return index >= 0 ? index : -index;
    }

    @Override
    public V get(K k) {
        int index = hash(k);
        Entry<K, V> entry = table[index];
        if (entry == null || size == 0) {
            return null;
        }
        return find(k, entry);
    }

    private V find(K k, Entry<K, V> entry) {

        if (k == entry.getKey() || k.equals(entry.getKey())) {
            return entry.getValue(); //找到了返回
        } else {
            if (entry.next != null) {
                return find(k, entry.next);
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    class Entry<K, V> implements Map.Entry<K, V> {

        K k;
        V v;
        Entry<K, V> next;
        int hash;

        public Entry(K k, V v, Entry<K, V> next, int hash) {
            this.k = k;
            this.v = v;
            this.next = next;
            this.hash = hash;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }
    }
}
