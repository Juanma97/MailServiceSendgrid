import ApiKey.Companion.API_KEY
import com.sendgrid.Request
import com.sendgrid.SendGrid

open class Service {
    protected val sendgrid = SendGrid(API_KEY)
}
