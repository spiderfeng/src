# src
近期学了javaweb前端有关xml文件解析的内容，这里面有两种解析器，dom解析和sax解析，针对dom解析提供了三种解析技术，分别是sun公司提供了针对dom和sax的解析器 jaxp；
dom4j组织针对dom和sax解析器开发dom4j(实际开发中使用)以及jdom组织针对dom和sax解析器开发的jdom。
本次编程主要是针对jaxp解析技术而言的，采用相关方法实现对xml文档某一节点的增删改查
其中 getName()主要是遍历1.xml中name标签的元素值
     getSingleName()主要是得到1.xml中第一个name标签的元素值
     addNode()在2.xml中添加一个<sex>女</sex>节点
     delNode()在2.xml中删除<sex>女</sex>节点
     modifyNode()修改2.xml中sex的标签值为男
     listNodes()遍历2.xml中的所有标签并打印出来
     getDocTrans()这里面提供了两个方法 1. getDocument()方法，主要是获取对xml解析的文档；2，trans()是对修改后的文档进行回写。
这里需要注意的就是程序运行时注意addNode(),delNode()与modifyNode()的顺序问题。
