package com.self.text;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mr.Zhao
 * @createTime 2021/3/9 10:30
 */

public class TestCmd {
    public static void main(String[] args) {
        try {
            Process exec = Runtime.getRuntime().exec("ping 82.156.111.64");
            BufferedReader in = new BufferedReader(new InputStreamReader(exec
                    .getInputStream(),"GBK"));
            String string = null;
            StringBuffer buf = new StringBuffer();
            while ((string = in.readLine()) != null) {
                buf.append(string);
            }
            String s = buf.toString();
            Pattern p = Pattern.compile("TTL=");
            Matcher matcher = p.matcher(s);
            String group = matcher.group();

            System.out.println(buf);

        exec.destroy();
        } catch (Exception e) {

        } finally {

        }

    }
}
