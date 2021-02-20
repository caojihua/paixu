package com;

public class APP2 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("张三", "张三");
        map.put("李四", "李四");
        map.put("王五", "王五");
        map.put("赵六", "赵六");
        map.put("田七", "田七");
        map.put("王八", "王八");

        for (int i = 0; i < 100; i++) {
            map.put("zzz" + i, "xxxxxxxxxxxxxxx" + i);
//            System.out.println(map.get("zzz" + i));

//            System.out.println(map.get("李四"));
        }
//        System.out.println(map);

        System.out.println(map.get("李四"));
    }

    public void put(String key, String value) {
        System.out.printf("key:%s:::::::::::::::::::::hash:%s:::::::::::::::::::::存储位置:%s\r\n",
                key, key.hashCode(), Math.abs(key.hashCode() % 15));
    }
}
