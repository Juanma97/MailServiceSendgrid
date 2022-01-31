package motherobjects

import com.sendgrid.helpers.mail.objects.FooterSetting
import com.sendgrid.helpers.mail.objects.MailSettings
import com.sendgrid.helpers.mail.objects.Setting

class MailSettingsMother {

    companion object {
        fun createMailSettings(footerSetting: FooterSetting, sandboxSetting: Setting): MailSettings {
            val mailSettings = MailSettings()

            mailSettings.footerSetting = footerSetting
            mailSettings.setSandboxMode(sandboxSetting)

            return mailSettings
        }
    }
}
