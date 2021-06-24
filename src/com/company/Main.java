package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {
        public static void main(String[]args) throws IOException {
            String inputFilename = "C:\\Users\\Antonio\\Desktop\\Gittest\\EvidenciaComputacionJava\\Doctores.csv";
            String outputFilename = "C:\\Users\\Antonio\\Desktop\\Gittest\\EvidenciaComputacionJava\\Doctores.csv";

            BufferedReader bf = new BufferedReader(new FileReader(inputFilename));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilename, true));

            String line;
            Scanner in = new Scanner(System.in);

            System.out.print("¿Que acción deseas realizar? Estas son las opciones: \n Presiona D para dar de alta un doctor \n Presiona P para dar de alta un paciente \n Presiona C para agendar una cita\n");

            line = in.next();
            if (line.equals("D")) {
                System.out.print("Ingresa el nombre del doctor\n");
                String nombreDoctor = in.next();
                System.out.print("Ingresa la especialidad del doctor\n");
                String especialidadDoctor = in.next();
                Doctor doctorInfo = new Doctor(nombreDoctor, especialidadDoctor);
                creaDoctor(doctorInfo, bw);
            } else if (line == "P") {
                String hola;
            } else if (line == "C") {
                String bye;

            } else {
                System.out.print("selecciona una de las opciones disponibles");
            }


        }

    public static void creaDoctor(Doctor doctorInfo, BufferedWriter bw) throws IOException {
        bw.write(doctorInfo.id);
        bw.write(",");
        bw.write(doctorInfo.nombreDoctor);
        bw.write(",");
        bw.write(doctorInfo.esp);
        bw.write("\n");
        bw.close();

    }
    public static void creaPaciente(Pacientes pacienteInfo, BufferedWriter bw) throws IOException {
        bw.write(pacienteInfo.id);
        bw.write(",");
        bw.write(pacienteInfo.nombrePaciente);
        bw.write("\n");
        bw.close();

    }
    public static void creaCita(Citas citaInfo, BufferedWriter bw) throws IOException {
        bw.write(citaInfo.id);
        bw.write(",");
        bw.write(citaInfo.fechaCita.toString());
        bw.write(",");
        bw.write(citaInfo.motivoCita);
        bw.write(",");
        bw.write(citaInfo.idDoctor);
        bw.write(",");
        bw.write(citaInfo.idPaciente);
        bw.write("\n");
        bw.close();

    }
}
