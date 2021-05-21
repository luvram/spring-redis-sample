package sample.redis.springredissample

import org.springframework.data.repository.CrudRepository

interface UserRedisRepository : CrudRepository<User, String> {
}