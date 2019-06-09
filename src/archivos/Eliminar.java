/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;
import java.io.File;
/**
 *
 * @author Estudiante
 */
public class Eliminar {

    public String eliminar(String ruta) {
        if (ruta != null) {
            eliminar(hayCarpetas(ruta));
            File folder = new File(ruta);
            for (File file : folder.listFiles()) {
                if (file.isFile())
                    file.delete();
            }
            while (hayCarpetas(ruta) != null) 
                eliminar(hayCarpetas(ruta));
            folder.delete();
            return ruta;
        }
        return ruta;
    }

    public String hayCarpetas(String ruta) {
        File folder = new File(ruta);
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) 
                return file.getPath();
        }
        return null;
    }

}
