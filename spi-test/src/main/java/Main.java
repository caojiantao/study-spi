import cn.caojiantao.study.spi.alert.AlertFactory;
import cn.caojiantao.study.spi.alert.IAlert;

/**
 * @author caojiantao
 */
public class Main {

    public static void main(String[] args) {
        IAlert alert = AlertFactory.getAlert();
        alert.warn();
    }
}
