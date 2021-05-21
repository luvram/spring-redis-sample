package sample.redis.springredissample

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/hash")
class SampleController(
    private val sampleService: SampleService
) {
    @PostMapping
    fun create(@RequestBody body: RequestDto) {
        sampleService.create(body)
    }

    @GetMapping
    fun get(@RequestParam key: String) {

    }
}
