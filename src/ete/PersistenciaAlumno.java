package ete;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

class PersistenciaAlumno {

    ArrayList<Alumno> alumno;

    //Generamos el metodo para serializar a nuestro usuario
    public void guardar(Alumno a) {
        //Para serializar el primer paso es generar el archivo fisico donde
        //estara nuestro objeto de tipo usuario
        File file = new File("calificaciones.ext");

        if (file.exists()) {
            alumno = recobrarAlumnos();
        }
        else{
            alumno = new ArrayList<>();
        }

        try {
            //Despues lo abrimos para escribir sobre el
            FileOutputStream fos = new FileOutputStream(file);
            
            //Serializamos
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            //Guardamos nuestro usuario
            alumno.add(a);
            
            oos.writeObject(alumno);
            //Ponemos un mensajito
            System.out.println("Objeto Guardado con Exito");

        } catch (Exception e) {

        }
    }

    public ArrayList<Alumno> getAlumno(int cuenta) {
        return alumno;
    }

    public void setAlumno(ArrayList<Alumno> alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumno> recobrarAlumnos() {
        File file = new File("calificaciones.ext");

        ArrayList<Alumno> recobrado = null;

        try {
            //El proceso inverso
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            recobrado = (ArrayList<Alumno>) ois.readObject();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al recuperar");
        }

        return recobrado;

    }

}
