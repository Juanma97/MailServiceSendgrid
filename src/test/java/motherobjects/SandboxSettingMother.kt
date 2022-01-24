package motherobjects

import com.sendgrid.helpers.mail.objects.Setting

class SandboxSettingMother {

    companion object {
        fun createSandboxSetting(): Setting {
            val sandboxSetting = Setting()
            sandboxSetting.enable = false

            return sandboxSetting
        }
    }
}
