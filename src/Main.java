public class Main {
    public static void main(String[] args) {
        /*
        Pizza obxp = new Pizza("normal",true,1,true,"barbacoa",false
        ,false,true,false,false,true);
        System.out.println(obxp.toString());
        */
        Pizza baseBuilder = new BuilderPizzas()
                .setMasa("pan")
                .setTipoMasa(1)
                .setRelleno(true)
                .setSalsa(true)
                .setTipoSalsa("barbacoa")
                .setCebolla(false)
                .setChampiñones(false)
                .setExtraQueso(true)
                .setPiña(false)
                .setSinGluten(false)
                .setJamon(true)


                .build();



        System.out.println("Las pizzas");
    }

}
