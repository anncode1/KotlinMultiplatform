import platform.UIKit.UIDevice
/**
 * Created by anahi.salgado on 20/08/2020
 */
actual fun platformName(): String {
    return UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}
