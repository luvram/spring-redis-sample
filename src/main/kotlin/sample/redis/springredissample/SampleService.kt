package sample.redis.springredissample

import org.springframework.data.redis.connection.RedisConnection
import org.springframework.data.redis.core.RedisOperations
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.stereotype.Service
import java.util.concurrent.TimeUnit

@Service
class SampleService(
    private val userRedisRepository: UserRedisRepository
) {
    fun create(dto: RequestDto) {
        val user = User(
            id = dto.id,
            name = dto.name,
            age = dto.age
        )
        userRedisRepository.save(user)
    }
}
