package cn.caojiantao.study.spi.sms;

import cn.caojiantao.study.spi.alert.IAlert;

/**
 * @author caojiantao
 */
public class SmsAlert implements IAlert {

    @Override
    public void warn() {
        System.out.println("SMS");
    }
}
