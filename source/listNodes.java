import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/**
 * Created by fqlive on 2017/10/15.
 * 遍历xml中所有的节点，打印出节点名称
 */
public class listNodes {
    public static void main(String[] args) throws Exception {
        Document document=getDocTrans.getDocument("2.xml");
       // Node parentNode=document.getElementById("person");
        listNode(document);
    }
    private static void listNode(Node parentNode) {
        if(parentNode.getNodeType()==Node.ELEMENT_NODE) System.out.println(parentNode.getNodeName());
        NodeList nodeList=parentNode.getChildNodes();
        for(int i=0;i<nodeList.getLength();i++){
            listNode(nodeList.item(i));
        }
    }
}
