package org.jtalks.jcommune.plugin.kaptcha;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KaptchaPluginTest {

    @Test(enabled = false)
    public void testGetHtml() throws Exception {

        KaptchaPlugin kaptchaPlugin = new KaptchaPlugin();
        String pluginId = "1";
        String actual = kaptchaPlugin.getHtml(null, pluginId);
        String expected = "<div class='control-group'>\n" +
                "  <div class='controls captcha-images'>\n" +
                "    <img id='captcha-img' alt='Captcha' src='http://localhost:8080/plugin/1/refreshCaptcha'/>\n" +
                "    <img id='captcha-refresh' alt='Refresh captcha' src='http://localhost:8080/resources/images/captcha-refresh.png'/>\n" +
                "  </div>\n" +
                "  <div class='controls'><input type='text' id='captcha' placeholder='Captcha text' class='input-xlarge'/></div>\n" +
                "</div>";
        assertEquals(actual, expected);
    }
}
