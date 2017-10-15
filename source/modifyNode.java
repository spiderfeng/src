import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
/**
 * Created by fqlive on 2017/10/15.
 * 修改sex的text值为男
 */
public class modifyNode {
    public static void main(String[] args) throws Exception {
        Document document=getDocTrans.getDocument("2.xml");
        NodeList nodeList=document.getElementsByTagName("sex");
        Node node=nodeList.item(0);
        node.setTextContent("男");
        //回写节点值
        getDocTrans.trans(new DOMSource(document),new StreamResult("2.xml"));
    }
}
