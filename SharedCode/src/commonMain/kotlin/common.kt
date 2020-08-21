/**
 * Created by anahi.salgado on 20/08/2020
 */
expect fun platformName(): String

fun createApplicationScreenMessage(): String {
    return "Ann Rocks on ${platformName()}"
}
