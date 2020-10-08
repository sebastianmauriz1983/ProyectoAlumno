package com.example.alumnoseba.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "alumno")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Audited
public class Alumno extends Base{


    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "email")
    private String email;
    @Column(name = "createAr")
    private Date createAr;


}
