package sample.redis.springredissample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringRedisSampleApplication

fun main(args: Array<String>) {
    runApplication<SpringRedisSampleApplication>(*args)
}
