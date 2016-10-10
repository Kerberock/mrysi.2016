package clases;

public class escuela {

    String loc, cve, turno, cedu, dom, next, cp, lada, tel, dmuj, dhom, amuj, ahom;
    
    public escuela(String loc, String cve, String turno, String cedu, String dom, String next, String cp,
            String lada, String tel, String dmuj, String dhom, String amuj, String ahom)
    {
        this.loc = loc;
        this.cve = cve;
        this.turno = turno;
        this.cedu = cedu;
        this.dom = dom;
        this.next = next;
        this.cp = cp;
        this.lada = lada;
        this.tel = tel;
        this.dmuj = dmuj;
        this.dhom = dhom;
        this.amuj = amuj;
        this.ahom = ahom;
    }
    
    public String datos()
    {        
        return "Localidad:\t"+loc+".\nClave:\t"+cve+".\nTurno:\t"+turno+".\nCentro Educativo:\t"+cedu
                +".\nDomicilio:\t"+dom+".\nNúmero exterior:\t"+next+".\nCódigo Postal:\t"+cp
                +".\nLada:\t"+lada+".\nTeléfono:\t"+tel+".\nDocentes mujeres:\t"+dmuj+".\n"
                + "Docentes hombres:\t"+dhom+".\nAlumnos mujeres:\t"+amuj+".\nAlumnos hombres:\t"+ahom+".";
    }
}
