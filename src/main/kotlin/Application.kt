import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main(arguments: Array<String> = arrayOf()) {
    val embeddedServer = embeddedServer(Netty, 8080) {
        routing {
            get("/") {
                call.respondText("Hello Ktor", ContentType.Text.Html)
            }
        }
    }
    embeddedServer.start(wait = true)
}