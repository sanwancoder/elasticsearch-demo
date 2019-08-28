# 安装启动
将下载好的软件解压到目录，依次打开elasticsearch-6.4.1\bin\，
然后双击elasticsearch.bat 即可完成ElasticSearch的安装。
访问：http://localhost:9200 即可看到是否安装成功



# Curl命令
## 查看
```
 curl http://localhost:9200/_cat/
 ```


## 查看集群健康状态
```
curl 'localhost:9200/_cat/health?v'
```

## 查看所有索引
```
curl 'localhost:9200/_cat/indices?v'
```

## 查看集群的节点列表
```
curl 'localhost:9200/_cat/nodes?v'
```

## 创建索引
```
curl -XPUT 'localhost:9200/customer?pretty'
```
## 向索引里面插值
```
插入id为1的数据：

curl -X PUT \
  'http://localhost:9200/customer/external/1?pretty=' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 32' \
  -H 'Content-Type: application/json' \
  -H 'Host: localhost:9200' \
  -H 'Postman-Token: b7311954-9feb-4b77-91ea-b9021b0ecd4c,a5c1e832-4ae6-4a0c-854c-76bf048ee364' \
  -H 'User-Agent: PostmanRuntime/7.15.2' \
  -H 'cache-control: no-cache' \
  -d '{
	
	"name": "Mike",
	"age":30
}'
```


## 查看索引下的数据
```
curl -X GET 'localhost:9200/customer/external/1?pretty'
```

## 删除索引
```
curl 'localhost:9200/_cat/indices?v'
```

## 查询数据

## 参考文章
- [https://www.cnblogs.com/guozp/p/8686904.html](https://www.cnblogs.com/guozp/p/8686904.html)

# 疑难问题解决
```
at java.lang.Thread.run(Thread.java:748) [?:1.8.0_181]
[2019-08-28T21:57:52,636][WARN ][o.e.t.TcpTransport       ] [BJ104350-1] exception caught on transport layer [Netty4TcpChannel{localAddress=/127.0.0.1:9300, remoteAddress=/127.0.0.1:55015}], closing connection
java.lang.IllegalStateException: Received message from unsupported version: [6.4.3] minimal compatible version is: [6.8.0]
        at org.elasticsearch.transport.InboundMessage.ensureVersionCompatibility(InboundMessage.java:137) ~[elasticsearch-7.1.0.jar:7.1.0]
        at org.elasticsearch.transport.InboundMessage.access$000(InboundMessage.java:39) ~[elasticsearch-7.1.0.jar:7.1.0]
        at org.elasticsearch.transport.InboundMessage$Reader.deserialize(InboundMessage.java:76) ~[elasticsearch-7.1.0.jar:7.1.0]
        at org.elasticsearch.transport.TcpTransport.messageReceived(TcpTransport.java:917) ~[elasticsearch-7.1.0.jar:7.1.0]
        at org.elasticsearch.transport.TcpTransport.inboundMessage(TcpTransport.java:753) [elasticsearch-7.1.0.jar:7.1.0]
        at org.elasticsearch.transport.netty4.Netty4MessageChannelHandler.channelRead(Netty4MessageChannelHandler.java:53) [transport-netty4-client-7.1.0.jar:7.1.0]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:323) [netty-codec-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:297) [netty-codec-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.handler.logging.LoggingHandler.channelRead(LoggingHandler.java:241) [netty-handler-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1434) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:965) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:163) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:656) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.nio.NioEventLoop.processSelectedKeysPlain(NioEventLoop.java:556) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:510) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:470) [netty-transport-4.1.32.Final.jar:4.1.32.Final]
        at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:909) [netty-common-4.1.32.Final.jar:4.1.32.Final]
        at java.lang.Thread.run(Thread.java:748) [?:1.8.0_181]
```
