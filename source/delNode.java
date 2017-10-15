import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * Created by fqlive on 2017/10/15.
 * 删除sex节点
 */
public class delNode  {
    public static void main(String[] args) throws  Exception{
        Document document=getDocTrans.getDocument("2.xml");
        NodeList nodeList=document.getElementsByTagName("sex");
        Node node=nodeList.item(0);
        //获取第一个父节点
        Node parentNode=node.getParentNode();
        parentNode.removeChild(node);
        getDocTrans.trans(new DOMSource(document),new StreamResult("2.xml"));
    }


}
