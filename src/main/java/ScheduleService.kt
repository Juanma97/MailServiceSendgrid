import com.sendgrid.Method
import com.sendgrid.Response

private const val SCHEDULES_ENDPOINT = "user/scheduled_sends"

class ScheduleService: Service() {

    fun cancelSchedule(batchId: String): Response {
        request.method = Method.POST
        request.endpoint = SCHEDULES_ENDPOINT
        request.body = "{\"batch_id\": \"${batchId}\", \"status\": \"cancel\"}"

        return sendgrid.api(request)
    }

    fun pauseSchedule(batchId: String): Response {
        request.method = Method.POST
        request.endpoint = SCHEDULES_ENDPOINT
        request.body = "{\"batch_id\": \"${batchId}\", \"status\": \"pause\"}"

        return sendgrid.api(request)
    }

    fun deleteCancelOrPauseSchedule(batchId: String): Response {
        request.method = Method.DELETE
        request.endpoint = SCHEDULES_ENDPOINT + "/${batchId}"

        return sendgrid.api(request)
    }

    fun retrieveAllSchedules(): Response {
        request.method = Method.GET
        request.endpoint = SCHEDULES_ENDPOINT

        return sendgrid.api(request)
    }
}
