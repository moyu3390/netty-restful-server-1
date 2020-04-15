package nxc.com;
import java.util.HashMap;


public class HashMapTest {
    public static void main(String[] args) {

        HashMap<String , Double> codeMap = new HashMap<String , Double>();

        codeMap.put("语文" , 80.0);
        codeMap.put("数学" , 89.0);
        codeMap.put("英语" , 78.2);

        System.out.print(codeMap.get("英语"));
    }
}
