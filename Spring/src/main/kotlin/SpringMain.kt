package me.kz

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {
    val context = AnnotationConfigApplicationContext()
    context.register(AppConfig::class.java)
    context.refresh()

    val service = context.getBean(Service::class.java)
    service.serv()

    val component = context.getBean(Component::class.java)
    component.action()
}
