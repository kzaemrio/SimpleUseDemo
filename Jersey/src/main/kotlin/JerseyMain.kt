package me.kz


import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import java.net.URI

fun main() {

    val baseUrl = URI.create("http://localhost:8080/")

    val resourceConfig = ResourceConfig(HelloWorldResource::class.java)
    val server = GrizzlyHttpServerFactory.createHttpServer(
        baseUrl,
        resourceConfig,
        false
    )
    server.start()

    println("$baseUrl${HelloWorldResource.PATH}")
}
