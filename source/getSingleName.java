import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
/**
 * Created by fqlive on 2017/10/14.
 */
public class getSingleName {
    public static void main(String[] args) throws Exception {
        Document document=getDocTrans.getDocument("2.xml");
        NodeList nodeList=document.getElementsByTagName("name");
        System.out.println(nodeList.item(0).getTextContent());
    }
}
