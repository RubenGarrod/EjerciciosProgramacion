
package modelo;

/**
 *
 * @author AlumnoT
 */
public class Alumno {
    private double id_alumno;
    private double nota_primer_parcial;
    private double nota_segundo_parcial;
    private double nota_examen_final;

    public Alumno(double id, double npp, double nsp, double nef) {
        this.id_alumno = id;
        this.nota_primer_parcial = npp;
        this.nota_segundo_parcial = nsp;
        this.nota_examen_final = nef;
    }

    /**
     * @return the id_alumno
     */
    public double getId_alumno() {
        return id_alumno;
    }

    /**
     * @param id_alumno the id_alumno to set
     */
    public void setId_alumno(double id_alumno) {
        this.id_alumno = id_alumno;
    }

    /**
     * @return the nota_primer_parcial
     */
    public double getNota_primer_parcial() {
        return nota_primer_parcial;
    }

    /**
     * @param nota_primer_parcial the nota_primer_parcial to set
     */
    public void setNota_primer_parcial(double nota_primer_parcial) {
        this.nota_primer_parcial = nota_primer_parcial;
    }

    /**
     * @return the nota_segundo_parcial
     */
    public double getNota_segundo_parcial() {
        return nota_segundo_parcial;
    }

    /**
     * @param nota_segundo_parcial the nota_segundo_parcial to set
     */
    public void setNota_segundo_parcial(double nota_segundo_parcial) {
        this.nota_segundo_parcial = nota_segundo_parcial;
    }

    /**
     * @return the nota_examen_final
     */
    public double getNota_examen_final() {
        return nota_examen_final;
    }

    /**
     * @param nota_examen_final the nota_examen_final to set
     */
    public void setNota_examen_final(double nota_examen_final) {
        this.nota_examen_final = nota_examen_final;
    }
    
    public double calcular_media(){
        return (nota_primer_parcial + nota_segundo_parcial + nota_examen_final)/3;
    }
}
