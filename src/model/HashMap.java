package model;

import java.util.Map;
import java.util.HashMap.Entry;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月7日上午10:21:29
 */
public class HashMap<K,V> extends java.util.HashMap<K,V>{

	private static final long serialVersionUID = 6404288176693886127L;

	public V put(K key, V value) {
        if (key == null)
            return putForNullKey(value);
        int hash = hash(key);
        int i = indexFor(hash, table.length);
        for (Entry<K,V> e = table[i]; e != null; e = e.next) {
            Object k;
            if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
                V oldValue = e.value;
                e.value = value;
                e.recordAccess(this);
                return oldValue;
            }
        }

        modCount++;
        addEntry(hash, key, value, i);
        return null;
    }

}
