package crp.kr.api.common.dataStructure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * packageName: crp.kr.api.common.dataStructure
 * fileName : Trunk
 * author  : 권혜민
 * date   : 2022-05-12
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-12     권혜민       최초 생성
 */
//Hash

public class Trunk<K, V> {
    private final HashMap<K, V> map;

    public Trunk(){map = new HashMap<>();}
    public void put(K k , V v){map.put(k , v);}
    public void replace(K k , V v){map.replace(k ,v);}
    public void remove(K k , V v){map.remove(k , v);}
    public List<V> values(){return map.values().stream().collect(Collectors.toList());}
    public V get(int id){return map.get(id);}
    public int size(){return map.size();}
    public void clear(){map.clear();}




}
