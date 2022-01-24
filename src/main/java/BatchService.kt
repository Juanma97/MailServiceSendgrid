import com.sendgrid.Method
import com.sendgrid.Response

private const val MAIL_BATCH_ENDPOINT = "mail/batch"

class BatchService: Service() {

    fun createBatchId(): Response {
        request.method = Method.POST
        request.endpoint = MAIL_BATCH_ENDPOINT

        return sendgrid.api(request)
    }
}
