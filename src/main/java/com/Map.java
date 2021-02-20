package com;

/**
 * Map 接口定义
 * @param <K>
 * @param <V>
 */
public interface Map<K, V> {

    public V put(K k, V v);

    public V get(K k);

    public int size();

    interface Entry<K, V> {
        public K getKey();

        public V getValue();
    }
}
