package me.kz

import org.springframework.stereotype.Component

@Component
class Component(private val service: Service) {
    fun action() = service.serv()
}
