package clases;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

public class ejecutaApp {

    JFileChooser seleccionador;
    manejaArchivo manejador;
    int sel;
    String ruta;
    List<String> lista;
    
    ejecutaApp()
    {
        seleccionador = new JFileChooser();
        sel = seleccionador.showDialog(seleccionador, "Seleccione el archivo de datos");
        
        if (sel == JFileChooser.OPEN_DIALOG)
            {
                ruta = seleccionador.getSelectedFile()+"";
                manejador = new manejaArchivo(ruta);
                lista = manejador.leetxt(); // Aquí se generará la lista con la información de las escuelas
                if (lista!=null)
                manejador.creaCarpetas(lista);
                else
                    System.out.println("No se ha podido cargar la lista correctamente.");
            }                
    }
    
    public static void main(String[] args) throws InterruptedException
    {
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    splash inicio = new splash();
                    Thread.sleep(3500);
                    inicio.parar();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ejecutaApp.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Throwable ex) {
                    Logger.getLogger(ejecutaApp.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        
        Thread hilo0 = new Thread(new Runnable() {
            @Override
            public void run() {
                int cont=0;
                while (hilo.isAlive()) {cont++; System.out.println(cont);}
                new ejecutaApp();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        hilo.start();
        hilo0.start();
    }
    
}
