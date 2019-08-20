/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto09classecliente;

/**
 *
 * @author aluno
 */
public class Projeto09ClasseCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Um objeto c1 do tipo da classe Cliente,
        sendo instanciado por meio do operador NEW
        que chama o método construtor Cliente()*/
        Cliente c1 = new Cliente("1234", "Felipe", "12345-00", "Promissa", "SP");
        System.out.println(c1.getRG());
        c1.setRG("4321");
        System.out.println(c1.getRG());
    }
    
}
