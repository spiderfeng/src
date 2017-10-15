import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;

/**
 * Created by fqlive on 2017/10/15.
 * 向p1中添加一个sex="nv"的子节点
 */
public class addNode {
    public static void main(String[] args) throws Exception {
        Document document=getDocTrans.getDocument("2.xml");
        NodeList nodeList=document.getElementsByTagName("p1");
        Node node=nodeList.item(0);
        //创建sex节点
        Element element=document.createElement("sex");
        Text text=document.createTextNode("女");
        element.appendChild(text);//不需要加返回节点
        node.appendChild(element);//直接调用
        //回写
        getDocTrans.trans(new DOMSource(document),new StreamResult("2.xml"));
    }
}
