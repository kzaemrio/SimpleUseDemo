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

    implementation("org.eclipse.jetty:jetty-server:11.0.21")
    implementation("org.eclipse.jetty:jetty-servlet:11.0.21")
    implementation("org.eclipse.jetty:jetty-slf4j-impl:11.0.21")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}