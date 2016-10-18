package naveando.Controller;

import naveando.Service.NaveAndoService;

public class NaveAndoController {

    private final NaveAndoService service;

    public NaveAndoController() {
        service = new NaveAndoService();
    }

    public double procesar(double consumo) {
        return service.procesar(consumo);
    }
}
