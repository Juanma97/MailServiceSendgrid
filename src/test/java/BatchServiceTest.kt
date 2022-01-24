import org.junit.jupiter.api.Test
import utils.TestUtils.Companion.showResponseResult

class BatchServiceTest {

    private val sut: BatchService = BatchService()

    @Test
    fun createBatchId() {
        val response = sut.createBatchId()

        showResponseResult(response)
    }
}
