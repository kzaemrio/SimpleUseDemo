package me.kz

class ServiceImp: Service {
    override fun serv() {
        println("MyServiceImp serv: ${hashCode()}")
    }
}
