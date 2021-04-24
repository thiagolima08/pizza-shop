package br.edu.ifpb.padroes.api.damenos.proxy;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.damenos.DamenosServiceImpl;

import java.util.ArrayList;
import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class DamenosServiceProxy implements DamenosService {

    DamenosService damenosService = new DamenosServiceImpl();
    List<DamenosPizza> cache = new ArrayList<>();

    @Override
    public List<DamenosPizza> getPizzas() {
        // TODO - implementar proxy
        if(cache.isEmpty()) {
            cache = damenosService.getPizzas();
        }

        return cache;
    }
}
