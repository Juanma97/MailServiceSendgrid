package motherobjects

import com.sendgrid.helpers.mail.objects.ClickTrackingSetting

class ClickTrackingSettingMother {

    companion object {
        fun createClickTrackingSetting(): ClickTrackingSetting {
            val clickTrackingSetting = ClickTrackingSetting()

            clickTrackingSetting.enable = true

            return clickTrackingSetting
        }
    }
}
