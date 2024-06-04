import jakarta.servlet.http.HttpServlet
import org.apache.catalina.startup.Tomcat
import java.io.File


fun main() {
    val port = 8080
    val tomcat = Tomcat()
    tomcat.setPort(port)

    val contextPath = "/"
    val docBase = File(".").absolutePath

    val context = tomcat.addContext(contextPath, docBase)

    val servlet: HttpServlet = HelloWorldServlet()
    val servletName = "HelloWorld"
    val urlPattern = "/HelloWorld"

    tomcat.addServlet(contextPath, servletName, servlet)
    context.addServletMappingDecoded(urlPattern, servletName)

    tomcat.connector
    tomcat.start()

    println("http://localhost:$port$urlPattern")
}
