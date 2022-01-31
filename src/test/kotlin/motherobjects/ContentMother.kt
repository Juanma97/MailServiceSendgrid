package motherobjects

import com.sendgrid.helpers.mail.objects.Content

class ContentMother {

    companion object {
        fun createContentEmail(contentType: String, contentValue: String): Content {
            val emailContent = Content()
            emailContent.type = contentType
            emailContent.value = contentValue

            return emailContent
        }
    }
}
