package cn.caojiantao.study.spi.wx;

import cn.caojiantao.study.spi.alert.IAlert;

/**
 * @author caojiantao
 */
public class Alert implements IAlert {

    @Override
    public void warn() {
        System.out.println("WX");
    }
}
