import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
/**
 * Created by fqlive on 2017/10/14.
 * 获取1.xml中name标签的元素值
 */
public class getName {
    public static void main(String[] args) throws Exception {
               Document document= getDocTrans.getDocument("1.xml");
               NodeList nodeList= document.getElementsByTagName("name");
               for(int i=0;i<nodeList.getLength();i++){
                   System.out.println(nodeList.item(i).getTextContent());
               }

    }

}
