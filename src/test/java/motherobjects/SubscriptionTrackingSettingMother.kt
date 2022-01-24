package motherobjects

import com.sendgrid.helpers.mail.objects.SubscriptionTrackingSetting

class SubscriptionTrackingSettingMother {

    companion object {
        fun createSubscriptionTrackingSetting(): SubscriptionTrackingSetting {
            val subscriptionTrackingSetting = SubscriptionTrackingSetting()

            subscriptionTrackingSetting.enable = true
            subscriptionTrackingSetting.text = "Thank you, see you soon"

            return subscriptionTrackingSetting
        }
    }
}
