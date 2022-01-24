import org.junit.jupiter.api.Test
import utils.TestUtils.Companion.showResponseResult

class ScheduleServiceTest {

    private val sut: ScheduleService = ScheduleService()

    @Test
    fun deleteCancelOrPauseSchedule() {
        val response = sut.deleteCancelOrPauseSchedule("N2MzMWQ2YjUtN2QwMS0xMWVjLThjYzgtMDJmNTk0MzFiYWE4LWQ0YmY1ZTNkMQ")

        showResponseResult(response)
    }

    @Test
    fun retrieveAllSchedules() {
        val response = sut.retrieveAllSchedules()

        showResponseResult(response)
    }


}
