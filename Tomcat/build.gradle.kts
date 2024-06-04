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

    // https://mvnrepository.com/artifact/org.apache.tomcat/tomcat-catalina
    implementation("org.apache.tomcat:tomcat-catalina:10.1.24")

    implementation("javax.servlet:javax.servlet-api:3.0.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}