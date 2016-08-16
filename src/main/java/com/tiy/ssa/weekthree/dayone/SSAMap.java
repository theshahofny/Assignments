package com.tiy.ssa.weekthree.dayone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class SSAMap<K, V> implements Map<K,V> {

	@Override
	public abstract V get(Object key);

	@Override
	public abstract V put(K key, V value);

	@Override
	public abstract V remove(Object key);

	@Override 
	public abstract Set<Entry<K,V>> entrySet();

	@Override
	public void clear()
	{
		for (K map : keySet())
			remove(map);
	}

	@Override
	public boolean containsKey(Object key)
	{
		return null != get(key);
	}

	@Override
	public boolean containsValue(Object value)
	{
		for (Entry<K, V> map : entrySet())
            if (map.getValue().equals(value))
                return true;
        return false;
	}

	@Override
	public V getOrDefault(Object key, V defaultValue)
	{
		V retValue;
		if((retValue = get(key)) != null){
			return retValue;
		}
		return defaultValue;
	}

	@Override
	public boolean isEmpty()
	{
		return size() == 0; //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Set<K> keySet()
	{
		Set<K> keySet = new HashSet<>();
		for (Entry <K,V> entry : entrySet()){
			keySet.add(entry.getKey());
		}

		return keySet;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m)
	{
		 for (Map.Entry<? extends K, ? extends V> e : m.entrySet())
			put(e.getKey(), e.getValue());
	}

	@Override
	public V replace(K key, V value)
	{
		
		if(get(key) != null){
			return put(key, value);
		}
		return null;

	}


	@Override
	public int size()
	{
		return entrySet().size();
	}

	@Override
	public Collection<V> values()
	{List<V> collect = new ArrayList<V>();
    for (Entry<K, V> e : entrySet())
        collect.add(e.getValue());
    return collect;
    
	}

}

