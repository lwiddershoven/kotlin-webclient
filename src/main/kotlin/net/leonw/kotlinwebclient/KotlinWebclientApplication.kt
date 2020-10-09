package net.leonw.kotlinwebclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinWebclientApplication

fun main(args: Array<String>) {
	runApplication<KotlinWebclientApplication>(*args)
}
