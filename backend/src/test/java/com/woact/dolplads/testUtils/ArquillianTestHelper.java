package com.woact.dolplads.testUtils;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

/**
 * Created by dolplads on 25/09/16.
 */
@RunWith(Arquillian.class)
public abstract class ArquillianTestHelper {
    @Deployment
    public static JavaArchive createDeployment() {
        JavaArchive war = ShrinkWrap.create(JavaArchive.class)
                .addPackages(true, "com.woact.dolplads")
                .addPackages(true, "org.apache.commons.codec")
                .addAsResource("META-INF/persistence.xml");

        System.out.println(war.toString(true));
        return war;
    }
}
