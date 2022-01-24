package motherobjects

import com.sendgrid.helpers.mail.objects.Email
import com.sendgrid.helpers.mail.objects.Personalization

class PersonalizationMother {

    companion object {
        fun createPersonalization(emailTo: String, emailCc: String, usernameTemplateData: String, subject: String): Personalization {
            val personalization = Personalization()

            personalization.addTo(Email(emailTo))
            personalization.addBcc(Email("test@email.com"))
            personalization.addCc(Email(emailCc))
            personalization.addDynamicTemplateData("username", usernameTemplateData)
            personalization.subject = subject

            return personalization
        }

        fun createPersonalizationWithMultipleRecipients(emailsTo: List<String>, emailCc: String, usernameTemplateData: String, subject: String): Personalization {
            val personalization = Personalization()

            for (email in emailsTo) {
                personalization.addTo(Email(email))
            }

            personalization.addBcc(Email("test@email.com"))
            personalization.addCc(Email(emailCc))
            personalization.addDynamicTemplateData("username", usernameTemplateData)
            personalization.subject = subject

            return personalization
        }
    }
}
