package motherobjects

import com.sendgrid.helpers.mail.objects.ClickTrackingSetting
import com.sendgrid.helpers.mail.objects.OpenTrackingSetting
import com.sendgrid.helpers.mail.objects.SubscriptionTrackingSetting
import com.sendgrid.helpers.mail.objects.TrackingSettings

class TrackingSettingsMother {

    companion object {
        fun createTrackingSettings(
            clickTrackingSetting: ClickTrackingSetting,
            openTrackingSetting: OpenTrackingSetting,
            subscriptionTrackingSetting: SubscriptionTrackingSetting
        ): TrackingSettings {
            val trackingSettings = TrackingSettings()

            trackingSettings.clickTrackingSetting = clickTrackingSetting
            trackingSettings.openTrackingSetting = openTrackingSetting
            trackingSettings.subscriptionTrackingSetting = subscriptionTrackingSetting

            return trackingSettings
        }
    }
}
