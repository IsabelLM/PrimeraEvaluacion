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
        
        //Cirujano tiene un atributo
        miCirujano.trabajaEnHospital=true;
        //Medico de cabecera tiene dos atributos
        miMedicoDeCabecera.visitaLasCasas=true;
        miMedicoDeCabecera.trabajaEnHospital=true;
        
        //Medico tiene un atributo         
        miMedico.tratarPaciente();
        
        //Cirujano tiene 2 metodos
        miCirujano.tratarPaciente();
        miCirujano.hacerIncision();
        
        //MedicoDeCabecera tiene dos metodos
        miMedicoDeCabecera.aconsejaPacientes();
        miMedicoDeCabecera.tratarPaciente();
        
        //Metodos heredado de Medico.
        miMedicoDeCabecera.tratarPaciente();
        
        //Metodo heredado pero modificado.
        miCirujano.tratarPaciente();
        
        //Metodos heredado de la clase Object
        miCirujano.getClass();
        miMedicoDeCabecera.hashCode();
        miMedico.notify();
    }

}
