package com.emirates.qa.util;

import com.emirates.qa.base.TestBase;
import java.io.IOException;

public class TestUtil extends TestBase {

    public static long PageLoadTimeOut = 30;
    public static long ImplicitlyWait  = 20;

     public TestUtil() throws IOException {
          super();
     }

     public void switchToFrame() {
        driver
            .switchTo()
            .frame("");
    }

}
