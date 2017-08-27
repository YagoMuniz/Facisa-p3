package Package1;

import Package2.PublicClassPackage2;

/**
 * @author: Yago Muniz
 * Classe default propriamente implementada para testes de visibilidade
 */
class DefaultClassPackage1 {

    public void method1(){}
    private void method2(){}
    protected void method3(){}
    void method4(){}

    /**
     * Método acessa outros métodos implementados no mesmo pacote.
     *
     * O erro ocorre devido ao method2 ser privado.
     */
    public void accessSamePackage(){
        PublicClassPackage1 pc1 = new PublicClassPackage1();
        pc1.method1();
        pc1.method2(); // Error: Private Method
        pc1.method3();
        pc1.method4();
    }

    /**
     * Método tenta instanciar classe de outro pacote.
     *
     * O erro ocorre pois a classe a ser instanciada é default
     * e só pode ser acessada no mesmo pacote.
     *
     * Não podemos acessar os métodos já que a classe é default.
     */
    public void acessOtherPackageDefaultClass(){
        DefaultClassPackage2 dc2 = new DefaultClassPackage2(); // Error: Default Class
    }

    /**
     * Método acessa métodos da classe pública do pacote 2.
     *
     * O erros ocorrem devido aos modificadores de acesso dos métodos:
     *  method2 -> private;
     *  method3 -> protected;
     *  method4 -> default.
     */
    public void acessOtherPackagePublicClass(){
        PublicClassPackage2 pc2 = new PublicClassPackage2();
        pc2.method1();
        pc2.method2(); // Error: Private Method
        pc2.method3(); // Error: Protected Method
        pc2.method4(); // Error: Default Method
    }
}
