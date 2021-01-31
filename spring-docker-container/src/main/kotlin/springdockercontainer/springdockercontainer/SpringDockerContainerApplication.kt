package springdockercontainer.springdockercontainer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDockerContainerApplication

fun main(args: Array<String>) {
	runApplication<SpringDockerContainerApplication>(*args)
}
