package com.study.powersi.Object;

import java.util.*;

public class SetMapList {
    public static void main(String[] args) {
        SetMapList setMapList = new SetMapList();
        List<String> list = new ArrayList<String>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        setMapList.TestArray(list);


        Map<String, String> map = new HashMap<String, String>();
        map.put("one","111");
        map.put("two","222");
        map.put("three","333");
        map.put(null,"444");
        setMapList.TestMap(map);

    }
    //遍历ArrayList
    public List<String> TestArray(List<String> list){
        //第一种方法，For-Each 遍历 List
        for(String e: list) {
            System.out.println("第一种遍历："+e);
        }
        String[] strings = new String[list.size()];
        list.toArray(strings);
        for(int x =0 ; x < strings.length; x++) {
            System.out.println("第二种遍历："+strings[x]);
        }
        //第三种方法，迭代器
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("第三种遍历："+iterator.next());
        }
        return null;
    }
    //遍历Map
    public Map<String,String> TestMap(Map<String,String> map){
        //第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for(String e: map.keySet()) {
            System.out.println("key="+e+",value="+map.get(e));
        }
        //第二种.key-value
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println("key="+next.getKey()+",value="+map.get(next.getKey()));
        }
        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for(Map.Entry<String,String> e: map.entrySet()) {
            System.out.println("key="+e.getKey()+",value="+map.get(e.getKey()));
        }
        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for(String e: map.values()) {
            System.out.println("value="+e);
        }
        return null;
    }
}
