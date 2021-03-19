package com.self.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mr.Zhao
 * @createTime 2021/3/9 11:19
 */
public class Test {
    public static void main(String[] args) {
//        String s="正在 Ping 82.156.111.64 具有 32 字节的数据:来自 82.156.111.64 的回复: 字节=32 时间=25ms TTL=53来自 82.156.111.64 的回复: 字节=32 时间=25ms TTL=53来自 82.156.111.64 的回复: 字节=32 时间=24ms TTL=53来自 82.156.111.64 的回复: 字节=32 时间=24ms TTL=5382.156.111.64 的 Ping 统计信息:    数据包: 已发送 = 4，已接收 = 4，丢失 = 0 (0% 丢失)，往返行程的估计时间(以毫秒为单位):    最短 = 24ms，最长 = 25ms，平均 = 24ms\n";
//        Pattern p = Pattern.compile("((?<=TTL=)[0-9]*(?=来自))");
//        Matcher m = p.matcher(s);
//        while(m.find()){
//            String group = m.group();
//            System.out.println(group);
//        }
        String name = "东山林场";
        String substring = name.substring(0, 2);
        System.out.println(substring);

    }
}
