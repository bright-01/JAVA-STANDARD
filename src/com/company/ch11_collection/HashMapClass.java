package com.company.ch11_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapClass {
    /**
     * Map
     * Key value 묶어서 저장
     * 키는 중복 허용하지 않고 벨류는 중복 허용
     * Hashtable ( 동기화 x) == HashMap ( 동기화 O )
     * LinkedHashMap 순서를 사용
     * TreeMap == TreeSet
     *
     * Hash --> key를 넣으면 index를 알려줌 ( 해시 함수가 알려준다 ) - 저장하고 읽어오기
     * 해당 인덱스에 가서 같은 키한 데이터를 찾는다.
     *
     * put - add
     * putall ( Map m )
     * object remove (Object key )
     * Object replace ( object key, object value)
     * Object get(object key)
     *
     *
     *
     * */

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myUd", 1234);

        if(!map.containsKey("1234")){

        }


        HashMap map2 = new HashMap();
        map2.put("test1", 112);
        map2.put("test2", 113);
        map2.put("test3", 114);
        map2.put("test4", 115);
        map2.put("test5", 116);

        Set set1 = (Set) map2.entrySet(); // key, value 값을 묶어서 가져온다
        Iterator it = set1.iterator();

        while( it.hasNext()){
            Map.Entry e= (Map.Entry) it.next();
            System.out.println(e.getKey() + "" + e.getValue());
        }

        set1  = map2.keySet(); // 키만 가져옴




    }
}
