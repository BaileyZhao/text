import org.apache.commons.net.telnet.TelnetClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 根据ip扫描端口
 *
 * @author Mr.Zhao
 * @createTime 2021/3/8 16:13
 */
public class TestConnect {
    public static void main(String[] args) {
        //参数设置
        //IP地址
        String ip = "";
        //默认端口
        String port = "21,22,23,25,69,79,80,110,113,119,135,139,143,443,445,456,554,1080,1158,1433,1434,1521,1723,2100,3389,5000,5631,6379,7001,8080,3128,8081,9080";


        List<String> ipPort = new ArrayList<>();
        ipPort = Arrays.asList(port.split(","));
        List<String> res = new ArrayList<>();
        getRes(ip, ipPort);
        for (String re : res) {
            System.out.println(re);
        }

    }

    private static List<String> getRes(String ip, List<String> ipPort) {
        List<String> res = new ArrayList<>();
        if (ipPort == null || ipPort.size() < 1) {
            return new ArrayList<>();
        }
        for (String s : ipPort) {
            int port = Integer.valueOf(s);
            TelnetClient client = new TelnetClient();
            int timeOut = 3000;
            try {
                client.setConnectTimeout(timeOut);
                client.connect(ip, port);
                res.add(ip + ":" + port + "------OK");
            } catch (IOException e) {
                res.add(ip + ":" + port + "------FAIL");
            } finally {
                try {
                    if (client.isConnected()) {
                        client.disconnect();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;
    }

}
