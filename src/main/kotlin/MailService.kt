import com.sendgrid.Method
import com.sendgrid.Request
import com.sendgrid.Response
import com.sendgrid.helpers.mail.Mail

private const val MAIL_SEND_ENDPOINT = "mail/send"

class MailService: Service() {

    fun sendEmail(mail: Mail): Response {
        val request = Request()
        request.method = Method.POST
        request.endpoint = MAIL_SEND_ENDPOINT
        request.body = mail.build()

        return sendgrid.api(request)
    }
}
