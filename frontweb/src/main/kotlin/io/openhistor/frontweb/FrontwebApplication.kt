package io.openhistor.frontweb

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class FrontwebApplication

fun main(args: Array<String>) {
    SpringApplication.run(FrontwebApplication::class.java, *args)
}
