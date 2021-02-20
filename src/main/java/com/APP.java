package com;

public class APP {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<String, String>();

        APP map = new APP();
        map.put("张三", "张三");
        map.put("李四", "李四");
        map.put("王五", "王五");
        map.put("赵六", "赵六");
        map.put("田七", "田七");
        map.put("王八", "王八");

//        System.out.println(map.get("王八"));

    }

    public void put(String key ,String value){
        System.out.printf("key:%s:::::::::::::::::::::hash:%s:::::::::::::::::::::存储位置:%s\r\n",
                key,key.hashCode(),Math.abs(key.hashCode()%15));
    }
}
