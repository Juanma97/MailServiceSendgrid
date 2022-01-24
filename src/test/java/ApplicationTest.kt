import org.junit.jupiter.api.Test

internal class ApplicationTest {

    private val sut: Application = Application()
    private val from = "juanma97perez@gmail.com"
    private val to = "juanma.perez@autentia.com"

    @Test
    fun should_send_simple_content_email() {
        val content = "Content"
        val subject = "Subject"

        val response = sut.sendEmail(from, to, content, subject)

        println(response.statusCode)
        println(response.headers)
    }

    @Test
    fun should_send_html_content_email() {
        val content = "This is a <i>HTML</i> <b>test</b>" // Teniendo en cuenta que el content type esta a text/html
        val subject = "Subject" // En el subject no admitiria HTML

        val response = sut.sendEmail(from, to, content, subject)

        println(response.statusCode)
        println(response.headers)
    }

    @Test
    fun should_send_html_content_email_with_template() {
        val content = "This is a <i>HTML</i> <b>test</b>"
        val subject = "Subject"
        val isTemplate = true

        val response = sut.sendEmail(from, to, content, subject, isTemplate)

        println(response.statusCode)
        println(response.headers)
    }

    @Test
    fun should_send_email_with_attachments() {
        val response = sut.sendEmailWithAttachment(from, to)

        println(response.statusCode)
        println(response.headers)
    }

    @Test
    fun should_send_advanced_email() {
        val response = sut.sendAdvancedEmail(from, to)

        println(response.statusCode)
        println(response.body)
        println(response.headers)
    }

    @Test
    fun should_send_email_with_associated_batch_id() {
        val response = sut.sendEmailsWithBatchId()

        println(response.statusCode)
        println(response.body)
        println(response.headers)
    }

    @Test
    fun create_batch_id() {
        val response = sut.createBatchId()

        println(response.statusCode)
        println(response.body)
        println(response.headers)
    }

    @Test
    fun is_valid_batch_id() {
        val response = sut.isValidBatchId()

        println(response.statusCode)
        println(response.body)
        println(response.headers)
    }

    @Test
    fun retrieve_cancel_schedule_sends() {
        sut.retrieveAllCancelledSchedules()
    }

    @Test
    fun cancel_schedule_sends() {
        sut.cancelSchedule()
    }

}
