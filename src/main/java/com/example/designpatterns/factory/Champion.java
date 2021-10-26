package com.example.designpatterns.factory;

import com.example.designpatterns.facoryimp.Ahri;
import com.example.designpatterns.facoryimp.Ezreal;
import com.example.designpatterns.facoryimp.Yasuo;
import com.example.designpatterns.facoryimp.Yone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Champion  {
    @Autowired
    private Ezreal ezreal ;
    @Autowired
    private Ahri ahri ;
    @Autowired
    private Yasuo yasuo;
    @Autowired
    private Yone yone ;

    public   static final Map<String,Lolchampion> champlist = new HashMap<String,Lolchampion>();

    @Autowired
    private  Champion (List<Lolchampion> champions)
    {
        for (Lolchampion champ : champions)
        {
            champlist.put(champ.getChampname(),champ);
        }
    }

    public static Lolchampion createChamp(String name) {
        return champlist.get(name);
    }
}
