package motherobjects

import com.sendgrid.helpers.mail.objects.OpenTrackingSetting

class OpenTrackingSettingMother {

    companion object {
        fun createOpenTrackingSetting(): OpenTrackingSetting {
            val openTrackingSetting = OpenTrackingSetting()

            openTrackingSetting.enable = true
            openTrackingSetting.substitutionTag = "%open-tracking"

            return openTrackingSetting
        }
    }
}
