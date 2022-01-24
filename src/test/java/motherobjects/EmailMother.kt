package motherobjects

import com.sendgrid.helpers.mail.objects.Email

class EmailMother {

    companion object {
        fun createEmail(emailAddress: String, recipientName: String): Email {
            val email = Email(emailAddress)
            email.name = recipientName

            return email
        }
    }
}
