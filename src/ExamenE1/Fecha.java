
package ExamenE1;
public class Fecha {
    public int dia;
    public int mes;
    public int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public Fecha() {
    }

    public int getDia() {
        return dia;
    }

    
    
    
    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31){
            this.dia = dia;
        } else { 
            System.out.println("Ese dia no existe");
        }
    }

    
    
    
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12){
            this.mes = mes;
        } else { 
            System.out.println("Ese mes no existe");
        }
        
        
        
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
    
}

    

