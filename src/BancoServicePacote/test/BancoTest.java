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
        PicPay picPay2 = new PicPay( "marcos", "532");
        PicPay picPay3 = new PicPay( "abel", "053");
        PicPay picPay4 = new PicPay( "bruno", "053");

        Santander santander1 = new Santander("maria", "063");
        Santander santander2 = new Santander("paula", "234");
        Santander santander3 = new Santander("fernandes", "024");

        picPay1.adicionarSaldo(200.0);
        picPay1.transferir(santander1, 100.0);

        List<BancoService> picPayUsuarios = new ArrayList<>(6);
        picPayUsuarios.add(picPay1);
        picPayUsuarios.add(picPay2);
        picPayUsuarios.add(picPay3);
        picPayUsuarios.add(picPay4);

        organizarListaUsuario(picPayUsuarios);


    }

    public static void organizarListaUsuario(List list){
        Collections.sort(list);
        for (Object picPayUsuario : list) {
            System.out.println(picPayUsuario);
        }
    }
}
