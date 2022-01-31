package motherobjects

import com.sendgrid.helpers.mail.objects.Attachments

class AttachmentMother {

    companion object {
        fun createAttachments(content: String, fileName: String, type: String): Attachments {
            val attachments = Attachments()
            attachments.content = content
            attachments.filename = fileName
            attachments.type = type

            return attachments
        }
    }
}
