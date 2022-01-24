package utils

import com.sendgrid.Response

class TestUtils {

    companion object {
        fun showResponseResult(response: Response) {
            println(response.statusCode)
            println(response.body)
            println(response.headers)
        }
    }
}
