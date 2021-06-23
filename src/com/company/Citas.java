package com.company;

import java.time.LocalDateTime;

public class Citas {
    int id;
    LocalDateTime fechaCita;
    int idDoctor;
    int idPaciente;
    String motivoCita;

    Public Citas (LocalDateTime fecha, int doctorId, int pacienteId, String motivo){
        fechaCita = fecha;
        idDoctor = doctorId;
        idPaciente = pacienteId;
        motivoCita = motivo;


    }
}
