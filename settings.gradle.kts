plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "SimpleUseDemo"
include("Spring")
include("Tomcat")
include("Jersey")
include("Jetty")
include("Netty")
