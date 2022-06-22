package cn.caojiantao.study.spi.alert;

import java.util.ServiceLoader;

/**
 * @author caojiantao
 */
public class AlertFactory {

    public static IAlert getAlert() {
        ServiceLoader<IAlert> list = ServiceLoader.load(IAlert.class);
        for (IAlert iAlert : list) {
            return iAlert;
        }
        return null;
    }
}
