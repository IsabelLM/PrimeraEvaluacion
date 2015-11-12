/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema5.hospital;

/**
 *
 * @author VESPERTINO
 */
public class Run {

    public static void main(String[] args) {
        Medico miMedico;
        MedicoDeCabecera miMedicoDeCabecera;
        Cirujano miCirujano;

        miMedico = new Medico();
        miMedicoDeCabecera = new MedicoDeCabecera();
        miCirujano = new Cirujano();

        //¿Cuántos atributos tiene la clase Cirujano?:1.
        miCirujano.trabajaEnHospital = true;
        //¿Cuántos atributos tiene la clase MedicoDeCabecera?:2. 
        miMedicoDeCabecera.visitaLasCasas = true;
        miMedicoDeCabecera.trabajaEnHospital = true;

        //¿Cuántos métodos tiene la clase Medico?:1.
        miMedico.tratarPaciente();

        //¿Cuántos métodos tiene la clase Cirujano?:2.
        miCirujano.tratarPaciente();
        miCirujano.hacerIncision();

        //¿Cuántos métodos tiene la clase MedicoDeCabecera?:2.
        //¿Puede un MedicoDeCabecera tratar pacientes?:Si.
        //¿Puede un MedicoDeCabecera hacer incisiones?:No.
        miMedicoDeCabecera.aconsejaPacientes();
        miMedicoDeCabecera.tratarPaciente();

        /*
         *¿Por qué aparecen más métodos y propiedades de las definidas en las
         clases en cualquiera de los objetos? Porque son métodos heredados de la clase Object
         */
        miCirujano.getClass();
        miMedicoDeCabecera.hashCode();
        miMedico.notify();
    }

}
