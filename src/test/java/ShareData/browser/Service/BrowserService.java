package ShareData.browser.Service;

import ConfigFile.ConfigNode.DriverConfigNode;

public interface BrowserService {
    void openBrowser(DriverConfigNode driverConfigNode);

    Object getBrowserOptions(DriverConfigNode driverConfigNode);


}
