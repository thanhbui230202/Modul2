package ss12_collection_framework.BT.sum_char;

import java.util.*;

public class CountChar {
public static void main(String[] args){
    String str = "hello words hello";
    str = str.replaceAll(",","");
    String[] arr = str.split(" ");
    String key="";
    Integer value;
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    for(int i=0;i<arr.length;i++){
        key = arr[i];
        if(map.containsKey(key)){
            value = map.get(key);
            map.remove(key);
            map.put(key, value+1);
        } else{
            map.put(key, 1);
        }
    }

    Set set=map.keySet();
    Iterator i = set.iterator();

    while(i.hasNext()){
        key=(String)i.next();
        System.out.println("Từ '"+key+"' xuất hiện "+map.get(key)+" lần");
    }
}
}
