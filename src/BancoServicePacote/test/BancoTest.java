package BancoServicePacote.test;

import BancoServicePacote.domain.BancoService;
import BancoServicePacote.domain.PicPay;
import BancoServicePacote.domain.Santander;

public class BancoTest {
    public static void main(String[] args) {
        PicPay picPay = new PicPay("Ariel", "123");
        Santander santander = new Santander("Sabrina", "234");
        System.out.println(picPay);
        picPay.transferir(santander, 10);
        System.out.println(santander);


    }
}
