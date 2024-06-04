package me.kz

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.ServletContextHandler
import org.eclipse.jetty.servlet.ServletHolder

fun main() {

    val port = 8080
    val path = "/HelloWorld"

    val holder = ServletHolder(HelloWorldServlet())

    val handler = ServletContextHandler()
    handler.addServlet(holder, path)

    val server = Server(port)
    server.handler = handler
    server.start()

    println("http://localhost:$port$path")
}
