package net.leonw.kotlinwebclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class KotlinWebclientApplication

fun main(args: Array<String>) {
	runApplication<KotlinWebclientApplication>(*args)
}

@RestController
class TestResource {
	@GetMapping("/bla")
	fun bla() : String {
		return "bla"
	}
}