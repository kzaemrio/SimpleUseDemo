package me.kz

import io.netty.channel.ChannelFutureListener
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.SimpleChannelInboundHandler
import io.netty.handler.codec.http.*

class NettyHttpServerHandler : SimpleChannelInboundHandler<HttpObject>() {
    override fun channelRead0(ctx: ChannelHandlerContext, msg: HttpObject) {
        if (msg is HttpRequest && msg.uri() == PATH) {
            DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK).apply {
                content().writeBytes("hello world".toByteArray())
            }
        } else {
            DefaultHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.NOT_FOUND)
        }.apply {
            ctx.writeAndFlush(this).addListener(ChannelFutureListener.CLOSE)
        }
    }

    companion object {
        const val PATH = "/HelloWorld"
    }
}
