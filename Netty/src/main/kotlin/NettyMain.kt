package me.kz

import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.ChannelInitializer
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.SocketChannel
import io.netty.channel.socket.nio.NioServerSocketChannel
import io.netty.handler.codec.http.HttpServerCodec
import io.netty.handler.codec.http.HttpServerExpectContinueHandler

fun main() {

    val port = 8080

    println("http://localhost:$port${NettyHttpServerHandler.PATH}")

    ServerBootstrap().apply {
        group(NioEventLoopGroup(1), NioEventLoopGroup(1))
        channel(NioServerSocketChannel::class.java)
        childHandler(object : ChannelInitializer<SocketChannel>() {
            override fun initChannel(ch: SocketChannel) {
                ch.pipeline().apply {
                    addLast(HttpServerCodec())
                    addLast(HttpServerExpectContinueHandler())
                    addLast(NettyHttpServerHandler())
                }
            }
        })
    }.bind(port).sync().channel().closeFuture().await()
}