package com.self.text;

import java.util.*;


/** map根据value和key排序
 *
 * @author Mr.Zhao
 * @createTime 2021/3/15 9:56
 */
public class TestMap {
    public static void main(String[] args) {
        //way 1
        Map<Character, Integer> map = new HashMap<>(16);
        List<Object> objects = new ArrayList<>();
        map.put('a', 2);
        map.put('b', 1);
        map.put('c', 11);
        map.put('d', 6);
        map.put('e', 9);
        map.put('f', 3);
        map.put('A', 11);
        map.put('B', 15);
        map.put('C', 6);
        map.put('D', 23);
        map.put('E', 20);
        map.put('F', 14);
        map.put('G', 4);

        ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                //a.compareTo(b)的结果是int，1 表示a>b,-1表示b>a，0表示相等，
                int i = o2.getValue().compareTo(o1.getValue());
                //相等时比较key的值
                if (i == 0) {
                    return o1.getKey().compareTo(o2.getKey());
                }
                return i;
            }
        });

        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


        //list 对多个属性排序
        List<TestBO> testBOS = new ArrayList<>();

        TestBO testBO8 = new TestBO();
        testBO8.setValue(10);
        testBO8.setKey('b');
        testBOS.add(testBO8);

        TestBO testBO = new TestBO();
        testBO.setValue(10);
        testBO.setKey('f');
        testBOS.add(testBO);

        TestBO testBO7 = new TestBO();
        testBO7.setValue(10);
        testBO7.setKey('h');
        testBOS.add(testBO7);


        TestBO testBO9 = new TestBO();
        testBO9.setValue(10);
        testBO9.setKey('E');
        testBOS.add(testBO9);

        TestBO testBO2 = new TestBO();
        testBO2.setValue(6);
        testBO2.setKey('b');
        testBOS.add(testBO2);

        TestBO testBO3 = new TestBO();
        testBO3.setValue(12);
        testBO3.setKey('C');
        testBOS.add(testBO3);
        TestBO testBO4 = new TestBO();
        testBO4.setValue(7);
        testBO4.setKey('D');
        testBOS.add(testBO4);
        TestBO testBO5 = new TestBO();
        testBO5.setValue(2);
        testBO5.setKey('j');
        testBOS.add(testBO5);
        Collections.sort(testBOS, new Comparator<TestBO>() {
            @Override
            public int compare(TestBO o1, TestBO o2) {
                int i = o2.getValue().compareTo(o1.getValue());
                if(i==0){
                    return  o1.getKey().compareTo(o2.getKey());
                }
                return i;
            }
        });

        for (TestBO bo : testBOS) {
            System.out.println(bo.getKey()+":"+bo.getValue());
        }


    }
}
