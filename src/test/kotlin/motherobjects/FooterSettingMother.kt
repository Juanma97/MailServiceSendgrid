package motherobjects

import com.sendgrid.helpers.mail.objects.FooterSetting

class FooterSettingMother {

    companion object {
        fun createFooterSetting(): FooterSetting {
            val footerSetting = FooterSetting()
            footerSetting.enable = true
            footerSetting.text = "Mi pie de página personalizado"

            return footerSetting
        }
    }
}
