package com.tiy.ssa.weekthree;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
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
		for (Entry<K, V> entry : entrySet())
			remove(entry);
	}

	@Override
	public boolean containsKey(Object key)
	{
		return null != get(key);
	}

	@Override
	public boolean containsValue(Object value)
	{
		return null != get(value);
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
		for (K map : keySet()){
			keySet.add(map);
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
		V value2 = remove(get(key));
		if(value2 == value){
			return value;
		}
		else return put(key, value);

	}


	@Override
	public int size()
	{
		int counter = 0;
		for(K map : keySet()){
			counter++;
		}
		return counter;  
	}

	@Override
	public Collection<V> values()
	{
//		if (values == null) {
//			            values = new AbstractCollection<V>() {
//			                public Iterator<V> More ...iterator() {
//			                    return new Iterator<V>() {
//			                        private Iterator<Entry<K,V>> i = entrySet().iterator();
//			
//			                        public boolean More ...hasNext() {
//			                            return i.hasNext();
//			                        }
//			
//			                        public V More ...next() {
//			                            return i.next().getValue();
//			                        }
//			
//			                        public void More ...remove() {
//			                            i.remove();
//			                        }
//			                    };
//			                }
//			
//			               public int More ...size() {
//			                    return AbstractMap.this.size();
//			                }
//			
//			                public boolean More ...isEmpty() {
//			                    return AbstractMap.this.isEmpty();
//			                }
//			
//			                public void More ...clear() {
//			                    AbstractMap.this.clear();
//			                }
//			
//			                public boolean More ...contains(Object v) {
//			                    return AbstractMap.this.containsValue(v);
//			                }
//			            };
//			        }
		      return values();

	}

}

