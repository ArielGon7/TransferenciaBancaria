package BancoServicePacote.test;

import BancoServicePacote.domain.BancoService;
import BancoServicePacote.domain.PicPay;
import BancoServicePacote.domain.Santander;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BancoTest {
    public static void main(String[] args) {
        PicPay picPay1 = new PicPay( "paulo", "123");
        Santander santander1 = new Santander("maria", "063");

        picPay1.adicionarSaldo(500);
        System.out.println(picPay1);
        picPay1.pagarBoleto(300);
        System.out.println(picPay1);

    }




    public static void organizarListaUsuario(List list){
        Collections.sort(list);
        for (Object picPayUsuario : list) {
            System.out.println(picPayUsuario);
        }
    }
}
