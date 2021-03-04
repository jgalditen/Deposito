public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        //Declaracion del objeto
        cuenta1 = new CCuenta();
        cuenta1.setNombre("Antonio López");
        cuenta1.setCuenta("1000-2365-85-1230456789");
        cuenta1.setSaldo(2500);
        cuenta1.setTipoInterés(0);
        
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );
        
        float cantidad = 0;
        operativa_cuenta(cuenta1, cantidad);
    }
    
    static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
    	try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
