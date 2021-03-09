public class BuilderPizzas {
Pizza _pizza;

    //metodo que devuelva el objeto terminado
    public Pizza build(){
        return _pizza;
    }

    //constructor
    public BuilderPizzas(){
        _pizza = new Pizza();
    }

    public  BuilderPizzas setMasa(String Masa){
        _pizza.setMasa(Masa);
        return this;
    }
    public  BuilderPizzas setRelleno(boolean relleno){
        _pizza.setRelleno(relleno);
        return this;
    }

    public  BuilderPizzas setTipoMasa(int tipoMasa){
        _pizza.setTipoMasa(tipoMasa);
        return this;
    }

    public  BuilderPizzas setSalsa(boolean salsa){
        _pizza.setSalsa(salsa);
        return this;
    }

    public BuilderPizzas setTipoSalsa(String tipoSalsa){
        _pizza.setTipoSalsa(tipoSalsa);
        return this;
    }

    public BuilderPizzas setCebolla(boolean cebolla){
        _pizza.setCebolla(cebolla);
        return this;
    }

    public BuilderPizzas setSinGluten(boolean sinGluten){
        _pizza.setSinGluten(sinGluten);
        return this;
    }

    public BuilderPizzas setExtraQueso(boolean extraQueso){
        _pizza.setExtraQueso(extraQueso);
        return this;
    }

    public BuilderPizzas setPiña(boolean piña){
        _pizza.setPiña(piña);
        return this;
    }

    public BuilderPizzas setChampiñones(boolean champiñones){
        _pizza.setPiña(champiñones);
        return this;
    }

    public BuilderPizzas setJamon(boolean jamon){
        _pizza.setPiña(jamon);
        return this;
    }


}
