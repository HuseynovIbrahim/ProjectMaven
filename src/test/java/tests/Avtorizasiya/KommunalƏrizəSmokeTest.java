package tests.Avtorizasiya;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class KommunalƏrizəSmokeTest extends BaseTest {
    @Test
    public void AsanlaAvtorizeOlmaq(){
        basepage.open("https://publicdevelop.e-taxes.gov.az/eportal/az/login");

        eportalPage.LoginOlmaq();

    }

}
