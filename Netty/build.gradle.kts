plugins {
    kotlin("jvm")
}

group = "me.kz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.netty:netty-codec-http:4.1.110.Final")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}