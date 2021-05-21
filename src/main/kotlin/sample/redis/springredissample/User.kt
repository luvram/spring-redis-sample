package sample.redis.springredissample

import org.springframework.data.redis.core.RedisHash

@RedisHash("user")
class User(
    val id: String,
    val age: Int,
    val name: String
) {

}